package LinearSearch;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> array = new ArrayList<>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);


        int idx = search(array, 2.9);

        System.out.println(idx);
    }

    public static int search(ArrayList<Double> array, double target)
    {
        if (array.isEmpty()) return -1;

        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).equals(target))
            {
                return i;
            }
        }

        return -1;
    }
}
