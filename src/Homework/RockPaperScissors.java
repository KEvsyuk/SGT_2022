package Homework;

import java.util.Objects;
import java.util.Scanner;

    public class RockPaperScissors {
        public static void main(String[] args) {
            System.out.println("Welcome to the Rock-Paper-Scissors game! Which version would you like to play? (first/second)");
            Scanner scanner = new Scanner(System.in);
            String version = scanner.nextLine();

            if (Objects.equals(version.toLowerCase(), "first")) {

                System.out.println("Player 1, enter your input");
                String player1 = scanner.nextLine();
                player1.toLowerCase();
                System.out.println("Player 2, enter your input");
                String player2 = scanner.nextLine();
                player2.toLowerCase();

                if (((player1.equals("rock") && player2.equals("paper"))) || (player1.equals("paper") && player2.equals("scissors"))
                        || (player1.equals("scissors") && player2.equals("rock"))){
                    System.out.println("Player 2 wins");
                }
                if (((player1.equals("paper") && player2.equals("rock"))) || (player1.equals("scissors") && player2.equals("paper"))
                        || (player1.equals("rock") && player2.equals("scissors"))) {
                    System.out.println("Player 1 wins");
                }
                if (player1.equals(player2)) {
                    System.out.println("It's a tie!");
                }
            }
            if (Objects.equals(version, "second")) {

                System.out.println("Player 1, enter your input");
                String player1 = scanner.nextLine();
                player1.toLowerCase();
                System.out.println("Player 2, enter your input");
                String player2 = scanner.nextLine();
                player2.toLowerCase();

                if (((player1.equals("rock") && player2.equals("paper"))) || (player1.equals("paper") && player2.equals("scissors"))
                        || (player1.equals("scissors") && player2.equals("rock"))
                        || (player1.equals("rock") && player2.equals("spock"))

                        || (player1.equals("lizard") && player2.equals("rock"))
                        || (player1.equals("scissors") && player2.equals("spock"))

                        || (player1.equals("paper") && player2.equals("lizard"))
                        || (player1.equals("spock") && player2.equals("lizard"))

                        || (player1.equals("spock") && player2.equals("paper"))
                        || (player1.equals("lizard") && player2.equals("scissors"))) {
                    System.out.println("Player 2 wins");
                }
                if (((player1.equals("paper") && player2.equals("rock"))) || (player1.equals("scissors") && player2.equals("paper"))
                        || (player1.equals("rock") && player2.equals("scissors"))
                        || (player1.equals("spock") && player2.equals("rock"))

                        || (player1.equals("rock") && player2.equals("lizard"))
                        || (player1.equals("spock") && player2.equals("scissors"))

                        || (player1.equals("lizard") && player2.equals("paper"))
                        || (player1.equals("lizard") && player2.equals("spock"))

                        || (player1.equals("paper") && player2.equals("spock"))
                        || (player1.equals("scissors") && player2.equals("lizard"))) {
                    System.out.println("Player 1 wins");
                }
                if (player1.equals(player2)) {
                    System.out.println("It's a tie!");
                }
            }

        }
    }
