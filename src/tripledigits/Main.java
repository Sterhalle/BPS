package tripledigits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Information about Triple Digits

        // What is the name of the player and use that name
        // Create random numbers from 1 - 9 for the guessing part
        // What did the player reply and was their answer correct

            // Compare the created numbers with the player's numbers
            // Let the player know if they're right or not and save those results in a variable
            // Repeat the steps until the game is played a maximum of 3 times.
            // At the end of the game ask the player to fill in a rating and save that rating

    private static void askName() {
        String username;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hi! What's your name?");
        String inputName = userInput.next();
        System.out.println("Hello " + inputName + " let's play a game");
        username = inputName;
    }

    private static void endOfGame() {
        List<Integer> ratings = new ArrayList<>();

        Scanner userRating = new Scanner(System.in);
        System.out.println("Thank you so much for playing!");
        System.out.println("Could you rate our game from 1 till 10 so we can keep improving it?");
        int rating = userRating.nextInt();
        ratings.add(rating);
        System.out.println("Our last ratings are: " + ratings);
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Scanner continuePlay = new Scanner(System.in);

        Random  randomizer = new Random();

        String  newLine = System.lineSeparator();
        String  username;

        int     firstDigit;
        int     secondDigit;
        int     thirdDigit;
        int     gamesWon = 0;
        int     maximum = 9;
        int     maxTimesToPlay = 3;
        int     UserPoints;



        askName();
            for (int i = 0; i < maxTimesToPlay; i++) {

                firstDigit = randomizer.nextInt(maximum) + 1;
                secondDigit = randomizer.nextInt(maximum) + 1;
                thirdDigit = randomizer.nextInt(maximum) + 1;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;
                System.out.println(newLine + "The sum is " + sumOfDigits + " and the product is " + productOfDigits);

                    // Game information. The extra information will only be displayed the first round.
        System.out.println(newLine + "Please guess 3 numbers. Those numbers are from 1 till 9.");
            if ( i == 0 ) {
                System.out.println(newLine + "Fill in your first number and press enter before you fill in your second number. Do the same after your second number" + newLine +
                        "When you've filled in your third and last number, press enter again.");
            }

            // 2 conditions for when hints appear on the screen.
            if (i == 1 && gamesWon == 0) {
                System.out.println("Hint: to get the sum, add every number to each other" + newLine + "to get the product, multiply the numbers with each other " + newLine);
            }
            if (i == 2 && gamesWon == 0) {
                System.out.println("Ik vind het zelf ook altijd lastig.. Laat mij jou een hint geven" + newLine + "Het eerste getal is " + firstDigit);
            }

        int userChoice1 = userInput.nextInt();
            if (userChoice1 >=1 || userChoice1 <=10) {
            } else System.out.println("Your input is invalide, please try again");
        int userChoice2 = userInput.nextInt();
            if (userChoice2 >=1 || userChoice2 <=10) {
            } else System.out.println("Your input is invalide, please try again");
        int userChoice3 = userInput.nextInt();
            if (userChoice3 >=1 || userChoice3 <=10) {
            } else System.out.println("Your input is invalide, please try again");

            // Array list to add the choices of je player
            List<Integer> choices = new ArrayList<>();
            choices.add(userChoice1);
            choices.add(userChoice2);
            choices.add(userChoice3);

            //  condition for winning the round
        boolean hasPlayerWon = userChoice1 == firstDigit && userChoice2 == secondDigit && userChoice3 == thirdDigit;

            // second condition for winning the round.
        if (choices.contains(firstDigit) && choices.contains(secondDigit) && choices.contains(thirdDigit)) {
                hasPlayerWon = true;
                gamesWon++; }

        // if else statement for the different paths when a player wins or loses.
        if (hasPlayerWon) {
                    System.out.println("Heel goed, je hebt het geraden!" + newLine + "Je hebt op dit moment " + gamesWon + " keer gewonnen");

                    if (i == 0 || i == 1) {
                    System.out.println("Do you want to play another game? [Y/N]");
                        if (continuePlay.nextLine().toLowerCase().equals("y")) {
                            continue; }
                                else
                                    break;
                } else
                    break; }

            else {
                   System.out.println("Unfortunately, that's not the correct code.");

                   if (i == 0 || i == 1) {
                   System.out.println("Do you want to play another game? [Y/N]");
                        if (continuePlay.nextLine().toLowerCase().equals("y")) {
                            continue; }
                                 else
                                    break;
                } else
                    break;  }
        }
//            // vragen of hij/zij op het scorebord wilt
//            System.out.println("Thanks for playing!");
//            System.out.println("Your score is " + gamesWon);
                endOfGame();
        //            public String setName(String username) {
//                username = inputName;
//        }

//            String UserPoints = Integer.toString(gamesWon);
//            scoreboard.add(UserPoints);
//
//            System.out.println("Let's see the scoreboard: " + scoreboard);

            // zodra het spel 3 keer is gespeeld of zodra de gebruiker er voor kiest niet verder te gaan wordt dit weergegeven
//            System.out.println("Het spel is afgelopen!" + newLine + "De juiste kluiscode was " + firstDigit + "" + secondDigit + "" + thirdDigit);
        }


}