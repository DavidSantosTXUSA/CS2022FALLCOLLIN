/**
 * Parent class bus
 * contains values for the name of the bus
 * and year the bus was made
 */
public class Bus {
        private String bus;
        private String year;
        public Bus(String b, String y)
        {
            bus = b;
            year = y;
        }
        public Bus()
        {
            bus = "";
            year = "";
        }
        public void setBusName(String a)
        {
            bus = a;
        }
        public void setBusYear(String a)
        {
            year = a;
        }
        public String getBusName()
        {
            return bus;
        }
        public String getBusYear()
        {
            return year;
        }
        @Override
        public String toString()
        {
            String output = "Bus Name: " + bus +
                    "\nYear built: " + year + "\n------------------------ ";
            return output;
        }
}
