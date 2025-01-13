package FantasyFootball;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);

        ArrayList<String> roster = pickPlayers(availablePlayers);

        for (String player : roster)
        {
            System.out.println(player);
        }
    }

    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Frodo");
        array.add("Gandalf");
        array.add("Aragorn");
        array.add("Legolas");
        array.add("Gimli");
        array.add("Samwise");
        array.add("Bilbo");
        array.add("Gollum");
        array.add("Thorin");
        array.add("Balin");
        array.add("Galadriel");
        array.add("Elrond");
        array.add("Sauron");
        array.add("Melkor");
        array.add("Lúthien");
    }

    public static ArrayList<String> pickPlayers(ArrayList<String> availablePlayers)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> roster = new ArrayList<String>();

        while (roster.size() < 5)
        {
            System.out.println("Enter name of player to add: ");
            String inputPlayerName = input.nextLine();

            if (availablePlayers.contains(inputPlayerName))
            {
                roster.add(inputPlayerName);
                System.out.println("Successfully added player...");
            }
            else
            {
                System.out.println(inputPlayerName + " is not an available player.");
            }

            System.out.println();
        }

        return roster;
    }
}
