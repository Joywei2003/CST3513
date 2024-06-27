package Day5;  /** feb 14 2024 */
import java.util.Scanner;

public class Classwork4
{
    public static void main(String[] args)
    {
        final int NUM_EMPLOYEES = 5; // Number of employees
        double payRate; // Hourly pay rate
        double grossPay = 0; // Gross pay

        int[] hours = new int[NUM_EMPLOYEES]; // Array to hold hours

        Scanner scan = new Scanner(System.in);

        System.out.println("This is Manual Array.");
        System.out.println("Enter the hours worked by " + NUM_EMPLOYEES + " employees who all earn the same hourly rate.");

        System.out.print("Employee #" + 1 + ": ");
        hours[0] = scan.nextInt();

        System.out.print("Employee #" + 2 + ": ");
        hours[1] = scan.nextInt();

        System.out.print("Employee #" + 3 + ": ");
        hours[2] = scan.nextInt();

        System.out.print("Employee #" + 4 + ": ");
        hours[3] = scan.nextInt();

        System.out.print("Employee #" + 5 + ": ");
        hours[4] = scan.nextInt();

        System.out.print("Enter the hourly pay rate for each employee: ");
        payRate = scan.nextDouble();

        grossPay(hours, payRate, grossPay);
    }

    private static void grossPay(int[] hours, double payRate, double grossPay)
    {
        System.out.println("Here is each employee's gross pay:");

        for (int index = 0; index < hours.length; index++)
        {
            grossPay =  grossPay + (hours[index] * payRate);
            System.out.println("Employee #" + (index + 1) + ": $" + grossPay);
        }

        System.out.println("Total gross pay for all employees: $" + grossPay);
    }
}
