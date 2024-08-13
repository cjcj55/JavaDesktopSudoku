package com.cjcj55.sudoku;

import com.cjcj55.sudoku.buildlogic.SudokuBuildLogic;
import com.cjcj55.sudoku.userinterface.IUserInterfaceContract;
import com.cjcj55.sudoku.userinterface.UserInterfaceImpl;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends javafx.application.Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage stage) throws IOException {
        uiImpl = new UserInterfaceImpl(stage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}