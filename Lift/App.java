import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    @Override
    public void start(Stage arg0) throws IOException{
        // TODO Auto-generated method stub
        Parent root = FXMLLoader.load(getClass().getResource("Lift.fxml"));
        Scene s = new Scene(root);
        arg0.setTitle("Lift");
        arg0.setScene(s);
        arg0.show();
    }
public static void main(String[] args){
    launch(args);
}}