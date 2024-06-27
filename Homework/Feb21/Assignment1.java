package Feb21;
import java.util.Scanner;
import java.lang.Math;

/** Assignment#1
 Write a program that calculates how much a person would earn over a period of time if his or her salary is one penny the first day, two pennies the second day, and continues to double each day.
 The program should display a table showing the salary for each day, then show the total pay at the end of the period.
 The output should be displayed in a dollar amount, not the number of pennies.
 */
public class Assignment1
{
    public static void main(String[] args)
    {
        int numberOfDays = 0;
        double finalAmount = 0;
        double dallors = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        numberOfDays = scan.nextInt();

        double[] total = new double[numberOfDays];

        for (int i = 0; i < (numberOfDays); i++)
        {
            //int exponet = i - 1;
            finalAmount = Math.pow(2, i);
            dallors = finalAmount / 100;
            total[i] = finalAmount;

            System.out.println("On day" + (i + 1) + " you have " + finalAmount + " pennies.");
        }
        System.out.println("You have " + dallors + " after " + numberOfDays + " days.");
    }
}