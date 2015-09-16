package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    @Override
    public String Prerequisites() {
        super.setPrerequisites("Prerequisites are: Intro to Programming");
        return this.getPrerequisites();
    }
    /* String courseName;
     private String courseNumber;
     private double credits;
     private String prerequisites

     public IntroJavaCourse(String courseName, String courseNumber) {
     this.courseName = courseName;
     this.courseNumber = courseNumber;
     } */

}
