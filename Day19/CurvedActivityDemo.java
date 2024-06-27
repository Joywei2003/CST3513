package Day19;   /** apr 3 2024 */
import java.util.Scanner;
/**
 * This program demonstrates the CurvedActivity class, which inherits from the GradedActivity class
 */
public class CurvedActivityDemo
{
    public static void main(String[] args)
    {
        double score, curvePercentage;
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);
        // Get the unadjusted exam score and curve percentage
        System.out.print("Enter the student's raw numeric score:");
        score = scan.nextDouble();
        System.out.print("Enter the curve percentage: ");
        curvePercentage = scan.nextDouble();

        //Create a CurvedActivity object
        CurvedActivity curvedExam = new CurvedActivity(curvePercentage);

        //Get the exam score
        curvedExam.setScore(score);

        //Display the result
        System.out.println("The raw score is " + curvedExam.getRawScore());
        System.out.println("The curved score is " + curvedExam.getScore());
        System.out.println("The exam grade is " + curvedExam.getGrade());
    }
}
