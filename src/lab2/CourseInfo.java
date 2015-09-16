/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author John
 */
public class CourseInfo {

    public static void main(String[] args) {
        CollegeClass Intro = new IntroToProgrammingCourse();
        CollegeClass Java1 = new IntroJavaCourse();
        CollegeClass Java2 = new AdvancedJavaCourse();

        System.out.println("Course Name: " + Intro.CourseName());
        System.out.println("Course Number: " + Intro.CourseNumber());
        System.out.println("Course Credits: " + Intro.CourseCredits());
        System.out.println("Prerequisites: " + Intro.Prerequisites());

        System.out.println("");

        System.out.println("Course Name: " + Java1.CourseName());
        System.out.println("Course Number: " + Java1.CourseNumber());
        System.out.println("Course Credits: " + Java1.CourseCredits());
        System.out.println("Prerequisites: " + Java1.Prerequisites());

        System.out.println("");

        System.out.println("Course Name: " + Java2.CourseName());
        System.out.println("Course Number: " + Java2.CourseNumber());
        System.out.println("Course Credits: " + Java2.CourseCredits());
        System.out.println("Prerequisites: " + Java2.Prerequisites());
    }
}
