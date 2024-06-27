package Day19; /** apr 3 2024 */
import Day16.Grade.GradedActivity;

/**
 * This class computes a curved grade.
 * It extends the GradedActivity class
 */
public class CurvedActivity extends GradedActivity {
    double rawScore, percentage;

    // The constructor gets the curve percentage
    public CurvedActivity(double percent)
    {
        percentage = percent;
        rawScore = 0.0;
    }
    // The setScore method overrides the superclass setScore method.
    //This Version accepts the unadjusted score as an argument.
    //That score is multiplied by the curve percentage and the result is sent as an argument to the superclass setScore method.

    @Override
    public void setScore(double s)
    {
        rawScore = s;
        super.setScore(rawScore * percentage);
    }
    //The getRawScore method returns the raw score
    public double getRawScore()
    {
        return rawScore;
    }

    // The getPercentage method returns the curve percentage
    public double getPercentage() {
        return percentage;
    }
}
