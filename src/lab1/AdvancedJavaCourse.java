package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    @Override
    public String Prerequisites() {
        setPrerequisites("Prerequisites are: Intro to Programming and Intro to Java");
        return getPrerequisites();
    }

}
