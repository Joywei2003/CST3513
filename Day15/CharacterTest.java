package Day15;   /** mar 20 2024 */
import java.util.Scanner;

public class CharacterTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a character: ");
            ch = scanner.next().charAt(0);

            if (Character.isLetter(ch)) {
                System.out.println(ch + " is a letter");

                if (Character.isUpperCase(ch)) {
                    System.out.println(ch + " is an uppercase letter");
                } else {
                    System.out.println(ch + " is a lowercase letter");
                }
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit");
            }
            else {
                System.out.println(ch + " is a special character");
            }

            System.out.println("=====================================");
        }
    }
}
