package com.orubele;

public class board {
    // Creating variables for the board
    private int columnSize;
    private int rowSize;
    private String board[][];

    public board(int columnSize, int rowSize) {
        this.columnSize = columnSize;
        this.rowSize = rowSize;

    }


    public void createBoard() {
        System.out.println("I have created the board but it is empty");

    }

    public int getRowSize() {
        return this.rowSize;

    }

    public int getColumnSize() {
        return this.columnSize;
    }


    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;

    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }


    public String[][] getBoard() {

        return board;

    }


    public void setBoard(String[][] board) {

        this.board = board;

    }



}
