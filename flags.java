import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class flags extends Application{
    @Override
    public void start(Stage primaryStage){
        
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);

        ImageView chinaFlag = new ImageView("image/china.gif");
        chinaFlag.setFitWidth(100);
        chinaFlag.setFitHeight(100);
        
        ImageView ukFlag = new ImageView("image/uk.gif");
        ukFlag.setFitHeight(100);
        ukFlag.setFitWidth(100);

        ImageView usFlag = new ImageView("image/us.gif");
        usFlag.setFitHeight(100);
        usFlag.setFitWidth(100);

        ImageView canadaFlag = new ImageView("image/ca.gif");
        canadaFlag.setFitHeight(100);
        canadaFlag.setFitWidth(100);

        pane.addColumn(0, ukFlag,chinaFlag);
        pane.addColumn(1, canadaFlag,usFlag);


        Scene pageScene = new Scene(pane, 220,240);
        primaryStage.setTitle("Exercise 14.01");
        primaryStage.setScene(pageScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}