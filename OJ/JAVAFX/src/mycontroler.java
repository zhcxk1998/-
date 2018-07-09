import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.io.*;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class mycontroler implements Initializable {
    private PushCallBack callback = null;
    private MQTT client = null;
    private ObservableList<String> item = FXCollections.observableArrayList("");

    public void addItem(String msg) {
        Platform.runLater(new Runnable() {
            public void run() {

                item.add(msg);
            }
            ;
        });
    }


    public static String name = "BB";
    public static String theme = "";
    public static String string = "";
    public static String topic = "";
    public static String key = "";
    public static String log = "";
    public static int flag = 1;

    @FXML
    private TextArea test;
    @FXML
    private ComboBox emmm;
    @FXML
    private Button search;
    @FXML
    private TextField addtheme;
    @FXML
    private ImageView image;
    @FXML
    private Button kaishi;
    @FXML
    private javafx.scene.control.Label label;
    @FXML
    private ChoiceBox choice;
    @FXML
    private ListView list;
    @FXML
    private Text text;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private ProgressIndicator jindutiao;
    @FXML
    private TextField text1;
    @FXML
    private PasswordField psd1;
    @FXML
    private TextArea content;


    @FXML
    public void loginAction(javafx.event.ActionEvent event) throws IOException {
        int userflag = 1;
        int passflag = 1;
        if (text1.getText().trim().equals("")) {
            userflag = 0;
        }

        if (psd1.getText().trim().equals("")) {
            passflag = 0;
        }
        if (userflag == 1 && passflag == 1) {
            if (login(text1.getText().trim(), psd1.getText().trim())) {
                ((Node) (event.getSource())).getScene().getWindow().hide();
            }
        }
    }

    @FXML
    private void registAction(javafx.event.ActionEvent event) throws IOException {
        int flag = 1;
        if (text1.getText().trim().equals("")) {
            window("请输入用户名！");
            flag = 0;
        }

        if (psd1.getText().trim().equals("")) {
            window("请输入密码！");
            flag = 0;
        }
        if (flag == 1)
            regist(text1.getText().trim(), psd1.getText().trim());

    }

    @FXML
    public void fasong() {
        content.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.ENTER)) {
                    try {
                        sendaction(theme);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private boolean login(String username, String password) throws IOException {
        File f = new File("JAVAFX\\account\\account.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String s = null;
        int nameflag = 0;
        int passflag = 0;
        while ((s = reader.readLine()) != null) {
            String[] user = new String[2];
            int pos = 0;
            for (String temp : s.split(" ")) {
                user[pos] = temp;
                pos++;
            }
            if (user[0].equals(username)) {
                nameflag = 1;
                if (user[1].equals(password)) {
                    passflag = 1;
                }
                break;
            }
        }
        if (nameflag == 1) {
            if (passflag == 1) {
                this.name = username;
                loginsuccess();
                window("用户：" + name + " 登陆成功！");
            } else {
                window("密码错误！");
            }

        } else {
            loginfail();
            window("用户不存在！");

        }
        return nameflag == 1 && passflag == 1;
    }


    private void window(String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("我是弹窗~");
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void regist(String username, String password) throws IOException {
        File f = new File("JAVAFX\\account\\account.txt");
//        RandomAccessFile faf=new RandomAccessFile(f,"rw");

        BufferedReader reader = new BufferedReader(new FileReader(f));
        String s = null;
        int flag = 1;
        while ((s = reader.readLine()) != null) {
            String[] user = new String[2];
            int pos = 0;
            for (String temp : s.split(" ")) {
                user[pos] = temp;
                pos++;
            }
            if (user[0].equals(username)) {
                flag = 0;
                window("用户名已存在！");
                break;
            }
        }
        if (flag == 1) {
            FileOutputStream fop = new FileOutputStream(f, true);
            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
            writer.append(username + " ");
            writer.append(password + "\n");
            writer.close();
            fop.close();

            window("注册成功！");
        }
    }


    private void loginsuccess() throws IOException {
        Parent anotherRoot = null;
        try {
            anotherRoot = FXMLLoader.load(getClass().getResource("theme.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage anotherStage = new Stage();
        Scene scene = new Scene(anotherRoot);
        scene.getStylesheets().add("boss.css");


        anotherStage.setTitle("BB聊天室");
        anotherStage.setScene(scene);

        anotherStage.getIcons().add(new Image(getClass().getResourceAsStream("聊天.png")));
        anotherStage.show();
    }

    private void loginfail() {
    }


    public void sendaction(String themename) throws IOException {
        if (content.getText().equals("") || content.getText().equals("请输入内容！")) {
            content.setText("请输入内容！");
        } else {
//            Date date = new Date();
//            SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String shijian = time.format(date.getTime());
//            File f = new File("JAVAFX\\chatlog\\" + themename + ".txt");
//
//            FileOutputStream fop = new FileOutputStream(f, true);
//            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
//            writer.append(callback.getmessage()+"\n");
//            writer.close();
//            fop.close();

            chatlog(themename + ".txt");
            try {
                client.sendMessage(MQTT.TOPIC, content.getText());
            } catch (MqttException e) {
                e.printStackTrace();
            }
            content.clear();

        }
    }

    public void chatlog(String themename) throws IOException {
        File f = new File("JAVAFX\\chatlog\\" + themename);
        if (!f.exists())
            f.createNewFile();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            list.setItems(FXCollections.observableArrayList(" "));
            e.printStackTrace();
        }
        String s = null;
        String xiaoxi = "";
        int i = 1;

        while (true) {
            if ((s = reader.readLine()) == null) {
                break;
            }
            xiaoxi += s + "\n";
            i++;
        }
        string = xiaoxi;
        if (i == 1)
            string = "";
//        try {
//                client.sendMessage(MQTT.TOPIC, xiaoxi);
//            } catch (MqttException e) {
//                e.printStackTrace();
//            }
//        ObservableList items = FXCollections.observableArrayList(xiaoxi);

//        list.setItems(items);
    }

    @FXML
    public void selecttheme() throws IOException {
//        list.setItems(FXCollections.observableArrayList(name + " 已加入聊天室！"));
        File f = new File("JAVAFX\\theme.txt");
        BufferedReader reader = new BufferedReader(new FileReader(f));

        kaishi.setText("点我刷新");
        String s = "";
        String zhuti = "";
        String[] themelist;
        zhuti += "请选择主题\n";
        while (true) {
            if ((s = reader.readLine()) == null) break;
            zhuti += s + "\n";

        }
        themelist = zhuti.split("\n");
        emmm.setItems(FXCollections.observableArrayList(themelist));
        emmm.getSelectionModel().select(0);
        emmm.getSelectionModel().selectedIndexProperty().addListener(((observable, oldValue, newValue) -> {
            try {
                if (themelist[newValue.intValue()].equals("请选择主题")) {
                    image.setVisible(true);
                    image.setManaged(true);
                    list.setItems(FXCollections.observableArrayList(" "));
                    label.setText("BB聊天室");
                    window("请选择主题！");
                } else {
                    image.setVisible(false);
                    image.setManaged(false);
                    label.setText("当前：" + themelist[newValue.intValue()]);
                    theme = themelist[newValue.intValue()];
                    chatlog(themelist[newValue.intValue()] + ".txt");
                    ObservableList emm = FXCollections.observableArrayList(string);
//                    list.setItems(emm);
                    client.setTopic(themelist[newValue.intValue()]);
                    item = FXCollections.observableArrayList(emm);
                    list.setItems(item);
//                    System.out.println(themelist[newValue.intValue()]);
                    System.out.println(client.TOPIC);
                }

            } catch (IOException e) {
//                list.setItems(FXCollections.observableArrayList(" "));
                e.printStackTrace();
            }
        }));
    }

    @FXML
    public void start(javafx.event.ActionEvent event) throws IOException {
        selecttheme();
        if (flag == 1) {
            client = new MQTT();
            callback = new PushCallBack();
            callback.setmycontroler(this);
            client.start(callback);
            client.setclientid(name);
            flag=0;
        }
        list.setItems(FXCollections.observableArrayList(" "));
//        emm();
    }

    @FXML
    public void send(javafx.event.ActionEvent event) throws IOException {
        sendaction(theme);
    }

    @FXML
    public void tianjiatheme(javafx.event.ActionEvent event) throws IOException {
        jiatheme(addtheme.getText().trim());
        addtheme.clear();
        window("添加成功！");
    }

    public void jiatheme(String theme) throws IOException {
        File f = new File("JAVAFX\\theme.txt");
        FileOutputStream fop = new FileOutputStream(f, true);
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        writer.append("\n" + theme);
        writer.close();
        fop.close();
    }


    public void searchfromtheme() throws IOException {
        try {


            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("查找聊天记录");
            dialog.setHeaderText("");
            dialog.setContentText("请输入想要查找的主题\n(输入“全部”以搜索所有主题的记录)");
            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                if (result.get().equals("全部")) {
                    File file = new File("JAVAFX\\chatlog");
                    File[] fs = file.listFiles();
                    TextInputDialog emm = new TextInputDialog();
                    emm.setTitle("查找聊天记录");
                    emm.setHeaderText("您想要查询的是全部主题！");
                    emm.setContentText("请输入想要查找的内容");
                    Optional<String> ooo = emm.showAndWait();
                    if (ooo.isPresent()) {
                        String item = ooo.get();
                        this.key = item;
                        this.log = "您想要查找的记录如下：\n关键词为：" + key + "!\n\n";
                        for (File f : fs) {
                            log += "\n\n#主题：" + f.getName().replace(".txt", "") + "的记录\n↓ ↓ ↓\n\n";
                            search(item, f);
                        }
                        list.setItems(FXCollections.observableArrayList(log));
                        log = "您想要查找的记录如下：\n关键词为：" + key + "!\n\n";
                    }
                } else {
                    this.topic = result.get();
                    TextInputDialog emm = new TextInputDialog();
                    emm.setTitle("查找聊天记录");
                    emm.setHeaderText("您想要查询的是：" + topic);
                    emm.setContentText("请输入想要查找的内容");
                    Optional<String> ooo = emm.showAndWait();
                    if (ooo.isPresent()) {
                        String item = ooo.get();
                        this.key = item;
                        this.log = "您想要查找的记录如下：\n关键词为：" + key + "!\t当前主题为：" + topic + "\n↓↓↓\n\n";
                        File f = new File("JAVAFX\\chatlog\\" + topic + ".txt");
                        search(item, f);
                        list.setItems(FXCollections.observableArrayList(log));
                        log = "您想要查找的记录如下：\n关键词为：" + key + "!\n\n";
                    }
                }
            }
        } catch (IOException e) {
            list.setItems(FXCollections.observableArrayList(""));
            window("该主题不存在！");
        }
    }


    public void search(String item, File f) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(f));
        String s = null;
        String just = "";
        int flag = 1;
        while ((s = reader.readLine()) != null) {
            if (s.contains("\t"))
                just = s;
            else if (s.contains(item)) {
                log += just + "\n" + s + "\n\n";
                flag = 0;
            }
        }
        if (flag == 1) {
            log += "该主题无此关键词记录！\n\n";
        }
//        list.setItems(FXCollections.observableArrayList(log));
    }

    @FXML
    public void fromtheme() throws IOException {
        searchfromtheme();
    }

    //    public void emm(){
//        ObservableList<String> options=FXCollections.observableArrayList(
//                "1","2","3"
//        );
////        emmm.setItems(options);
//    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}