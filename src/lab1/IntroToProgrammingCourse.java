package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse{
   /* private String courseName;
    private String courseNumber;
    private double credits;*/
    //private String prerequisites;
    
    @Override
    public String Prerequisites() {
        super.setPrerequisites("There are no prerequisites for this course");
        return super.getPrerequisites();
    }
    
    



    
}
