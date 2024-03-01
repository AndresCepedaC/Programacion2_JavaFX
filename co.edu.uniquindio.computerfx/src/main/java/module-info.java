module co.edu.uniquindio.computerfx.computerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.computerfx.computerapp to javafx.fxml;
    exports co.edu.uniquindio.computerfx.computerapp;
    exports co.edu.uniquindio.computerfx.computerapp.controller;
    opens co.edu.uniquindio.computerfx.computerapp.controller;
}