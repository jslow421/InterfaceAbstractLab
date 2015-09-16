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
        Intro.setCourseNumber("123");
        Intro.setCredits(3);
        
        Java1.setCourseName("Intro to Java");
        Java1.setCourseNumber("456");
        Java1.setCredits(4);
        
        Java2.setCourseName("Advanced Java");
        Java2.setCourseNumber("789");
        Java2.setCredits(4);
        
        System.out.println("Course Name: " + Intro.getCourseName());
        System.out.println("Prerequisites: " + Intro.Prerequisites());
        System.out.println("Credits: " + Intro.getCredits());
        System.out.println("Course Number: " + Intro.getCourseNumber());
        
        System.out.println("");
        
        System.out.println("Course Name: " + Java1.getCourseName());
        System.out.println("Prerequisites: " + Java1.Prerequisites());
        System.out.println("Credits: " + Java1.getCredits());
        System.out.println("Course Number: " + Java1.getCourseNumber());
        
        System.out.println("");
        
        System.out.println("Course Name: " + Java2.getCourseName());
        System.out.println("Prerequisites: " + Java2.Prerequisites());
        System.out.println("Credits: " + Java2.getCredits());
        System.out.println("Course Number: " + Java2.getCourseNumber());
        
        
        
        
    }
    
}
