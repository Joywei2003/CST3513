package Day8; /** feb 26 2024 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        //Enter the company name: google
        //Enter the company name: apple
        //Enter the company name: nytimes
        //Enter the company name: washingtonpost
        //Enter the company name: alibaba
        //Enter the company name: reddit
        //Enter the company name: x
        //Enter the company name: spacex
        //Enter the company name: tesla
        //Enter the company name: walmart

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listCompanies = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter the company name: ");
            String companyName = scanner.nextLine();
            listCompanies.add(companyName);
        }

        System.out.println("-------------------------");
        System.out.println("The companies are: ");

        //strong for each loop
        //for (String company : listCompanies)
        //{
        //     System.out.println(company);
        //}

        //regular for loop
        for (int i = 0; i < listCompanies.size(); i++)
        {
            System.out.print( "Company " + (i + 1) + " :" + listCompanies.get(i) + "\n");
        }

        System.out.println("-------------------------");
        System.out.println("Size of the list: " + listCompanies.size());
        //forEach method
        //listCompanies.forEach(System.out::println);

    }
}
