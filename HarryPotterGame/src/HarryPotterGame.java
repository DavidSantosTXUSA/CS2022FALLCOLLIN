/**
 * @Author David Santos
 * 9/25/2022
 * COSC 1437.200
 * This is harry potter text based game. You are out in the castle past curfew
 * ,and you are trying to get back to your room, but you must avoid the castle caretaker Filch.
 * On your way back to your room you come across three obstacles, and you only know three spells
 * which you cast at random. Each spell only works for one of the obstacles. If you cast the wrong spell
 * Filch gets close to catching you. In my version I made it 7 rounds, so it is not too hard
 */

import java.util.Scanner;

public class HarryPotterGame{
    public static void main(String[] args) {
        //variables
        final int alohomora = 1;
        final int immobulus = 2;
        final int wingardiumLevisoa = 3;
        int counter = 7; //amount of times we can get spell wrong
        int random = 0; //variable that we will be constantly refreshing to be a random number between 1-3
        String userInput = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("You are out past curfew and you hear Filch approaching. \n" +
                "It sounds like he is about " + counter + " minutes away from finding you. \n" +
                "You need to get back to the common room before he catches you! \n" +
                "You run down the hall, turn right, and then suddenly stop. ");

        while (random != alohomora && counter != 0)//checks to see if we cast the right spell and that filch has not caught us yet
        {
            System.out.println("There is a locked door ahead of you. You pull out your wand and \n" +
                    "yell...(press Enter) ");
            userInput = scan.nextLine();
            random = (int) (Math.random() * 3) + 1; //randomizes random to be 1,2 or 3
            if (random == alohomora) { //if we cast right spell counter is not decreased, and we will escape the while loop as well
                System.out.println("Alohomora! \n" +
                        "Well done! The door creaks open and you run through. ");
            } else if (random == immobulus) { // if we cast wrong spell counter is decreased by one, and we use the method hasLost()
                // and use counter as a parameter after we decrease it tocheck if flich has caught us or if he has not
                // we need to display how many minutes he is away from catching us.
                counter--;
                System.out.println("Immobulus! \n" +
                        "Great idea! Now the door is immobile!  Oh wait...");
                hasLost(counter);
            } else if (random == wingardiumLevisoa) {
                counter--;
                System.out.println("Wingardium Leviosa!\n" +
                        "For some reason, the door won't fly up out of its frame. Rats.");
                hasLost(counter);
            }
        }
        //only prints out next part of story if we are not caught
        if (counter > 0) {
            System.out.println("\nThat was close! You sprint down the hallway toward your common room. \n" +
                    "As you near the potions classroom, you hear a loud crash. ");
            System.out.println("A cloud of billiwigs erupts from the room.  Their jar must have fallen \n" +
                    "off of the desk. \n" +
                    "Sigh.  You don't need this right now...you can't get stung! ");
        }
        //resets random variable
        random = 0;
        while (random != immobulus && counter != 0) { //Same idea as first while loop we repeat the same logic throughout the rest of the program
            System.out.println("You stare at the mass amount of billiwigs. You pull out your wand and \n" +
                    "yell...(press Enter) ");
            userInput = scan.nextLine();
            random = (int) (Math.random() * 3) + 1;
            if (random == alohomora) {
                counter--;
                System.out.println("Alohomora!\n" +
                        "Good, unlock their secrets.  Maybe they'll tell you who stole your box of licorice wands.");
                hasLost(counter);

            } else if (random == immobulus) {

                System.out.println("Immobulus! \n" +
                        "Nice work! The pesky creatures are all frozen mid wing-flap. \n" +
                        "You weave your way through the bugs and continue toward your common \n" +
                        "room.\n");

            } else if (random == wingardiumLevisoa) {
                counter--;
                System.out.println("Wingardium Leviosa! \n" +
                        "You.  Helping flying creatures fly since 2020. ");
                hasLost(counter);
            }
        }
        if (counter > 0) {
            System.out.println("\nYou're almost there! The common room is right up the next \n" +
                    "stairwell. \n" +
                    "You race to the bottom of the stairs and come face to face with \n" +
                    "a massive pumpkin pasty blocking the stairs. \n" +
                    "Looks like the Weasley twins have been trying out new pranks. \n");
        }
        random = 0;
        while (random != wingardiumLevisoa && counter != 0) {
            System.out.println("You have to lift this huge pasty out of the way. You pull out \n" +
                    "your wand and yell...(press Enter) ");
            userInput = scan.nextLine();
            random = (int) (Math.random() * 3) + 1;
            if (random == alohomora) {
                counter--;
                System.out.println("Alohomora! \n" +
                        "You want to open a pumpkin pasty? That sounds messy. ");
                hasLost(counter);

            } else if (random == immobulus) {
                counter--;
                System.out.println("Immobulus! \n" +
                        "Good thinking! Now it doesn't move! Oh... ");
                hasLost(counter);
            } else if (random == wingardiumLevisoa) {
                System.out.println("Wingardium Leviosa! \n" +
                        "The pasty floats up high enough for you to duck underneath. \n" +
                        "You take a quick bite as you go under. Delicious! ");
            }
        }
        if (counter > 0) {
            System.out.println("\nYou reach the door of your common room and slip safely inside. \n" +
                    "Filch is no match for a student of your ability! \n" +
                    "You head to bed and for some reason dream of a chocolate frog \n" +
                    "the size of a house. \n" +
                    "Game over. You win! ");
        }

    }

    /*
    This method saves us alot of time when coding. I do not have to retype the game over message or retype how many minutes
    filch is because I can just call this method with counter as the parameter, and it will do all of that for me.
     */
    public static void hasLost(int value) {
        System.out.println("Oh no! You can hear Filch getting closer!");
        if (value == 0) {
            System.out.println("\nFilch grabs you by your collar. \"Aha! Out after curfew I \n" +
                    "see...detention for you!\" \n" +
                    "Filch marches you to the headmaster's office while muttering about his \n" +
                    "great ideas for your detention. \n" +
                    "Game Over. ");
        } else {
            System.out.println("\nIt sounds like he is " + value + " minutes away!");
        }
    }
}