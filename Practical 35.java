import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GradeBarChart extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Grade Distribution Bar Chart");

        HBox chartBox = new HBox(30); 
        chartBox.setAlignment(Pos.BOTTOM_CENTER);
        chartBox.setPadding(new Insets(20, 20, 20, 20));
        double scale = 4.0;
        double barWidth = 80;

        VBox projectsBar = createBar("Projects", 20, Color.RED, barWidth, scale);
        VBox quizzesBar = createBar("Quizzes", 10, Color.BLUE, barWidth, scale);
        VBox midtermsBar = createBar("Midterm Exams", 30, Color.GREEN, barWidth, scale);
        VBox finalBar = createBar("Final Exam", 40, Color.ORANGE, barWidth, scale);

        chartBox.getChildren().addAll(projectsBar, quizzesBar, midtermsBar, finalBar);

        Text title = new Text("Overall Grade Distribution");
        title.setFont(Font.font("Arial", 18));
        
        VBox root = new VBox(20, title, chartBox);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(15));
        root.setStyle("-fx-background-color: white;");

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private VBox createBar(String name, int percentage, Color color, double width, double scale) {
        Rectangle bar = new Rectangle(width, percentage * scale);
        bar.setFill(color);
        bar.setStroke(Color.BLACK);
        bar.setStrokeWidth(1);
      
        Text label = new Text(name + " — " + percentage + "%");
        label.setFont(Font.font("Arial", 12));
        
        Text percentText = new Text(percentage + "%");
        percentText.setFont(Font.font("Arial", 14));
        percentText.setFill(Color.BLACK);

        VBox barContainer = new VBox(5);
        barContainer.setAlignment(Pos.BOTTOM_CENTER);
        barContainer.getChildren().addAll(percentText, bar, label);
        
        return barContainer;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
