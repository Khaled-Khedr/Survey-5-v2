module Survey5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens Survey5 to javafx.fxml;
    exports Survey5;
}