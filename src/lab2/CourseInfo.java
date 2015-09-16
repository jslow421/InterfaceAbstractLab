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
        CollegeClass java2 = new AdvancedJavaCourse();
        
        System.out.println(Intro.Prerequisites());
    }
}
