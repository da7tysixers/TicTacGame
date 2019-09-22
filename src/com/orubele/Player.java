package com.orubele;

import com.sun.source.tree.IfTree;

public class Player {
    score newScore = new score();

    String firstName;
    String lastName;
    int total;

    public Player (String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public  Player(){
        this.total = 0;
    }

    public void playerResponse(){

        System.out.println("Enter your name: ");
        String name = Main.answer.next();
        System.out.println("Enter your age: ");
        int age = Main.answer.nextInt();

        if (age < 10) {

            System.out.println("You are not of age");
            newScore.playAgain();
        }
        else {
            System.out.println("Welcome " + name);
            newScore.placeValues("0", "0", "0");
        }



    }
}
