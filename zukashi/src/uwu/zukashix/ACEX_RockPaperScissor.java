package uwu.zukashix;

import java.util.Scanner;
import java.util.Random;

public class ACEX_RockPaperScissor {
    public static void main(String[] args) {
        // Init Important Classes & Variables
        Scanner inParse = new Scanner(System.in);
        Random intGenerator = new Random();
        String[] systemChoices = {"rock", "paper", "scissors"};

        while (true) {
            // Actual Exercise 2 (Rock Paper Scissors)
            // Run game for 5 rounds
            int userScore =0;
            int systemScore = 0;

            for (int i = 5; i != 0; i--) {
                System.out.print("\nEnter Rock/Paper/Scissor or R/P/S or \"exit\" or \"e\" to quit: ");
                String userP_Choice = inParse.next();
                userP_Choice = userP_Choice.toLowerCase().trim();

                // Exit if user wants to
                if (userP_Choice.equals("exit") || userP_Choice.equals("e")) {
                    System.out.println("\n Goodbye!");
                    System.exit(0);
                }

                // System choose it's choice
                int systemIndexChoice = intGenerator.nextInt(3);
                String systemChoice = systemChoices[systemIndexChoice];

                // If choice is invalid, repeat the chance
                if (!(userP_Choice.equals("rock") || userP_Choice.equals("scissors") || userP_Choice.equals("paper")
                        || userP_Choice.equals("r") || userP_Choice.equals("s") || userP_Choice.equals("p"))) {
                    System.out.println("Uh oh, That was an invalid input... Try again!");
                    i++;
                    continue;
                }

                // Scoring System
                if (userP_Choice.equals("rock") || userP_Choice.equals("r")) {
                    switch (systemChoice) {
                        case "rock":
                            System.out.println("System chose ROCK too, It's a tie!");
                            i++;
                            break;
                        case "paper":
                            System.out.println("System chose PAPER, System gets 1 point");
                            systemScore++;
                            break;
                        case "scissors":
                            System.out.println("System chose SCISSORS, You get 1 point");
                            userScore++;
                            break;
                        default:
                            System.out.println("I don't know what your input was.");
                            i++;
                            break;
                    }
                }

                if (userP_Choice.equals("paper") || userP_Choice.equals("p")) {
                    switch (systemChoice) {
                        case "paper":
                            System.out.println("System chose PAPER too, It's a tie!");
                            i++;
                            break;
                        case "rock":
                            System.out.println("System chose ROCK, System gets 1 point");
                            systemScore++;
                            break;
                        case "scissors":
                            System.out.println("System chose SCISSORS, You get 1 point");
                            userScore++;
                            break;
                        default:
                            System.out.println("I don't know what your input was.");
                            i++;
                            break;
                    }
                }

                if (userP_Choice.equals("scissors") || userP_Choice.equals("s")) {
                    switch (systemChoice) {
                        case "scissors":
                            System.out.println("System chose SCISSORS too, It's a tie!");
                            i++;
                            break;
                        case "rock":
                            System.out.println("System chose ROCK, System gets 1 point");
                            systemScore++;
                            break;
                        case "paper":
                            System.out.println("System chose PAPER, You get 1 point");
                            userScore++;
                            break;
                        default:
                            System.out.println("I don't know what your input was.");
                            i++;
                            break;
                    }
                }
            }

            // Compare Scores
            System.out.println("\nCalculating Scores...");
            if (userScore == systemScore) {
                System.out.println("It's a tie!");
            } else if (userScore > systemScore) {
                System.out.println("YOU HAVE WON!!");
            } else {
                System.out.println("Unfortunately, The system wins. Next time maybe!!");
            }

            System.out.print("\nDo you wish to play one more game? (yes/no/y/n): ");
            String wannaWasteMoreTime = inParse.next().trim().toLowerCase();

            if (wannaWasteMoreTime.equals("yes") || wannaWasteMoreTime.equals("y")) {
                continue;
            } else if (wannaWasteMoreTime.equals("no") || wannaWasteMoreTime.equals("n")) {
                System.out.println("Okay then, goodbye!");
                System.exit(0);
            } else {
                System.out.println("Didn't really get that. Guess I'll just leave");
                System.exit(0);
            }
        }
    }
}
