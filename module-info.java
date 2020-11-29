module library {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;
    opens sample;
    opens Scene1;
    opens Scene1.models;
}