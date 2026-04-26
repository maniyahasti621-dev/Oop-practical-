import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Registration Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));

        Label lblRollNo = new Label("Roll No:");
        TextField tfRollNo = new TextField();
        tfRollNo.setPromptText("Enter numeric roll no");

        Label lblName = new Label("Name:");
        TextField tfName = new TextField();
        tfName.setPromptText("Enter full name");

        Label lblAge = new Label("Age:");
        TextField tfAge = new TextField();
        tfAge.setPromptText("Enter age");

        Label lblEmail = new Label("Email:");
        TextField tfEmail = new TextField();
        tfEmail.setPromptText("Enter email");

        Button btnSubmit = new Button("Submit");

        grid.add(lblRollNo, 0, 0);
        grid.add(tfRollNo, 1, 0);
        grid.add(lblName, 0, 1);
        grid.add(tfName, 1, 1);
        grid.add(lblAge, 0, 2);
        grid.add(tfAge, 1, 2);
        grid.add(lblEmail, 0, 3);
        grid.add(tfEmail, 1, 3);
        grid.add(btnSubmit, 1, 4);

        btnSubmit.setOnAction(e -> {
            String rollNoStr = tfRollNo.getText().trim();
            String name = tfName.getText().trim();
            String ageStr = tfAge.getText().trim();
            String email = tfEmail.getText().trim();

            StringBuilder errors = new StringBuilder();
            
            int rollNo = 0;
            if (rollNoStr.isEmpty()) {
                errors.append("Roll No cannot be empty.\n");
            } else {
                try {
                    rollNo = Integer.parseInt(rollNoStr);
                    if (rollNo <= 0) errors.append("Roll No must be positive.\n");
                } catch (NumberFormatException ex) {
                    errors.append("Roll No must be an integer.\n");
                }
            }
            if (name.isEmpty()) {
                errors.append("Name cannot be empty.\n");
            }

            int age = 0;
            if (ageStr.isEmpty()) {
                errors.append("Age cannot be empty.\n");
            } else {
                try {
                    age = Integer.parseInt(ageStr);
                    if (age <= 0 || age > 150) errors.append("Age must be between 1 and 150.\n");
                } catch (NumberFormatException ex) {
                    errors.append("Age must be an integer.\n");
                }
            }
          
            if (email.isEmpty()) {
                errors.append("Email cannot be empty.\n");
            } else if (!email.contains("@") || !email.contains(".")) {
                errors.append("Email must contain '@' and '.'\n");
            } else if (email.indexOf('@') > email.lastIndexOf('.')) {
                errors.append("Invalid email format.\n");
            }

            if (errors.length() > 0){
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Validation Error");
                errorAlert.setHeaderText("Please fix the following errors:");
                errorAlert.setContentText(errors.toString());
                errorAlert.showAndWait();
            } else {
                Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                successAlert.setTitle("Registration Successful");
                successAlert.setHeaderText("Student Registered Successfully!");
                successAlert.setContentText(
                        "Roll No: " + rollNo + "\n" +
                        "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Email: " + email
                );
                successAlert.showAndWait();
                
                tfRollNo.clear();
                tfName.clear();
                tfAge.clear();
                tfEmail.clear();
            }
        });

        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
