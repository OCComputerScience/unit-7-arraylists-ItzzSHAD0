package DataPurge;

import java.util.ArrayList;

public class DataPurge
{

    public static void removeDuplicates(ArrayList<String> people)
    {
        if (people.size() == 0) return;

        for (int i = 0; i < people.size(); i++)
        {
            String tempName = people.set(i, "null");
            while (people.contains(tempName))
            {
                System.out.println("Found Duplicate: " + tempName);
                people.remove(people.indexOf(tempName));
            }
            people.set(i, tempName);
        }
        System.out.println();
    }

    public static void removeName(ArrayList<String> people, String name)
    {
        if (people.size() == 0) return;

        for (int i = 0; i < people.size(); i++)
        {
            String tempName = people.get(i);
            if (tempName.contains(name))
            {
                System.out.println("Removing " + tempName);
                people.remove(i);
                i--;
            }
        }
        System.out.println();
    }

    public static boolean correctlyFormatted(ArrayList<String> people)
    {
        if (people.size() == 0) return true;
        for (String person : people)
        {
            // Check for space between name
            if (!person.contains(" "))
            {
                return false;
            }

            // Check first letter is uppercase
            String firstLetter = person.substring(0, 1);
            if(!firstLetter.equals(firstLetter.toUpperCase()))
            {
                return false;
            }

            // Check first letter last name
            int idx =  people.indexOf(" ") + 1;
            String firstLetterLastName = person.substring(idx, idx + 1);

            if(!firstLetterLastName.equals(firstLetterLastName.toUpperCase()))
            {
                return false;
            }
        }
        return true;
    }
}