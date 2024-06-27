package Day11.Quotient;  /** mar 6 2024 */
import java.util.Scanner;

public class WithIf
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);

        // Ask the user for 2 integers
        System.out.println("Enter two Integers:   ");
        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();

        if (numberTwo != 0)
        {
            System.out.println( numberOne + " / " + numberTwo + " is " + (numberOne / numberTwo));
        }
        else
        {
           System.out.println("Number Two cannot be 0! ");

        }

    }
}
