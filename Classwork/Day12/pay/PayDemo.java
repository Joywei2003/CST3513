package Day12.pay;  //  03/11/2024
import java.util.Scanner;

public class PayDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String choose;
        int hours;
        double payRate, yearSalary;

        System.out.println("Would you prefer to calculate weekly salary base on hourky payrate or yearly salary ");
        System.out.println("Enter S based on year salary or enter H based on hours and payRate");
        choose = scanner.nextLine();

        //Using If statement with equalsIgnoreCase
        /*
        if (choose.equalsIgnoreCase("h"))
        {
            System.out.println("------------------------------------------------");
            System.out.println("Enter the hours you have worked: ");
            hours = scanner.nextInt();
            System.out.println("Enter the payRate: ");
            payRate = scanner.nextDouble();

            System.out.println("------------------------------------------------");
            System.out.println("Your weekly pay: " + Pay.weeklyPay(hours, payRate));
        }
        else if (choose.equalsIgnoreCase("s"))
        {
            System.out.println("------------------------------------------------");
            System.out.println("Enter the year of salary: ");
            yearSalary = scanner.nextDouble();
            System.out.println("------------------------------------------------");
            System.out.println("Your weekly pay: " + Pay.weeklyPay(yearSalary));
        }
        else
        {
             System.out.println("You have entered invalid inputs!");
        }
         */

        //Using switch
        switch (choose)
        {
            case "h":
            case "H":
                System.out.println("------------------------------------------------");
                System.out.println("Enter the hours you have worked: ");
                hours = scanner.nextInt();
                System.out.println("Enter the payRate: ");
                payRate = scanner.nextDouble();
                System.out.println("------------------------------------------------");
                System.out.println("Your weekly pay: " + Pay.weeklyPay(hours, payRate));
                break;
            case "s":
            case "S":
                System.out.println("------------------------------------------------");
                System.out.println("Enter the year of salary: ");
                yearSalary = scanner.nextDouble();
                System.out.println("------------------------------------------------");
                System.out.println("Your weekly pay: " + Pay.weeklyPay(yearSalary));
                break;

            default:
                System.out.println("You have entered invalid inputs!");
        }
    }
}
