// Workbook 1, but now read the width and height from the user
import java.util.Scanner; // import the scanner function

public class SquareCalculatorExt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // create scanner object called reader

        System.out.println("--RECTANGLE CALCULATOR PROGRAM--");
        // 1. Declare two variables, ask user to enter values
        System.out.println("Enter the width = ");
        double width = reader.nextDouble() ; // read and safe user input width

        System.out.println("Enter the height = ");
        double height = reader.nextDouble() ; // read and safe user input height

        // 2. Print variables width and height
        System.out.println("width= " + width);
        System.out.println("height=" + height);
        // 3. Create variable perimeter, calculate using formula 2 * (w + h)
        double perimeter = 2 * (width + height);
        // 4. Print variable perimeter
        System.out.println("Perimeter = " + perimeter);
        // 5. Create variable area, calculate using formula w * h
        double area = width * height;
        // 6. Print variable area
        System.out.println("the area = " + area);
    }
}
