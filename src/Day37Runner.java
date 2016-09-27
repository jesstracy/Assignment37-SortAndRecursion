import java.util.Scanner;

/**
 * Created by jessicatracy on 9/27/16.
 */
public class Day37Runner {
    public static void main(String[] args) {
        System.out.println("GuessMyNumber is running!");

        // Ask the user for their number
        // and store it in an int variable
        boolean incorrectInput = false;
        String userInput;
        int userNumber = 0;
        while (true) {
            System.out.println("Please enter a number between 0 and 10");
            Scanner inputScanner = new Scanner(System.in);
//        int userNumber = inputScanner.nextInt();
            userInput = inputScanner.nextLine();
            for (int index = 0; index < userInput.length(); index++) {
//                System.out.println("** Current char: " + userInput.charAt(index));

                if (!Character.isDigit(userInput.charAt(index))) {
//                    System.out.println("** Not a digit!");
                    incorrectInput = true;
                }
            }
            if (!incorrectInput) {
                userNumber = Integer.valueOf(userInput);
                if (userNumber < 0 || userNumber > 10) {
                    incorrectInput = true;
                }
            }

            if (incorrectInput) {
                System.out.println("You must choose a number between 0 and 10! Try again.");
                incorrectInput = false;
            } else {
                break;
            }
        }

//        int userNumber = Integer.valueOf(userInput);
        System.out.println("You entered: " + userNumber);

        // Generate a random number between 0 and 10
        // and store it in another int variable
        int computerNumber = (int) (Math.random() * 10);
        System.out.println("Computer generated: " + computerNumber);

        // Compare the two and display who won
        if (userNumber > computerNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("I win!");
        }

        System.out.println("Thank you for playing!");
    }

    public void domsWay () {
        while (true) {
            System.out.println("GuessMyNumber is running!");

            // Ask the user for their number
            // and store it in an int variable
            int userNumber = -1;
            try {
                System.out.println("Please enter a number between 0 and 10");
                Scanner inputScanner = new Scanner(System.in);
                userNumber = Integer.valueOf(inputScanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("You need to enter a number!");
                continue;
            }
            System.out.println("You entered: " + userNumber);

            // Generate a random number between 0 and 10
            // and store it in another int variable
            int computerNumber = (int) (Math.random() * 10);
            System.out.println("Computer generated: " + computerNumber);

            // Compare the two and display who won
            if (userNumber > computerNumber) {
                System.out.println("You win!");
            } else {
                System.out.println("I win!");
            }

            System.out.println("Thank you for playing!");
        }
    }


}
