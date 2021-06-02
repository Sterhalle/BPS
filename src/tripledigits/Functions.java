package tripledigits;

import tripledigits.Main;

import java.security.PrivateKey;
import java.util.Scanner;
import java.util.function.Function;

public class Functions {

    public void askName() {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Hi! What's your name?");
            String username = userInput.next();
            System.out.println("Oh hello " + username + " let's play a game");

        }
    }
