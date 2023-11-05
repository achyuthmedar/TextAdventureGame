import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName;
        
        // Introduction
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "! Let's begin.");

        // Initialize the game
        int score = 0;
        
        // Game loop
        while (true) {
            System.out.println("\nChoose your next action:");
            System.out.println("1. Explore the forest");
            System.out.println("2. Enter the cave");
            System.out.println("3. Quit the game");
            
            // Get user input
            int choice = getUserChoice(scanner, 1, 3);
            
            // Process user choice
            if (choice == 1) {
                System.out.println("You venture into the forest...");
                // Implement the forest scenario and update the score
            } else if (choice == 2) {
                System.out.println("You enter the dark cave...");
                // Implement the cave scenario and update the score
            } else if (choice == 3) {
                System.out.println("Thanks for playing! Your final score: " + score);
                break;
            }
        }
        
        // Close the scanner
        scanner.close();
    }

    // Helper function to get a valid user choice
    private static int getUserChoice(Scanner scanner, int min, int max) {
        int choice;
        while (true) {
            System.out.print("Enter your choice (" + min + "-" + max + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                scanner.nextLine(); // Consume the invalid input
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
