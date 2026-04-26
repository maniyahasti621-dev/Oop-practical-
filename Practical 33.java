import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class TextDisplay extends Application {
    
    public void start(Stage primaryStage) {
        VBox root = new VBox(15); 
        root.setAlignment(Pos.CENTER); 
        root.setStyle("-fx-background-color: white;");
        
        Random rand = new Random();
        
        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);
            
            Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
            text.setFont(font);
            
            double red = rand.nextDouble();
            double green = rand.nextDouble();
            double blue = rand.nextDouble();
            double opacity = 0.3 + rand.nextDouble() * 0.7;
            
            Color randomColor = new Color(red, green, blue, opacity);
            text.setFill(randomColor);
            
            root.getChildren().add(text);
        }
        
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Random Colored Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
