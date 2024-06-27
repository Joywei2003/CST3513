package Day16.Grade;

import Day16.Grade.GradedActivity;

import java.util.Scanner;

/**
 * This program demonstrates the GradedActivity Class
 */
public class GradeDemo
{
    public static void main(String[] args)
    {
        double testscore;
        // Create a Scanner object for input
        Scanner scan = new Scanner(System.in);

        //Create a GradedActivity object
        GradedActivity grade = new GradedActivity();

        //Get a test score from user
        System.out.println("Enter a numeric test score: ");
        testscore = scan.nextDouble();

        // Set the GradedActivity objects score
        grade.setScore(testscore);

        //Display the letter grade for that score.
        System.out.println("The grade for that test is  " + grade.getGrade());
    }
}
