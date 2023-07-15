/**
 * StudentGradeTester class
 * Contains the code to test the methods of the StudentGrade class
 * Creates an instance of a StudentGrade, fills it with data, and displays
 * all information to the screen.
 *
 * @author Daivd Santos
 */

import java.util.Scanner;

public class StudentGradeTester {

    public static void main(String[] args) {
        String name1;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Welcome to the Student Grades Program");
        System.out.print("Enter the name for the student: ");
        name1 = kbd.nextLine();

        //create an instance of StudentGrade, passing in the name given above
        StudentGrade s1 = new StudentGrade(name1);

        //prints out all current information about the student - their name and default
        //values of 0 for all scores and average
        System.out.println("Here is the current data for this student: ");
        System.out.println(s1);

        System.out.println("Please enter the following information for " + s1.getName());

        //placeholder for input from user
        double input = 0;

        //series of do while loops that prevent user from entering invalid scores
        do {
            System.out.print("Quiz1 : ");
            input = kbd.nextInt();
            if (s1.setQuiz1(input)) {

            } else {
                System.out.println("Valid quiz scores are 0-5");
            }
        } while (!s1.setQuiz1(input));
        do {
            System.out.print("Quiz2 : ");
            input = kbd.nextInt();
            if (s1.setQuiz2(input)) {

            } else {
                System.out.println("Valid quiz scores are 0-5");
            }
        } while (!s1.setQuiz2(input));
        do {
            System.out.print("Quiz3 : ");
            input = kbd.nextInt();
            if (s1.setQuiz3(input)) {

            } else {
                System.out.println("Valid quiz scores are 0-5");
            }
        } while (!s1.setQuiz3(input));
        do {
            System.out.print("Midterm : ");
            input = kbd.nextInt();
            if (s1.setMidterm(input)) {

            } else {
                System.out.println("Valid exam scores are 0-100");
            }
        } while (!s1.setMidterm(input));
        do {
            System.out.print("Final Exam : ");
            input = kbd.nextInt();
            if (s1.setFinalExam(input)) {

            } else {
                System.out.println("Valid exam scores are 0-100");
            }
        } while (!s1.setFinalExam(input));

        //prints out all current information about the student, including average
        System.out.println("Here is the current data for this student: ");
        System.out.println(s1);

    }

}
