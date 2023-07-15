/**
 * SchoolBus subclass of Bus class
 * Shares a name like bus class. has max children instead of years
 */
public class SchoolBus extends Bus
{
    private int max;
    public SchoolBus()
    {
        max = 0;
    }
    public SchoolBus(String name, int a)
    {
        setBusName(name);
        max = a;
    }
    public void setMaxChildren(int a)
    {
        if(a >= 0)
        {
            max = a;
        }else
        {
            System.out.println("No negative numbers");
        }
    }
    public int getMaxChildren()
    {
        return max;
    }

    @Override
    public String toString()
    {
        String output = "Name: " + getBusName() + "\nMax Children: " + max
                +"\n------------------------ ";
        return output;
    }
}
