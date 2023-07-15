/**
 * StudentGrade class
 * Contains the definition for a class to hold a student name
 * and multiple grades.  The class provides methods for toString,
 * equals, computing a weighted class average and get/set for the attributes.
 *
 * @author David Santos
 */

public class StudentGrade {

    private String name;
    private double quiz1;

    private double quiz2;

    private double quiz3;

    private double midterm;

    private double finalExam;

    /**
     * Constructor that takes in the name of the student and
     * sets all other values to the default of zero
     *
     * @param name1 The name of the student
     */
    public StudentGrade(String name1) {
        name = name1;
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        finalExam = 0;
    }

    /**
     * Default Constructor that takes in no parameters and
     * sets all values to their default value
     */
    public StudentGrade() {
        name = "";
        quiz1 = 0;
        quiz2 = 0;
        quiz3 = 0;
        midterm = 0;
        finalExam = 0;
    }

    /**
     * computeAverage()
     *
     * @return Average      The students weighted class average
     */
    private double computeAverage() {
        return ((((quiz1 + quiz2 + quiz3) * 20) / 3) * .25) + (midterm * .35) + (finalExam * .40);
    }

    /**
     * toString
     * This method overrides the Object class' toString method
     *
     * @return the student information as a string.  All attributes are
     * included, plus a call to the computeAverage() method for determining
     * class average.
     */

    public String toString() {
        return "Name : " + name
                + "\nQuiz1: " + quiz1 + " Quiz2: " + quiz2 + " Quiz3: " + quiz3 +
                "\nMidterm Exam: " + midterm +
                "\nFinal Exam: " + finalExam +
                "\nClass Average: " + computeAverage();
    }

    /**
     * equals
     * This method overrides the Object class' equals method
     *
     * @param student2 the student to which to compare this one
     * @return true if student name is the same between this student
     * and the passed in student.  false otherwise.
     */

    public boolean equals(StudentGrade student2) {
        return this.getName().equals(student2.getName());
    }

    /**
     * getName
     *
     * @return name    the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     *
     * @param n the value to set our student name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * getQuiz1
     *
     * @return quiz1    the first quiz score
     */
    public double getQuiz1() {
        return quiz1;
    }

    /**
     * setQuiz1
     *
     * @param q1 the value to set our first quiz
     * @return true if quiz value is in the range 0-5.
     * false if it is out of range
     */
    public boolean setQuiz1(double q1) {
        boolean retVal = false;
        if (q1 >= 0 && q1 <= 5) {
            quiz1 = q1;
            retVal = true;
        }
        return retVal;
    }

    /**
     * setQuiz2
     *
     * @param q2 the value to set our second quiz
     * @return true if quiz value is in the range 0-5 or false
     * if it is out of range
     */
    public boolean setQuiz2(double q2) {
        boolean retVal = false;
        if (q2 >= 0 && q2 <= 5) {
            quiz2 = q2;
            retVal = true;
        }
        return retVal;
    }

    /**
     * setQuiz3
     *
     * @param q3 the value to set our third quiz
     * @return true if quiz value is in the range 0-5 or false
     * if it is out of range
     */
    public boolean setQuiz3(double q3) {
        boolean retVal = false;
        if (q3 >= 0 && q3 <= 5) {
            quiz3 = q3;
            retVal = true;
        }
        return retVal;
    }

    /**
     * setMidterm
     *
     * @param m the value to set our midterm
     * @return true if exam value is in the range 0-100 or false
     * if it is out of range
     */
    public boolean setMidterm(double m) {
        boolean retVal = false;
        if (m >= 0 && m <= 100) {
            midterm = m;
            retVal = true;
        }
        return retVal;
    }

    /**
     * setFinalexam
     *
     * @param f the value to set our final
     * @return true if exam value is in the range 0-100 or false
     * if it is out of range
     */
    public boolean setFinalExam(double f) {
        boolean retVal = false;
        if (f >= 0 && f <= 100) {
            finalExam = f;
            retVal = true;
        }
        return retVal;
    }

    /**
     * getQuiz2
     *
     * @return quiz2    the second quiz score
     */
    public double getQuiz2() {
        return quiz2;
    }

    /**
     * getQuiz3
     *
     * @return quiz3    the third quiz score
     */
    public double getQuiz3() {
        return quiz3;
    }

    /**
     * getMidterm
     *
     * @return midterm    the midterm exam score
     */
    public double getMidterm() {
        return midterm;
    }

    /**
     * getFinalExam
     *
     * @return FinalExam    the FinalExam exam score
     */
    public double getFinalExam() {
        return finalExam;
    }
}
