module org.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens org.example to javafx.fxml;
    exports org.example;
}
