package MainSystem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// 1. Extend JavaFX's Application class instead of JFrame
public class SFrameNext extends Application {

    // 2. The start method is the main entry point for all JavaFX applications
    @Override
    public void start(Stage primaryStage) {
        
        // 3. Create a root layout (this replaces your JFrame's ContentPane)
        // StackPane centers everything inside it by default. 
        // Later, you can change this to a BorderPane or VBox depending on your design.
        StackPane rootLayout = new StackPane();
        
        // 4. Create the Scene holding your root layout
        // The numbers represent the initial Width and Height of your window
        Scene scene = new Scene(rootLayout, 1024, 768);
        
        // 5. Configure the Stage (the window itself)
        primaryStage.setTitle("Project3 System"); // Set the window title
        primaryStage.setScene(scene);             // Attach the scene to the stage
        
        // Optional: Set window constraints
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);

        // 6. Finally, show the window!
        primaryStage.show();
    }

    // 7. A standard main method to launch the JavaFX app directly from this class if needed
    public static void main(String[] args) {
        launch(args);
    }
}