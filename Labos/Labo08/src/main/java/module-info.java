module org.example.labo08 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.swing;
    requires javafx.media;


    opens org.example.labo08 to javafx.fxml;
    exports org.example.labo08;
}