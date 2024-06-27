package Day11; /** mar 6 2024 */
import java.io.*;
import java.util.Scanner;

public class OpenFile
{
    public static void main(String[] args)
    {
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        // Get the filename.
        System.out.println("Enter the name of file: ");
        String fileName = scan.nextLine().trim();

        try
        {
            // Create a file object to read the file.
            File file = new File(fileName);
            // Create a Scanner object for input
            // If the file does not exist, the following statement will throw a FillNotFoundException
            Scanner inputFile = new Scanner(file);
            // If the file was succesfuly open the following statement will execute
            System.out.println("File was found.");
        }
        catch (FileNotFoundException e)
        {
            // If the file does not exist, the following statement will execute
            System.out.println("File not found");
        }
        System.out.println("Done");
    }
}
