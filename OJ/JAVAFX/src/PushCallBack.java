
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PushCallBack implements MqttCallback {
//    private byte[] message;
    private String message;
    //方式二：传应用


    private mycontroler bb;
    //方式一：传数据
    private ObservableList<String> items;

    public ObservableList<String> getItems() {
        return items;
    }

    public void setItems(ObservableList<String> items) {
        this.items = items;
    }

    public void connectionLost(Throwable cause) {
        System.out.println(items);
        System.out.println("掉线!");
    }

    public void deliveryComplete(IMqttDeliveryToken token) {
        //System.out.println("deliveryComplete---------" + token.isComplete());
    }
    public String getmessage(){
        return message;
    }

    public void messageArrived(String topic, MqttMessage message) throws Exception {
        // subscribe��õ�����Ϣ��ִ�е�������
//		System.out.println("������Ϣ���� : " + topic);
//		System.out.println("������ϢQos : " + message.getQos());
        this.message=new String(message.getPayload());
        System.out.println(new String(message.getPayload()));
//       方式一：传数据
//		Platform.runLater(new Runnable(){
//			public void run(){
//				items.add(new String(message.getPayload()));
//			};
//		});
//      方式二：传应用
//        chatter.addItem(new String(message.getPayload()));
        bb.addItem(new String(message.getPayload()));



        File f = new File("JAVAFX\\chatlog\\" + topic + ".txt");

        FileOutputStream fop = new FileOutputStream(f, true);
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        Date date = new Date();
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String shijian = time.format(date.getTime());
        String content=new String(message.getPayload());
        String[] strings=content.split(":");
        String username=strings[0];
        String neirong="";
        for (int i=1;i<strings.length;i++)
            neirong+=strings[i];
        writer.append(username+"\t"+shijian+"\n"+neirong+"\n");
        writer.close();
        fop.close();
        //System.out.println("���д�С="+items.size());
    }


    public mycontroler getmycontroler(){
        return bb;
    }
    public void setmycontroler(mycontroler bb){
        this.bb=bb;
    }
}
