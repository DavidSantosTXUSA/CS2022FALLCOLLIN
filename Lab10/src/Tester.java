/**
 * Lab 10
 * Tester class that demonstrates what the program does
 * @Author David Santos
 */

import java.util.ArrayList;

public class Tester {
    public static void main(String args[])
    {
        ArrayList<Bus> list = new ArrayList<>();
        Bus myBus = new Bus("Bus McBusFace","2022");
        String[] myArray = {"Friday, Saturday, Sunday, Wednesday"};
        PartyBus myPartyBus = new PartyBus("777",myArray);
        SchoolBus mySchoolBus = new SchoolBus("FISD Bus 134", 50);
        list.add(myBus);
        list.add(myPartyBus);
        list.add(mySchoolBus);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
