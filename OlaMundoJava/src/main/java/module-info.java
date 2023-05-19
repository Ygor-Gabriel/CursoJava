module fxml.olamundojava {
    requires javafx.controls;
    requires javafx.fxml;

    opens fxml.olamundojava to javafx.fxml;
    exports fxml.olamundojava;
}
