// Logical operator
// || (double pipe) = (OR) either condition or both must be ture
// && (double ampersand) = (AND) both condition must be true
// ! (exclamation mark) = (NOT) reverses boolean value condition
import java.util.Scanner;

public class continueChecker {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        // ask the user if they want to continue playing
        System.out.println("Do you want to continue playing? ");
        String text = reader.nextLine();

        if (! ( text.equals("yes"))) {
            System.out.println("The game will end here. See you soon.");
        } else {
            System.out.println( "Stay in the game.");
        }

    }
}
