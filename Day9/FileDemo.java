package Day9; /** feb 28 2024 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDemo
{
    static ArrayList<String> NAMES = new ArrayList<>();
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        FileDemo fileDemo = new FileDemo();
        File file = fileDemo.insertData();
        fileDemo.printDataFromFile(file);

        NAMES.add(4, "Johnson");

        printArray();

    }

    public void printDataFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            // Read lines from the file until the end
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File createFile() {
        System.out.println("To Create a File, Please Enter the file name: ");
        String fileName = SCANNER.nextLine() + ".txt";

        return new File(fileName);
    }

    public File insertData() throws FileNotFoundException {

        File file = createFile();
        PrintWriter printWriter = new PrintWriter(file);

        while (true) {
            System.out.println("Enter your Data: ");
            String value = SCANNER.nextLine();
            NAMES.add(value);

            if (value.equalsIgnoreCase("exit") || value.equals(" ")) {
                break;
            }
        }

        // Close the PrintWriter to ensure data is written to the file
        printWriter.close();

        return file;
    }


    public static void printArray() {

        for (String name: NAMES) {
            System.out.println("Name: " + name);
        }
    }
}
