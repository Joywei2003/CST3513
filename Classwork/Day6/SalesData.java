package Day6;  /** feb 21 2024 */
import java.util.Scanner;

public class SalesData
{
    private double[] salesData;
    public SalesData(double[] sales)
    {
        this.salesData = sales;
    }

    public double getTotalSales()
    {
        // if the salesData is null, return 0
        if (salesData == null)
        {
            return 0;
        }

        // if the salesData has only one element, return the element
        if (salesData.length < 1)
        {
            return salesData[0];
        }

        // if the salesData has more than one element, sum all the elements
        double total = 0;
        for (double sale : salesData)
        {
            total += sale;
        }
        return total;
    }

    public double getAverageSales()
    {
        // if the salesData is null, return 0
        if (salesData == null)
        {
            return 0;
        }
        // if the salesData has only one element, return the element
        if (salesData.length < 1)
        {
            return salesData[0];
        }
        return getTotalSales() / salesData.length;
    }

    public double getHighestSales()
    {
        // if the salesData is null, return 0
        if (salesData == null)
        {
            return 0;
        }

        // if the salesData has only one element, return the element
        if (salesData.length < 1)
        {
            return salesData[0];
        }

        double highest = salesData[0];
        for (double sale : salesData)
        {
            if (sale > highest)
            {
                highest = sale;
            }
        }
        return highest;
    }

    public double getLowestSales()
    {
        // if the salesData is null, return 0
        if (salesData == null)
        {
            return 0;
        }

        // if the salesData has only one element, return the element
        if (salesData.length < 1)
        {
            return salesData[0];
        }

        double lowest = salesData[0];
        for (double sale : salesData)
        {
            if (sale < lowest)
            {
                lowest = sale;
            }
        }
        return lowest;
    }


    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of sales: ");

        int numberOfSales = keyboard.nextInt();

        if (numberOfSales < 1)
        {
            System.out.println("Invalid number of sales");
            return;
        }

        double[] sales = new double[numberOfSales];

        for (int i = 0; i < numberOfSales; i++)
        {
            System.out.print("Day "+ (i + 1) +" sale amount: ");
            sales[i] = keyboard.nextDouble();
        }
        SalesData salesData = new SalesData(sales);

        System.out.println("Total Sales: " + salesData.getTotalSales());
        System.out.println("Average Sales: " + salesData.getAverageSales());
        System.out.println("Highest Sales: " + salesData.getHighestSales());
        System.out.println("Lowest Sales: " + salesData.getLowestSales());
    }
}
