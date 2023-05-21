import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class TicTacToe extends Application {
    @Override
    public void start(Stage primaryStage){
        //primaryStage.setMinWidth(300);
        //primaryStage.setMinHeight(300);
        //primaryStage.setMaxWidth(300);
        //primaryStage.setMaxHeight(300);

        GridPane cntrPane = new GridPane();

        ImageView[] imageViewsArray = new ImageView[3];
        imageViewsArray[0] = new ImageView("image/x.gif");
        imageViewsArray[1] = new ImageView("image/o.gif");
        imageViewsArray[2] = new ImageView("image/usIcon.gif");

        String[] newArr = {"image/x.gif", "image/o.gif","image/white.jpg"};



        Scene scene = new Scene(randomTileSelection(newArr,cntrPane), 200,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public GridPane randomTileSelection(String[] urls, GridPane gridpane){

        Pane[] distnctPanes = new Pane[9];
        Random rand = new Random();
        int randomPosition;

        //Creating a VBox array and Assigning its values
        VBox leftboxes = new VBox();
        VBox cntrlBox = new VBox();
        VBox rightBox = new VBox();

        for (int i = 0; i < 9;i++){
            randomPosition = rand.nextInt(3);
            distnctPanes[i] = new Pane(new ImageView(urls[randomPosition]));
        }

        //Assigning the randomly generated Tiles
        leftboxes.getChildren().addAll(distnctPanes[0],distnctPanes[1],distnctPanes[2]);
        cntrlBox.getChildren().addAll(distnctPanes[3],distnctPanes[4],distnctPanes[5]);
        rightBox.getChildren().addAll(distnctPanes[6],distnctPanes[7],distnctPanes[8]);

        gridpane.addColumn(0, leftboxes);
        gridpane.addColumn(1, cntrlBox);
        gridpane.addColumn(2, rightBox);

        return  gridpane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
