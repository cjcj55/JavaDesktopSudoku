module com.cjcj55.javadesktopsudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cjcj55.sudoku to javafx.fxml;
    exports com.cjcj55.sudoku;
    exports com.cjcj55;
    opens com.cjcj55 to javafx.fxml;
    exports com.cjcj55.sudoku.problemdomain;
    opens com.cjcj55.sudoku.problemdomain to javafx.fxml;
}