package AudioSplit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AudioSplit extends Application {

    private final String LAYOUT_PATH = "/View/Layout.fxml";
    private final String APPLICATION_NAME = "Audio Split";
    private final boolean IS_RESIZEABLE = false;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(LAYOUT_PATH));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle(APPLICATION_NAME);
        primaryStage.setResizable(IS_RESIZEABLE);
        primaryStage.show();
        return;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
