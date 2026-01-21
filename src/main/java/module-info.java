module lk.acpt.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.acpt.demofx to javafx.fxml;
    exports lk.acpt.demofx;
    exports lk.acpt.demofx.controller;
    opens lk.acpt.demofx.controller to javafx.fxml;
    exports lk.acpt.demofx.db;
    opens lk.acpt.demofx.db to javafx.fxml;
    exports lk.acpt.demofx.dto;
    opens lk.acpt.demofx.dto to javafx.fxml;
}