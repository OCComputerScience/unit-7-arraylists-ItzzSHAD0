package HelperMethods;

import java.util.ArrayList;

public class ArrayListMethods
{
    public static void print(ArrayList<Double> arry)
    {
        for(Double value : arry)
        {
            System.out.println(value);
        }
    }

    public static ArrayList<Double> condense(ArrayList<Double> arry)
    {
        for (int i = 0; i < arry.size() - 1; i++)
        {
            arry.set(i, arry.get(i) * arry.get(i + 1));
            arry.remove(i + 1);
        }

        return arry;
    }

    public static ArrayList<Double> duplicate(ArrayList<Double> arry)
    {
        int temp = arry.size();
        for (int i = 0; i < temp; i++)
        {
            arry.add(arry.get(i));
        }

        return arry;
    }
}
