module com.example.changewindow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.changewindow to javafx.fxml;
    exports com.example.changewindow;
}