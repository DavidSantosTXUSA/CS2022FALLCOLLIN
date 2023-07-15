/**
 * PartyBus subclass of Bus class
 * Shares a name like bus class. has days instead of years
 */

import java.util.Arrays;

public class PartyBus extends Bus
{
    private String[] days;
    public PartyBus(String name, String[] a)
    {
        setBusName(name);
        days = a;
    }
    public PartyBus()
    {
        days = new String[0];
    }

    public void setDays(String[] a)
    {
        days = a;
    }

    public String[] getDays()
    {
        return days;
    }

    public String getDaysAsString()
    {
        String output = "";
        for(int i = 0; i < days.length; i++)
        {
            output += days[i];
        }
        return output;
    }

    @Override
    public String toString()
    {
        String output = "Name: " + getBusName() + "\nDays in Service: "+ getDaysAsString()
                +"\n------------------------ ";
        return output;
    }
}
