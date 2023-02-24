// Logical operator
// || (double pipe) = (OR) either condition or both must be ture
// && (double ampersand) = (AND) both condition must be true
// ! (exclamation mark) = (NOT) reverses boolean value condition

import java.util.Scanner;

public class ProtectedMoneyChecker { // PUBLIC CLASS START
    public static void main(String[] args) { //MAIN METHOD START
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter your balance : ");
        int balance = reader.nextInt();

        // check the balance, 0- 85000, print protected, otherwise not protected
        if (balance>=0 && balance<=85000){
            System.out.println("Yes");
        }
        else {
            System.out.println("Not protected");
        }


    } // END OF METHOD
} // END OF CLASS
