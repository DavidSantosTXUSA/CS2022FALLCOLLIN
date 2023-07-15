/**
 * This program simulates what its like to use a Magic 8 Ball
 * it takes a question from the user and responds with a randomly
 * generated prediction.
 * @Author David Santos
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> answers = new ArrayList<String>();
        Scanner key = new Scanner(System.in);
        answers.add("Not on your life.");
        answers.add("Clearly NO.");
        answers.add("Ask me later.");
        answers.add("Absolutely!");
        answers.add("Murky, the future is.");
        answers.add("A resounding YES.");
        answers.add("No idea. You decide.");
        answers.add("Sounds OK to me.");
        String choice = "";
        String input = "";
        do {
            System.out.println("What is your question for the all knowing Magic 8 ball");
            input = key.nextLine();
            System.out.println("\nMagic 8 ball says...");
            printRandom(answers);
            System.out.print("\nWould you like to know the future again? y/n: " );
            choice = key.nextLine();

        }while(choice.equalsIgnoreCase("y"));
    }
    public static void printRandom(ArrayList<String> a)
    {
        int ran = (int) (Math.random()*8);
        System.out.println(a.get(ran));
    }
}