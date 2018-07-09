import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class BB extends Application {
//    private MQTT client=null;

    @Override
    public void start(Stage primaryStage) {
        try{
//            client = new MQTT();
//		PushCallBack callback = new PushCallBack() ;
//		callback.setBB(this);
//		client.start(callback);
            Parent root= FXMLLoader.load(getClass().getResource("bbbb.fxml"));

            Scene scene=new Scene(root);
            scene.getStylesheets().add("style.css");

            primaryStage.setTitle("BB聊天室登录窗口");
            primaryStage.setScene(scene);

            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("alg.png")));
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public Chatter getChatter() {
//        return BB;
//    }
//
//    public void setChatter(Chatter chatter) {
//        this.BB = BB;
//    }

    public static void main(String[] args) {
        launch(args);
    }
}
