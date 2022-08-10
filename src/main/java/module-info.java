module com.example.botones1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.botones1 to javafx.fxml;
    exports com.example.botones1;
}