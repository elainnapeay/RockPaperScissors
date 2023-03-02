import java.util.Scanner;
import java.util.Random;
/**
 * Name: Elainna D. Peay
 * Date: 9/19/19
 * Class: CISP 1010 A02
 * Project: Project 2
 * Getting Started - This application lets the user input a number (1,2 or 3) then compares that number to
 *                   the random generated number from the computer, then outputs who won.
 *
 * Test data:
 * User input: 1
 * Output: Rock
 * User input: 2
 * Output: Paper
 * User input: 3
 * Output: Scissors 
 *
 *
 *
 */

public class RockPaperScissors {
    /**
     * Description: This is the entry point for all Java console applications
     *
     * @param args - args is not used in this application.
     */
    public static void main(String[] args) {
       //random generator
        Random rand = new Random();
        Scanner cin = new Scanner(System.in);
        //define variables
        int computerGuess = rand.nextInt(3) + 1;
        int userGuess = 0;
        //string
        String input;
        //welcome header
        System.out.println(createHeader());
        //start game
        System.out.println("The computer has its guess ready!");
        //user input
        System.out.print("Enter your guess: Rock, Paper, Scissors [1, 2, or 3] : ");
        input = cin.nextLine();
        userGuess = Integer.parseInt(input);

        try {
            userGuess = Integer.parseInt(input);
        }
        catch(NumberFormatException err) {
            System.out.println("You may have entered an incorrect integer value");
            System.exit(1);

        }

        //if user inputs number greater than 3 or less than 1
        if(userGuess < 1 || userGuess > 3 ) {
            System.out.println("You may have entered an incorrect integer value");
            System.exit(1);

        }
        //convert input
        if(computerGuess == 1) {
            System.out.println("\nComputer guess:" + "Rock");
            //System.out.println();
            //System.out.println();
        } else if (computerGuess == 2) {
            System.out.println("\nComputer guess: " + "Paper");
        } else if (computerGuess == 3) {
            System.out.println("\nComputer guess: " + "Scissors");
        } else {
            System.out.println("Error");
        }

        if(userGuess == 1) {
            System.out.println("\nUser guess: " + "Rock");
            //System.out.println();
            //System.out.println();
        } else if (userGuess == 2) {
            System.out.println("\nUser guess: " + "Paper");
        } else if (userGuess == 3) {
            System.out.println("\nUser guess: " + "Scissors");
        } else {
            System.out.println("Error");
        }

        //who wins
        if (userGuess == 1 ) {

            if (computerGuess == 1) {
                System.out.println("\n- - -> " + "TIE");

            }
            else if (computerGuess == 2) {
                System.out.println("\n- - -> " + "Computer wins");

            }
            else  {
                System.out.println("\n- - -> " + "You win");;
            }

        }
        if (userGuess == 2 ) {
            if (computerGuess == 2) {
                System.out.println("\n- - -> " + "TIE");

            }
            else if (computerGuess == 3) {
                System.out.println("\n- - -> " + "Computer wins");

            }
            else  {
                System.out.println("\n- - -> " + "You win");;
            }

        }
        if (userGuess == 3 ) {

            if (computerGuess == 3) {
                System.out.println("\n- - -> " + " TIE");

            }
            else if (computerGuess == 1) {
                System.out.println("\n- - -> " + "Computer wins");

            }
            else  {
                System.out.println("\n- - -> " + " You win");
            }

        }
        cin.close();

    }// end main

    public static String createHeader() {
        String output = "";
        output +="********************************************************\n";
        output += "***************                         ****************\n";
        output +="<<<<<<<<<<<<<<<   Rock-Paper-Scissors   >>>>>>>>>>>>>>>>\n";
        output += "***************                         ****************\n";
        output +="********************************************************\n";
        return output;

    }//end createHeader

}//end class
