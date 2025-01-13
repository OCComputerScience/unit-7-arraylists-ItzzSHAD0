package DataPurge;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> members = new ArrayList<String>();
        addMembers(members);

        DataPurge.removeDuplicates(members);
        DataPurge.removeName(members, "Josie");
        DataPurge.removeName(members, "Trent");
        DataPurge.removeName(members, "finley");
        boolean isCorrectlyFormatted = DataPurge.correctlyFormatted(members);

        System.out.println("Is Correctly Formatted: " + isCorrectlyFormatted);

        for (String value : members)
        {
            System.out.println(value);
        }


    }
    public static void addMembers(ArrayList<String> emails)
    {
        emails.add("London Braun");
        emails.add("Jaslyn Chavez");
        emails.add("Daphne Kane");
        emails.add("Aden Brock");
        emails.add("Jaime Wolf");
        emails.add("finley Wood");
        emails.add("Trent maynard");
        emails.add("Jaiden Krause");
        emails.add("London Braun");
        emails.add("Jaiden Krause");
        emails.add("Davon Mccormick");
        emails.add("JosieFreeman");
        emails.add("Jaslyn Chavez");
        emails.add("Zaiden Harding");
        emails.add("Araceli Castaneda");
        emails.add("Jaime Wolf");
        emails.add("London Braun");

    }
}
