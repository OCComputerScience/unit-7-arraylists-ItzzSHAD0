package BillBoardTop10;

import java.util.ArrayList;

public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<>();

    public void add(Musician artist)
    {
        if (top10.contains(artist))
        {
            System.out.println("Artist already exists...");
            return;
        }

        if (top10.size() < 10 && artist.getIsPlatinum())
        {
            top10.add(artist);
        }
        else
        {
            if (artist.getIsPlatinum())
            {
                replace(artist);
            }
        }
    }

    public void replace(Musician artist)
    {
        int lowestMuscian = 0;

        for (int i = 1; i < top10.size(); i++)
        {
            if (top10.get(i).getWeeksInTop40() < (top10.get(lowestMuscian).getWeeksInTop40()))
            {
                lowestMuscian = i;
            }
        }

        if (top10.get(lowestMuscian).getWeeksInTop40() < artist.getWeeksInTop40())
        {
            System.out.println("\nThe musician " + top10.get(lowestMuscian).getName() + " has been replaced by " + artist.getName() + ".");
            top10.set(lowestMuscian, artist);
        }
        else
        {
            System.out.println("\nSorry, " + artist.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
    }






    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}
