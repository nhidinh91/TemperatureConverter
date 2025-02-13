module assignment.temperatureconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens assignment.temperatureconverter to javafx.fxml;
    exports assignment.temperatureconverter;
}