package org.example;

import java.util.Random;
import java.util.Scanner;

public class RockPapperSciessorGame {
    public static String generateComputerChoice(Random random) {
        int wordNumber;
        // Random random= new Random();
        wordNumber = random.nextInt(3) + 1;

        String computerChoice = "";

        if (wordNumber == 1) {
            computerChoice = "rock";
        } else if (wordNumber == 2) {
            computerChoice = "paper";
        } else {
            computerChoice = "Scissor";
        }
        System.out.println("\nThe Computer already made it's choice.");
        return computerChoice;
    }

    public static void showMenu() {
        System.out.println("Option to choose from :\n1.Rock.\n2.Paper.\n3.Scissor");
    }


    public static String getUserChoice(Scanner scanner) {
        String userWordChoice = "";
        System.out.println("\nPlease make your choice : ");
        userWordChoice = scanner.nextLine();

        return userWordChoice;


    }
    public static String chooseWinner(String computerChoice, String userChoice){
        String winner = "No Winner";
        String customMessage = "Both choose same";
        String finalMessage = "";

        String rockCustomMessage = "The rock smashes the scissor";
        String scissorCustomMessage = "The scissor cut the paper";
        String paperCustomMessage = "The paper wraps the rock";

        if ( computerChoice.equals("rock") && userChoice.equalsIgnoreCase("scissor")){
            winner="Computer";
            customMessage=rockCustomMessage;
        } else if (userChoice.equalsIgnoreCase("rock") && computerChoice.equals("scissor")) {
            winner = "User";
            customMessage = rockCustomMessage;
        }
        if ( computerChoice.equals("scissor") && userChoice.equalsIgnoreCase("paper")){
            winner="Computer";
            customMessage=scissorCustomMessage;
        } else if (userChoice.equalsIgnoreCase("scissor") && computerChoice.equals("paper")) {
            winner = "User";
            customMessage = scissorCustomMessage;
        }
        if ( computerChoice.equals("paper") && userChoice.equalsIgnoreCase("rock")){
            winner="Computer";
            customMessage=paperCustomMessage;
        } else if (userChoice.equalsIgnoreCase("paper") && computerChoice.equals("rock")) {
            winner = "User";
            customMessage = paperCustomMessage;
        }

        finalMessage = winner+ "won("+customMessage+")";

        return finalMessage;

    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner;

        showMenu();
        computerChoice = generateComputerChoice(random);
        userChoice = getUserChoice(scanner);
        winner = chooseWinner(computerChoice, userChoice);

        System.out.println("\nYou choose : "+userChoice+"\nComputer choose : "+computerChoice);
        System.out.println(winner);
    }


}
