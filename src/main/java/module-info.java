module com.example.execeptions {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.execptions to javafx.fxml;
    exports com.example.execptions;
}