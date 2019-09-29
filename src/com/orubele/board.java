package com.orubele;

public class board {
    // Creating variables for the board
    private int columnSize;
    private int rowSize;
    private String board[][];


    // board constructor that accepts two int argument.
    public board(int columnSize, int rowSize) {
        this.columnSize = columnSize;
        this.rowSize = rowSize;

    }

    /**
     * Method Name: CreateBoard
     * <p>
     * Parameters: null
     * <p>
     * Function: Creates a board for the tictactoe game by checking
     * <p>
     * if the column size and row size has been set.
     */

    public void createBoard() {
        if (this.getColumnSize() > 0 && this.getRowSize() > 0) {

            this.board = new String[this.getColumnSize()][this.getRowSize()];
            System.out.println("Board has been created" + this.board);

            for (int columncounter = 0; columncounter < this.getColumnSize(); columncounter++) {
                for (int rowcounter = 0; rowcounter < this.getRowSize(); rowcounter++) {
                    System.out.print(this.board[columncounter][rowcounter]);
                }

            }

        } else {

            System.out.print("Your board size was not set please try again");

        }

    }


    public int getColumnSize() {

        return columnSize;
    }

​

        ​

    public void setColumnSize(int columnSize) {

        this.columnSize = columnSize;

    }

        ​

                ​


                ​

    public int getRowSize() {

        return rowSize;

    }

        ​​

                ​

    public void setRowSize(int rowSize) {

        this.rowSize = rowSize;

    }

        ​

                ​

    public String[][] getBoard() {

        return board;

    }

        ​

                ​
                ​

    public void setBoard(String[][] board) {

        this.board = board;

    }

        ​
}


