package Day20; /** apr 8 2024 */

/**
 * This program determines a passing or failing grade for an exam
 */
public class PassFallExam extends PassFallActivity
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    //  The constructor accepts the number of questions on the exam, the number of the student missed, and the minimum passing score
    public PassFallExam(int questions, int missed, double minPassing)
    {
        // Call the superclass constructor
        super(minPassing);

        // Declare a local variable for a numeric score.
        double numericScore;

        // Set the numQuestions and numMissed fields
        numQuestions = questions;
        numMissed = missed;

        // Calculate the points for each question and the numeric score for this exam
        pointsEach = 100.0/questions;
        numericScore = 100.0 - (missed * pointsEach);

        // Call the superclass setScore method to set the numeric score
        setScore(numericScore);
    }

    // The getPointsEach method returns the pointsEach field
    public double getPointsEach()
    {
        return pointsEach;
    }

    // The getMunMissed method returns the numMissed field
    public int getNumMissed()
    {
        return numMissed;
    }
}
