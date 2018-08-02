package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        VBox root = new VBox() {{
            getChildren().add(createImageView());
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    private ImageView createImageView() {
        Image image = new Image(this.getClass().getClassLoader().getResourceAsStream("javafx.jpg"));
        return new ImageView() {{
            setImage(image);
            this.setFitHeight(200);
            this.setFitWidth(200);
        }};
    }
}