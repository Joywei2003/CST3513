package Day3;  /** feb 5 2024 */
import java.util.Scanner;

public class LoanQualifier
{

    public static void main (String[] args)
    {
        double salary, yearsOnJob;
        // Create a Scanner object for input// Create a scanner input
        Scanner scan = new Scanner(System.in);

        //Get the salary and number of years worked
        System.out.print("Enter your annual salary: ");
        salary = scan.nextDouble();
        System.out.print("Enter the number of years at your current job: ");
        yearsOnJob = scan.nextDouble();

        //Determine if the user qualifies for the loan
        if (salary >= 50000)
        {
            if (yearsOnJob >= 2)
            {
                System.out.println("You qualify for the loan. ");
            }
            else
            {
                System.out.println("You must work at your current job for two years to qualify.");
            }
        }
        else
        {
            System.out.println("You must earn at least $50,000 per year to qualify");
        }
    }
}
