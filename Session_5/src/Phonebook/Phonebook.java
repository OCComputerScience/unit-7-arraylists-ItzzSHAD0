package Phonebook;
import java.util.ArrayList;
import java.util.Arrays;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact c)
    {
        contacts.add(c);
        sort();
    }

    public void sort()
    {
        for (int i = 1; i < contacts.size(); i++)
        {
            int currIdx = i - 1;
            Contact currContact = contacts.get(i);

            while (currIdx >= 0 && currContact.getName().compareTo(contacts.get(currIdx).getName()) < 0)
            {
                contacts.set(currIdx + 1, contacts.get(currIdx));
                currIdx--;
            }

            contacts.set(currIdx + 1, currContact);
        }
    }

    public void printPhonebook()
    {
        System.out.print("[ ");

        for (Contact c : contacts)
        {
            System.out.print(c.getName() + ", ");
        }

        System.out.println("]");
    }

}
