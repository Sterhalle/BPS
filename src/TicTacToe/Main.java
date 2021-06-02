package TicTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // stap 1: maak een bord aan
        Scanner userInput = new Scanner(System.in);


        System.out.println("Welkom bij boter, kaas en eieren!");
        System.out.println("Vul de username in voor speler 1:");

        String  user1     =   userInput.nextLine();
        System.out.println("Bedankt! Vul nu de username in voor speler 2:");
        String  user2     =   userInput.nextLine();
        System.out.println("Zijn jullie er klaar voor " + user1 + " en " + user2 + "? \nVeel plezier");

        String[] playBoard = new String[9];

        for (int i = 0; i < 9; i++) {
            playBoard[i] = Integer.toString(i);
        }

        for (int i = 0; i < playBoard.length; i++) {
            if (i == 2 || i == 5 || i == 8) {
                System.out.print(playBoard[i]);
            } else
                System.out.print(playBoard[i] + " | ");

            boolean isEndOfRow = (i == 2 || i == 5);
            if (isEndOfRow) {
                System.out.println("\n_________");
            }
        }
        // stap 2: Geef de speler de mogelijkheid om een X te zetten

        System.out.println("\n" + user1 + " voer een cijfer van 0 t/m 8 in om een kruisje op het bord te zetten");

        int player1SelectsField  =   userInput.nextInt();

        playBoard[player1SelectsField]    =   "X";

        for (int i = 0; i < playBoard.length; i++) {
            if (i == 2 || i == 5 || i == 8) {
                System.out.print(playBoard[i]);
            } else
                System.out.print(playBoard[i] + " | ");

            boolean isEndOfRow = (i == 2 || i == 5);
            if (isEndOfRow) {
                System.out.println("\n_________");
            }
        }
        System.out.println("\n" + user2 + " voer een cijfer van 0 t/m 8 in om een kruisje op het bord te zetten");

        int player2SelectsField  =   userInput.nextInt();

        playBoard[player2SelectsField]    =   "O";

        for (int i = 0; i < playBoard.length; i++) {
            if (i == 2 || i == 5 || i == 8) {
                System.out.print(playBoard[i]);
            } else
                System.out.print(playBoard[i] + " | ");

            boolean isEndOfRow = (i == 2 || i == 5);
            if (isEndOfRow) {
                System.out.println("\n_________");
            }
        }

            // stap 3: kijken of de speler heeft gewonnen
//            boolean eersteRijLR   = (playBoard[0] == "X" & playBoard[1] == "X" & playBoard[2] == "X"
//                                    || playBoard[0] == "O" & playBoard[1] == "O" & playBoard[2] == "O");
//
//            boolean tweederijLR   = (playBoard[3] == "X" & playBoard[4] == "X" & playBoard[5] == "X"
//                    || playBoard[3] == "O" & playBoard[4] == "O" & playBoard[5] == "O");
//
//            boolean derdeRijLR   = (playBoard[6] == "X" & playBoard[7] == "X" & playBoard[8] == "X"
//                    || playBoard[6] == "O" & playBoard[7] == "O" & playBoard[8] == "O");
//
//            boolean eersteSchuinLR   = (playBoard[0] == "X" & playBoard[4] == "X" & playBoard[8] == "X"
//                    || playBoard[0] == "O" & playBoard[5] == "O" & playBoard[8] == "O");
//
//            boolean tweedeSchuinLR   = (playBoard[6] == "X" & playBoard[4] == "X" & playBoard[2] == "X"
//                    || playBoard[6] == "O" & playBoard[4] == "O" & playBoard[2] == "O");
//
//            boolean eersteBenedenBO   = (playBoard[0] == "X" & playBoard[3] == "X" & playBoard[6] == "X"
//                    || playBoard[0] == "O" & playBoard[3] == "O" & playBoard[6] == "O");
//
//            boolean tweedeBenedenBO   = (playBoard[1] == "X" & playBoard[4] == "X" & playBoard[7] == "X"
//                    || playBoard[1] == "O" & playBoard[4] == "O" & playBoard[7] == "O");
//
//            boolean derdeBenedenBO   = (playBoard[2] == "X" & playBoard[5] == "X" & playBoard[8] == "X"
//                    || playBoard[2] == "O" & playBoard[5] == "O" & playBoard[8] == "O");
//
//            boolean drieOpEenRij = (eersteRijLR || tweederijLR || derdeRijLR || eersteSchuinLR || tweedeSchuinLR || eersteBenedenBO
//                                    || tweedeBenedenBO || derdeBenedenBO);

            // stap 4: Geef de speler de mogelijkheid om een O te zetten
            // stap 5: kijken of de speler heeft gewonnen
            //
            // herhalen stap 2 t/m 5 tot er een winnaar is
        }
    }
