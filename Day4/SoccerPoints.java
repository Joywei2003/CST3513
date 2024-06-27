package Day4; /** feb 7 2024 */
import java.util.Scanner;

public class SoccerPoints
{
    public static void main(String[] args)
    {
        int points, totalPoints=0;
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        // Display instructions
        System.out.println("Enter the number of points your team ");
        System.out.println("has earned for each game this season. ");
        System.out.println("Enter -1 when finished. ");
        System.out.println();
        // Get the number of points
        System.out.println("Enter game points or -1 to end: ");
        points = scan.nextInt();

        //Accumulate the points till -1 is entered
        while (points != -1)
        {
            totalPoints += points;
            System.out.println("Enter game points or -1 to end: ");
            points = scan.nextInt();
        }

        //Display results
        System.out.println("The total points are: " + totalPoints);
    }
}
