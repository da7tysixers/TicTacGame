package com.orubele;

import java.util.InputMismatchException;
import java.util.Scanner;

public class score {

    public Scanner userAnswer = new Scanner(System.in);
    private String userResponse = "";

    public boolean playAgain() throws InputMismatchException {
        // Asks user if they want to play again.

        while (true) {
            System.out.println("Do you want to play again? (Y / N).");
            userResponse = userAnswer.next();
            if (userResponse.equalsIgnoreCase("Y"))
                return true;
            else if (userResponse.equalsIgnoreCase("N"))
                return false;
        }

    }

        public void placeValues(String stOne, String stTwo, String stThree){

            stOne = "0";
            stTwo = "0";
            stThree = "0";



        }


}