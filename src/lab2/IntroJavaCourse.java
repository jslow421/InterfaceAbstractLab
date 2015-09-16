package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements CollegeClass {

    String courseName;
    private String courseNumber;
    private double courseCredits;
    private String prerequisites;
    /*
     public IntroJavaCourse(String courseName, String courseNumber) {
     this.courseName = courseName;
     this.courseNumber = courseNumber;
     }

     public String getCourseNumber() {
     return courseNumber;
     }

     public void setCourseNumber(String courseNumber) {
     this.courseNumber = courseNumber;
     }

     public double getCredits() {
     return credits;
     }

     public void setCredits(double credits) {
     this.credits = credits;
     }

     public String getPrerequisites() {
     return prerequisites;
     }

     public void setPrerequisites(String prerequisites) {
     this.prerequisites = prerequisites;
     }

     */

    public final String CourseName() {
        courseName = "Intro to Java";
        return courseName;
    }

    public final String CourseNumber() {
        courseNumber = "456";
        return courseNumber;
    }

    public final double CourseCredits() {
        courseCredits = 3;
        return courseCredits;
    }

    public final String Prerequisites() {
        prerequisites = "Intro to programming";
        return prerequisites;
    }
}
