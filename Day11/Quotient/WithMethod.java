package Day11.Quotient;  /** mar 6 2024 */
import java.util.Scanner;

public class WithMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter two Integers:   ");

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        int result = quotientWithMethod(numberOne, numberTwo);

        System.out.println( numberOne + " / " + numberTwo + " = " + result);

    }


    public static int quotientWithMethod(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Divider cannot be 0");
            System.exit(1);
        }

        return num1 / num2;

    }
}
