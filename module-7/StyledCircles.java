/* Paul Fralix Assignment M7 11/30/2025 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class StyledCircles extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle c1 = new Circle(50);
        c1.getStyleClass().add("whiteBlackStroke");

        Circle c2 = new Circle(50);
        c2.getStyleClass().add("whiteBlackStroke");
        c2.setId("redCircle");

        Circle c3 = new Circle(50);
        c3.getStyleClass().add("whiteBlackStroke");
        c3.setId("greenCircle");

        Circle c4 = new Circle(50);
        c4.getStyleClass().add("whiteBlackStroke");

        HBox box = new HBox(20);
        box.getChildren().addAll(c1, c2, c3, c4);

        Scene scene = new Scene(box, 400, 150);

        scene.getStylesheets().add(getClass().getResource("mystyle.css").toExternalForm());

        primaryStage.setTitle("Styled Circles Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
