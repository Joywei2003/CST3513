package Feb22;
import java.util.Scanner;

/**Assignment###Array
 Create a RainFall class that stores the total rainfall for each of 12 months into an array of doubles.
 The program should have methods that return the following:
    -total rainfall for the year
    -the average monthly rainfall
    -the month with the most rain
    - the month with the least
 */
public class ArrayAssignment
{
    private double[] rainFall;

    public ArrayAssignment(double[] rain)
    {
        this.rainFall = rain;
    }

    public double getTotalRain()
    {
        // if the rainFall is null, return 0
        if (rainFall == null)
        {
            return 0;
        }

        // if the rainFall has only one element, return the element
        if (rainFall.length < 1)
        {
            return rainFall[0];
        }

        // if the rainFall has more than one element, sum all the elements
        double total = 0;
        for (double sale : rainFall)
        {
            total += sale;
        }
        return total;
    }
    public double getAverageRain()
    {
        // if the rainFall is null, return 0
        if (rainFall == null)
        {
            return 0;
        }

        // if the rainFall has only one element, return the element
        if (rainFall.length < 1)
        {
            return rainFall[0];
        }
        return getTotalRain() / rainFall.length;
    }
    public double getHighestRain() {

        // if the rainFall is null, return 0
        if (rainFall == null)
        {
            return 0;
        }

        // if the rainFall has only one element, return the element
        if (rainFall.length < 1)
        {
            return rainFall[0];
        }

        double highest = rainFall[0];
        for (double sale : rainFall)
        {
            if (sale > highest)
            {
                highest = sale;
            }
        }
        return highest;
    }

    public double getLowestRain()
    {
        // if the rainFall is null, return 0
        if (rainFall == null)
        {
            return 0;
        }
        // if the rainFall has only one element, return the element
        if (rainFall.length < 1)
        {
            return rainFall[0];
        }

        double lowest = rainFall[0];
        for (double sale : rainFall)
        {
            if (sale < lowest) {
                lowest = sale;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double[] rain = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Month "+ (i + 1) +" rain amount: ");
            rain[i] = keyboard.nextDouble();
        }

        ArrayAssignment rainFall = new ArrayAssignment(rain);
        System.out.println("Total rain: " + rainFall.getTotalRain());
        System.out.println("Average rain: " + rainFall.getAverageRain());
        System.out.println("Highest rain: " + rainFall.getHighestRain());
        System.out.println("Lowest rain: " + rainFall.getLowestRain());
    }
}
