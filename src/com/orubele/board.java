package com.orubele;

public class board {
    // Creating variables for the board
    private int columnSize = 0;
    private int rowSize = 0;
    private String board [][];

    public board (int columnSize, int rowSize) {
        this.columnSize = columnSize;
        this.rowSize = rowSize;


    }

    public void createBoard(){
        System.out.println("I have created the board but it is empty");

    }

    public void getRowSize() {
        return this.rowSize;

    }

    public  void  getColumnSize() {
        return  columnSize;
    }


    public void setBoard() {


    }

    public String boardPlay(String boardInput [][]) {
        boardInput = new String [this.columnSize][this.rowSize];

        return boardInput;
    }



}
