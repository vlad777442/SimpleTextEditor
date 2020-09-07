package texteditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TextEditor extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        loader.setControllerFactory(t -> new EditorController(new EditorModel()));
        
        stage.setScene(new Scene(loader.load()));
        
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
