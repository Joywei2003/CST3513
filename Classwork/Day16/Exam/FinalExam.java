package Day16.Exam;  /** mar 25 2024 */
import Day16.Grade.GradedActivity;
/**
 * This program determines the grade for the final Exam
 */
public class FinalExam extends GradedActivity
{
    private int numQuestions;       //The number of questions on the exam.
    private double pointsEach;      //The number of points for each question
    private int numMissed;          //The number of questions missed by the student.

    /**
     * The Constructor accepts as arguments the number of questions on the exam and the number of questions the student missed
     */
    public FinalExam(int questions, int missed)
    {
        double numericScore;
        //Set the numQuestions and numMissed fields.
        numQuestions = questions;
        numMissed = missed;

        // Calculate the points for each question and the numeric score for this exam
        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);
        //Call the superclass setScore method to sey the numeric score
        setScore(numericScore);
    }
    // The getPointsEach meathod returns the pointsEach field
    public double getPointsEach()
    {
        return pointsEach;
    }
    // The getNumMissed meathod returns the numMissed field
    public int getNumMissed()
    {return numMissed;}
}
