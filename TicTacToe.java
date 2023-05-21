import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class TicTacToe extends Application {
    @Override
    public void start(Stage primaryStage){
        //primaryStage.setMinWidth(300);
        //primaryStage.setMinHeight(300);
        //primaryStage.setMaxWidth(300);
        //primaryStage.setMaxHeight(300);

        GridPane leftpane = new GridPane();

        VBox leftVbox = new VBox(new ImageView("image/x.gif"), new ImageView("image/o.gif"));
        VBox cntrlVbox = new VBox(new ImageView("image/x.gif"), new ImageView("image/o.gif"));
        VBox rightVbox = new VBox(new ImageView("image/x.gif"), new ImageView("image/o.gif"));

        leftpane.setHgap(10);
        leftpane.setVgap(10);

        leftpane.addColumn(0, leftVbox);
        leftpane.addColumn(1,cntrlVbox);
        leftpane.addColumn(2,rightVbox);

        GridPane cntrPane = new GridPane();


        Scene scene = new Scene(leftpane, 200,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
