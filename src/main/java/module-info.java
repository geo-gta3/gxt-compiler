module gxt.compiler {
    requires com.google.gson;
    requires ge.vakho.gxt;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;

    opens ge.vakho.gxt_compiler to javafx.fxml, com.google.gson;
    exports ge.vakho.gxt_compiler;
}