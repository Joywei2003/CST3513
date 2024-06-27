package Day6; /** feb 21 2024 */
import java.math.BigDecimal;
import java.util.Scanner;

public class SalaryCalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);  // Create a Scanner object for keyboard input.
        int days; // Number of days worked
        double grossPay; // Gross pay

        // input
        System.out.println("Enter the number of days worked: ");
        days = keyboard.nextInt(); // Get the number of days worked.

        // processing
        grossPay = grossPay(days); // Get the gross pay.
        grossPay = pennyToDollar(grossPay); // Convert the gross pay to dollars.

        // output
        System.out.println("Gross pay in Dollars: $" + grossPay);

    }

    public static double grossPay(int days)
    {
        // 1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192
        int total = 0;
        int powerOfTwo = 1;
        for (int payRate = 1; payRate <= days; payRate++)
        {
            System.out.println("Day " + payRate + " - " + powerOfTwo + " Penny");
            total += powerOfTwo; // Add the current power of two to the total.
            powerOfTwo *= 2; // Double the current power of two.
        }

        System.out.println("Total gross pay in Penny: " + total);
        return total;
    }

    public static double pennyToDollar(double pennies) {

        // Convert the gross pay to dollars by using the BigDecimal class
        BigDecimal bd = new BigDecimal(pennies / 100);
        return bd.doubleValue();
    }
}
