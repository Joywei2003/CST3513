package Day9;  /** feb 28 2024 */
import java.io.*;
import java.util.Scanner;

public class FileReadDemo
{
    public static void main(String[] args) throws IOException
    {
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        // Get the filename.
        System.out.println("Enter the fileName: ");
        String fileName = scan.nextLine();

       // Open file.
        File  file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        // Read lines from the file until no more are left
        while(inputFile.hasNext())
        {
            // Read the next name
            String friendName = inputFile.nextLine();
            //Display the last name read
            System.out.println(friendName);
        }
        // Close file
        inputFile.close();
    }
    public static File createFile() {
        System.out.println("To Create a File, Please Enter the file name: ");
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine() + ".txt";

        return new File(fileName);
    }
}
