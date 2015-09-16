/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author John
 */
public class CourseInfo {
    public static void main(String[] args) {
        ProgrammingCourse Intro = new IntroToProgrammingCourse();
        ProgrammingCourse Java1 = new IntroJavaCourse();
        ProgrammingCourse Java2 = new AdvancedJavaCourse();
        
        Intro.setCourseName("Intro to Programming");
        
        System.out.println(Intro.getCourseName());
    }
    
}
