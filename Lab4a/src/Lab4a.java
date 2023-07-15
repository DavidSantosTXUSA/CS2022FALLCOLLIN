/**
 * @Author David Santos
 * 9/25/2022
 * COSC 1437 section 200
 * This program takes in a .txt file that has the number of steps taken per day
 * and provides three statistics. Number of days that are considered high activity (10,000 steps or higher)
 * and the percent of those days to the total amount of days, Number of days that are considered
 * medium activity (5,000 - 9,999) and the percent of those days to total amount of days
 * and the number of days that are considered low activity (less than 5,000) and the percent
 * of those days to the total amount of days.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab4a {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("steps.txt");
        PrintWriter outfile = new PrintWriter("activityResults.txt");
        Scanner scan = new Scanner(file);

        //variables to store the amount of days of each range
        int highActivity = 0;
        int mediumActivity = 0;
        int lowActivity = 0;

        int current; // used to store the current value we are looking at. that way we can compare it
        //multiple times in the if statements
        double counter = 0;//instead of hardcoding in 365 I added a counter variable
        //that way this program can work for a txt file of any size
        while (scan.hasNext()) { //loop runs until there is nothing else to read in the file
            current = scan.nextInt();
            if (current >= 10000) {
                highActivity++;
            } else if (current >= 5000) {
                mediumActivity++;
            } else {
                lowActivity++;
            }
            counter++;
        }
        outfile.println("***Activity Results***\n");
        outfile.println("High Activity Days: " + highActivity + ", " + (double) Math.round(((highActivity / counter) * 100) * 100) / 100 + "%");//rounds percent to 2 decimal places
        outfile.println("Medium Activity Days: " + mediumActivity + ", " + (double) Math.round(((mediumActivity / counter) * 100) * 100) / 100 + "%");
        outfile.println("Low Activity Days: " + lowActivity + ", " + (double) Math.round(((lowActivity / counter) * 100) * 100) / 100 + "%");
        outfile.close();
    }
}