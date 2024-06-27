package Day11.Quotient;  /** mar 6 2024 */
import java.util.Scanner;

public class WithMethodAndTryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two Integers:   ");

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        int result = 0;

        try{
            result = quotientWithMethod(numberOne, numberTwo);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println( numberOne + " / " + numberTwo + " = " + result);

    }


    public static int quotientWithMethod(int num1, int num2) {

        if (num2 == 0) {
            throw new ArithmeticException("Divisor cannnot be zero");
        }

        return num1 / num2;

    }
}
