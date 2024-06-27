package Day5; /** feb 14 2024 */
import java.util.Scanner;

public class Classwork5 {

    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 5; // Number of employees
        double payRate; // Hourly pay rate
        double grossPay = 0; // Gross pay

        int[] hours = new int[NUM_EMPLOYEES]; // Array to hold hours

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + NUM_EMPLOYEES + " employees who all earn the same hourly rate.");

        for (int index = 0; index < NUM_EMPLOYEES; index++)
        {
            System.out.print("Employee #" + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }

        for (int i = 0; i < NUM_EMPLOYEES; i++)
        {
            System.out.println("Hours: " + hours[i]);

        }
    }
}
