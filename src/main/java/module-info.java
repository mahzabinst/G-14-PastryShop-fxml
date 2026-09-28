module oop.iub.g14pastryshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.iub.g14pastryshop to javafx.fxml;
    exports oop.iub.g14pastryshop;
}