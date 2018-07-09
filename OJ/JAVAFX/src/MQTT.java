
import org.eclipse.paho.client.mqttv3.*;

//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;

import org.eclipse.paho.client.mqttv3.MqttCallback;
//import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MQTT {
    public static final String HOST = "tcp://120.79.146.91:1883";
    //	public static final String HOST="tcp://127.0.0.1:8000";
    public static String TOPIC = "chat";
    private String clientid = "";

    public String getClientid() {

        return clientid;
    }

    public void setclientid(String id) {
        this.clientid = id;
    }

    public void setTopic(String TOPIC) {
        try {
            client.unsubscribe(this.TOPIC);
        } catch (MqttException e) {
            e.printStackTrace();
        }
        this.TOPIC = TOPIC;
        try {
            client.subscribe(this.TOPIC, 1);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void setClientid(String clientid) {

        this.clientid = clientid;
    }

    private MqttClient client;
    private MqttConnectOptions options;
    private String userName = "guest";
    private String passWord = "guest";

//	private ScheduledExecutorService scheduler;

    public void start(MqttCallback callBack) {
        try {
            // hostΪ��������clientid������MQTT�Ŀͻ���ID��һ����Ψһ��ʶ����ʾ��MemoryPersistence����clientid�ı�����ʽ��Ĭ��Ϊ���ڴ汣��
            client = new MqttClient(HOST, clientid, new MemoryPersistence());
            // MQTT����������
            options = new MqttConnectOptions();
            // �����Ƿ����session,�����������Ϊfalse��ʾ�������ᱣ���ͻ��˵����Ӽ�¼����������Ϊtrue��ʾÿ�����ӵ������������µ��������
            options.setCleanSession(true);
            // �������ӵ��û���
            options.setUserName(userName);
            // �������ӵ�����
            options.setPassword(passWord.toCharArray());
            // ���ó�ʱʱ�� ��λΪ��
            options.setConnectionTimeout(10);
            // ���ûỰ����ʱ�� ��λΪ�� ��������ÿ��1.5*20���ʱ����ͻ��˷��͸���Ϣ�жϿͻ����Ƿ����ߣ������������û�������Ļ���
            options.setKeepAliveInterval(20);
            // ���ûص�
            client.setCallback(callBack);
            MqttTopic topic = client.getTopic(TOPIC);
            // setWill�����������Ŀ����Ҫ֪���ͻ����Ƿ���߿��Ե��ø÷������������ն˿ڵ�֪ͨ��Ϣ
            options.setWill(topic, "close".getBytes("UTF-8"), 2, true);

            client.connect(options);
            // ������Ϣ
            int[] Qos = {1};
            String[] topic1 = {TOPIC};
            client.subscribe(topic1, Qos);
//            this.sendMessage(MQTT.TOPIC, );


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String topic, String msg) throws MqttException, IOException {
        Date date = new Date();
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String shijian = time.format(date.getTime());
//        String content = getClientid() + "\t" + shijian + "\n" + msg;
        String content = getClientid() + ":" + msg;
//        File f = new File("JAVAFX\\chatlog\\" + topic + ".txt");
//
//        FileOutputStream fop = new FileOutputStream(f, true);
//        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
//        writer.append(content + "\n");
//        writer.close();
//        fop.close();
        //�˴���Ϣ��ֻ��Ҫ���� byte ���鼴�ɣ������������͵���Ϣ����������ɶ��������ݵ�ת����
        final MqttMessage message = new MqttMessage(content.getBytes("UTF-8"));
        message.setQos(1);
        client.publish(topic, message);
    }

    public static void main(String[] args) throws MqttException, UnsupportedEncodingException {
        MQTT client = new MQTT();
        client.start(new PushCallBack());
//		client.sendMessage(MQTT.TOPIC, "R U Ok?");
    }
}

