package com.company;
import java.util.Scanner;
import java.util.Random;

/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
userInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses

Use properties such as noOfGuesses(int), etc to get this task done!

*/

class game{
    int computer;
    int noOfGuess=1;
    public game(){
        //Using Random instance because we have to generate number from 0 to upperlimit(101)
        Random rand=new Random();
        int upperBound=101;
        computer=rand.nextInt(upperBound);
    }
    public int userInput(){
       Scanner sc=new Scanner(System.in);
       int player=sc.nextInt();
       return player;
    }
    public boolean isCorrectNumber(int user){
        if(computer>user){
            System.out.println("Your number is smaller. Enter bigger one: ");
            noOfGuess+=1;
            return false;
        }else if(computer<user){
            System.out.println("Your number is bigger than user. Enter smaller one: ");
            noOfGuess+=1;
            return false;
        }else{
            System.out.println("Congrats! Number Matched.");
            System.out.println("Your Score is: "+noOfGuess);
            return true;
        }
    }
}

public class class_48_guess_the_number_game {
    public static void main(String[] args) {

        game game1=new game();
        System.out.println("Enter the number: ");
        int user=game1.userInput();
        while(!game1.isCorrectNumber(user)){
            user=game1.userInput();
        }
    }
}
