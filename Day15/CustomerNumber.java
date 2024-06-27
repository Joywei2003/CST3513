package Day15;   /** mar 20 2024 */
import java.util.Scanner;

public class CustomerNumber {

    public static void main(String[] args) {

        String customerNumber;

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("Format: LLL-letter, NNNN-digit");
            System.out.print("Enter customer number: ");
            customerNumber = scanner.nextLine();

            if (isValid(customerNumber)) {
                System.out.println("Valid customer number");
            } else {
                System.out.println("Invalid customer number");
            }

            System.out.println("=====================================");
        }


    }

    private static boolean isValid(String customerNumber) {



//        if customer number is not 7 characters long, return false
        if (customerNumber.length() != 7) {
            return false;
        }

//        using for loop to validate
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(customerNumber.charAt(i))) {
                return false;
            }
        }

        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(customerNumber.charAt(i))) {
                return false;
            }
        }

        return true;

////       using regex to validate
//        return customerNumber.matches("[a-zA-Z]{3}[0-9]{4}");
    }
}
