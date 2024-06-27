package Day20;  /** apr 8 2024 */
import Day16.Grade.GradedActivity;

/**
 * This class holds a numeric score and determines either the score is passing and failing
 */
public class PassFallActivity extends GradedActivity
{
    private double minPassingScore;
    // The constructor accepts the minimum passing score as its argument
    public PassFallActivity(double mps)
    {
        minPassingScore = mps;
    }
    // The getGrade method returna a letter grade determined from the score filed.
    // This method in the superclass
    public char getGrade()
    {
        char letterGrade;
        if(super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';
        return letterGrade;
    }
}
