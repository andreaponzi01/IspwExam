module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.controller;
    exports com.example.demo.test.junit;
    opens com.example.demo.controller to javafx.fxml;
}