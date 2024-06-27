package Day16.Exam; /** mar 25 2024 */
import Day16.Exam.FinalExam;
import java.util.Scanner;

/**
 * This program demonstrates the FinalExam class, which inherits from the GradedActivity class
 */
public class FinalExamDemo
{
    public static void main(String[] args)
    {
        int questions;
        int missed;
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);
        //Get the number of questions on the final Exam and number of questions missed
        System.out.print("Enter the number of questions on the final exam:  ");
        questions = scan.nextInt();
        System.out.print("Enter the number of questions missed by the student:  ");
        missed = scan.nextInt();

        // Create a FinalExam object
        FinalExam exam = new FinalExam(questions, missed);
        //Display the results
        System.out.println("Each question counts " + exam.getPointsEach() + " points.");
        System.out.println("The exam score is " + exam.getScore());
        System.out.println("The exam grade is " + exam.getGrade());

        scan.close();
    }
}
