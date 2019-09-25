package com.orubele;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import javax.swing.text.SimpleAttributeSet;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner answer = new Scanner(System.in);
    board myNewBoard = new board(3, 3);




    int[][] myArray;
    // An Array with functions tht does not allow you to do stuff.
    ArrayList<String> totalNum = new ArrayList<String>(45);



    public static void main(String[] args) {

        score user = new score();
        Player newPlayer = new Player("Emmanuel", "Orubele");
        try{

            do {
                System.out.println("Welcome! Lets play Tic Tac");
                newPlayer.playerResponse();



            }while (user.playAgain());
            System.out.println("Thank you for playing");

        }
        catch (InputMismatchException e) {
            if (!user.userAnswer.equals("Y") || (!user.userAnswer.equals("N"))) {
                System.out.println("OOps thats not a String");
            }
        }
    }
}
