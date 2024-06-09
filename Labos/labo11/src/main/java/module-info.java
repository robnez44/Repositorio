module org.example.labo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.labo11 to javafx.fxml;
    exports org.example.labo11;
}