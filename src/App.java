import java.io.IOException; 

import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 
public class App extends Application //app class extends application class
    {  
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("equation.fxml"));  // connecting a fxml file to app class
        Scene scene = new Scene(root,600,450); //creating a new stage od scene and declaring its parameters
        primaryStage.setTitle("Quadratic Equation Solver");    // Set the stage title
        primaryStage.setScene(scene);               // Place the scene in the stage
        primaryStage.show();                        // Display the stage
    }
     public static void main(String[] args) {
            launch(args);
    }
}
