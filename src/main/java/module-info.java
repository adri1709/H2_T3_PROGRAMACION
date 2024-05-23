module com.empresa.h2_t3_programacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.h2_t3_programacion to javafx.fxml;
    exports com.empresa.h2_t3_programacion;
}