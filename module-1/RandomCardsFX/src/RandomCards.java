/**
 *  Paul Fralix 10/24/2025 CSD420 Assignment M1
 *  
 *  This JavaFX program displays four randomly selected playing card images
 *  from a deck of 52 cards stored in a "cards" subdirectory (1.png - 52.png).
 *  Clicking the "Refresh" button generates four new random cards.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.util.*;

public class RandomCards extends Application {

    private static final int NUM_CARDS = 52;
    private static final int NUM_DISPLAY = 4;
    private static final String CARD_PATH = "cards/";

    private HBox cardBox = new HBox(10);
    private Random random = new Random();

    @Override
    public void start(Stage primaryStage) {
        // Display initial 4 cards
        displayRandomCards();

        // Button to refresh cards
        Button refreshButton = new Button("Refresh");
        refreshButton.setOnAction(e -> displayRandomCards()); // Lambda Expression

        VBox root = new VBox(10, cardBox, refreshButton);
        root.setStyle("-fx-padding: 15; -fx-alignment: center; -fx-background-color: lightgreen;");

        Scene scene = new Scene(root);
        primaryStage.setTitle("Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayRandomCards() {
        cardBox.getChildren().clear();
        List<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= NUM_CARDS; i++) deck.add(i);
        Collections.shuffle(deck);

        for (int i = 0; i < NUM_DISPLAY; i++) {
            String filename = CARD_PATH + deck.get(i) + ".png";
            File file = new File(filename);
            ImageView imageView = new ImageView(new Image(file.toURI().toString()));
            imageView.setFitWidth(100);
            imageView.setPreserveRatio(true);
            cardBox.getChildren().add(imageView);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
