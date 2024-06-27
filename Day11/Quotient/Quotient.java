package Day11.Quotient; /** mar 6 2024 */
import java.util.Scanner;

public class Quotient
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Ask the user for 2 integers
        System.out.println("Enter two Integers: ");
        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();

        System.out.println( numberOne + " / " + numberTwo + " is " + (numberOne / numberTwo));
    }
}
