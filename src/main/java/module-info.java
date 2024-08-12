module com.cjcj55.javadesktopsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cjcj55.javadesktopsudoku to javafx.fxml;
    exports com.cjcj55.javadesktopsudoku;
}