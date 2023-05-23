/*
(Color and font) Write a program that displays five texts vertically, as shown in
Figure 14.44a. Set a random color and opacity for each text and set the font of
each text to Times Roman, bold, italic, and 24 pixels.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Random;


public class ColorAndFont extends Application {
    @Override
    public void start(Stage primaryStage){

        Scene scene = new Scene(showLabels(),500,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Label[] javaFxTexts(Label[] allTexts){
        Font textFont = new Font("Times Roman",24);
        for (int i = 0;i<allTexts.length; i++){
            Random rand = new Random();
            double opacity = rand.nextDouble(1);

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            allTexts[i] = new Label("JavaFX");
            allTexts[i].setFont(textFont);
            allTexts[i].setStyle("-fx-font-weight:bold; -fx-font-style:italic;");
            allTexts[i].setOpacity(opacity);
            allTexts[i].setTextFill(Color.rgb(red,green,blue));
            allTexts[i].setRotate(90);
        }
        return allTexts;
    }
    public GridPane showLabels(){
        Label[] allLabels = new Label[5];
        javaFxTexts(allLabels);

        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);

        for (int i = 0;i<allLabels.length;i++){
            pane.addRow(3, allLabels[i]);
        }

        return pane;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
