// Logical operator
// || (double pipe) = (OR) either condition or both must be ture
// && (double ampersand) = (AND) both condition must be true
// ! (exclamation mark) = (NOT) reverses boolean value condition

public class checkString {
    public static void main(String[] args) {
        // check if the word contains yes
        System.out.println("Is the string equal to 'milk'?");
        String text = "cola";

        if (! ( text.equals("milk"))) {
            System.out.println("The word " + text + " does not contains milk");
        } else {
            System.out.println( "The word " + text + " contains milk");
        }

    }
}
