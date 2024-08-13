package com.cjcj55.sudoku.buildlogic;

import com.cjcj55.sudoku.computationlogic.GameLogic;
import com.cjcj55.sudoku.persistence.LocalStorageImpl;
import com.cjcj55.sudoku.problemdomain.IStorage;
import com.cjcj55.sudoku.problemdomain.SudokuGame;
import com.cjcj55.sudoku.userinterface.IUserInterfaceContract;
import com.cjcj55.sudoku.userinterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try {
            initialState = storage.getGameData();
        } catch (IOException e) {
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);

        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
