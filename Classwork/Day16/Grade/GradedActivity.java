package Day16.Grade; /** mar 25 2024 */

public class GradedActivity {
    private double score;
    public void setScore(double s)
    {
        score = s;
    }
    // The getScore method returns the score field
    public double getScore()
    {
        return score;
    }
    //The getGrade method returns a letter grade determined from the score field
    public char getGrade() {
        char letterGrade;

        if (getScore() >= 90) {
            letterGrade = 'A';
        } else if (getScore() >= 80) {
            letterGrade = 'B';
        } else if (getScore() >= 70) {
            letterGrade = 'C';
        } else if (getScore() >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
