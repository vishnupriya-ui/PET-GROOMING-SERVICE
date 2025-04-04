import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookingScreen extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button nextButton = new Button("Next");

        nextButton.setOnAction(e -> {
            new ConfirmationScreen().start(new Stage());
            primaryStage.close();
        });

        VBox layout = new VBox(10, nextButton);
        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("Book Appointment");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}