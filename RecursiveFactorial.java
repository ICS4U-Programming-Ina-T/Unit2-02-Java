import java.util.Scanner;

/**
 * The RecursiveFactorial program implements an application
 * that uses a recursive function to determine the answer of
 * some number, factorial.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-3-30
 */

class RecursiveFactorial {
    /**
     * Determines the factorial of the user's number.
     *
     * @param userNum is accepted
     * @return the factorial
     */
    public static long factorial(long userNum) {
        final long factorialAnswer;

        if (userNum == 1 || userNum == 0) {
            factorialAnswer = 1;
        } else {
            factorialAnswer = factorial(userNum - 1) * userNum;
        }
        return factorialAnswer;
    }

    /**
     * Main entry into the program.
     *
     * @param args is only passed in
     */
    public static void main(String[] args) {
        // declaring variables
        final Scanner sc = new Scanner(System.in);
        final String userString;
        final long userNumInt;
        final long userAnswer;

        System.out.println("Today you will find out the answer when a"
            + "number is put with factorial.\n");

        System.out.print("Please enter a positive integer (0 inclusive): ");
        userString = sc.nextLine();
        System.out.println();

        try {
            userNumInt = Long.parseLong(userString);

            if (userNumInt >= 0) {
                userAnswer = factorial(userNumInt);

                System.out.println("The answer to " + userNumInt
                    + "! is " + userAnswer);
            } else {
                System.out.println("Number type is invalid!");
            }
        } catch (IllegalArgumentException exception) {
            System.out.println("Value cannot be accepted!");
        }
    }
}
