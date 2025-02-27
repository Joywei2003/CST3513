package Mar14;
import java.util.Scanner;

/**Assignment#### >LandTract
 Make a LandTract class that has two fields: one for the tract's length, and one for the width.
 The class should have a method that returns the tract's area, as well as an equals method and toString method.
 Demonstrate the class in a program that ask the user to enter the dimensions for two tracts of the land.
 The program should display the area of each tract of the land and indicate weather the tracts are of equal size.
 */

public class LandTractAssignment
{
    public static void main(String[] args)
    {
        double length1 = 0, length2=0, width1=0, width2=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the first Land Tract: ");
        length1 = scan.nextInt();
        System.out.println("Enter the width of the first Land Tract: ");
        width1 = scan.nextInt();
        System.out.println("Enter the length of the second Land Tract: ");
        length2 = scan.nextInt();
        System.out.println("Enter the width of the second Land Tract: ");
        width2 = scan.nextInt();

        LandTract landtract1 = new LandTract(length1,width1);
        LandTract landtract2 = new LandTract(length2,width2);

        System.out.println("LandTract1:" + landtract1);
        System.out.println("LandTract1:" + landtract2);

        System.out.println("LandTract1 Area:" + landtract1.getArea());
        System.out.println("LandTract2 Area:" + landtract2.getArea());

        System.out.println("LandTract1 equals LandTract2 " + landtract1.equals(landtract2));
    }
}

