package Day2; /** Jan 31 2024 */

public class Classwork1 {
    public static void main(String[] args) {
        System.out.print("Enter an interger: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int number){
        while(number!= 0){
            int remainder = number % 10;
            System.out.print(remainder);
            number = number / 10;
        }
        System.out.println();
    }
    //Joyce Wei - Cst3513 Spring 2024
}