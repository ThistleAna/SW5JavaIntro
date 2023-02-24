// Logical operator
// || (double pipe) = (OR) either condition or both must be ture
// && (double ampersand) = (AND) both condition must be true
// ! (exclamation mark) = (NOT) reverses boolean value condition


public class orStatement {
    public static void main(String[] args) {
        String order = "Spaghetti";

        if ( order == "Pizza" || order == "Spaghetti") {
            System.out.println("Order granted, cooking now...");
        } else {
            System.out.println("We only sell Pizza or Spaghetti");
        }
    }
}
