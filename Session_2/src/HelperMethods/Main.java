package HelperMethods;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> myList = new ArrayList<Double>();

        for (int i = 0; i < 4; i++)
        {
            myList.add((double) i);
        }

        ArrayListMethods.print(myList);
        System.out.println();

        myList = ArrayListMethods.condense(myList);

        ArrayListMethods.print(myList);
        System.out.println();

        myList = ArrayListMethods.duplicate(myList);

        ArrayListMethods.print(myList);
    }
}
