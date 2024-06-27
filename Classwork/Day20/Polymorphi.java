package Day20;  /** apr 8 2024 */
import Day16.Exam.FinalExam;
import Day16.Grade.GradedActivity;

/**
 * This program demonstrates polymorphic behavior
 */
public class Polymorphi
{
    public static void main(String[] args) {
        // Create an array of GradedActivity reference
        GradedActivity[] tests = new GradedActivity[3];

        // The first test is a regular exam with a numeric score of 95
        tests[0] = new GradedActivity();
        tests[0].setScore(95);

        // The second test is a pass/fall test
        // The student missed 5 out of 20 questions and, the minimum passing grade is 60.
        tests[1] = new PassFallExam(20, 5, 60);

        // The third test is the final exaam. There were 50 questions and the student missed 7
        tests[2] = new FinalExam(50,7);

        // Display the grade
        for (int index = 0; index < tests.length; index++)
        {
            System.out.println("Test " + (index+1) + ": score " + tests[index].getScore()
                    + ", grade " + tests[index].getGrade());
        }
    }
}
