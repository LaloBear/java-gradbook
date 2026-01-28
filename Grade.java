//A part of Gradebook file

public class Grade {
    private String courseName;
    private double score;

    public Grade(String courseName, double score) {
        this.courseName = courseName;
        this.score = score;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return courseName + ": " + score;
    }
}
