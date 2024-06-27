package Day12.metric;  //  03/11/2024
import Day12.metric.Metric;

import java.util.Scanner;

public class MetricDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double kilo, miles;

        System.out.println("------------------------------------------------");
        System.out.print("Enter the miles: ");
        miles = scanner.nextDouble();
        System.out.println("The " + miles + " of miles convert to kilo: " + Metric.milesConvertToKilo(miles));

        System.out.println("------------------------------------------------");
        System.out.println("Enter the kilometer: ");
        kilo = scanner.nextDouble();
        System.out.println("The " + kilo + " of kilo convert to miles: " + + Metric.kiloConvertToMiles(kilo));

    }
}
