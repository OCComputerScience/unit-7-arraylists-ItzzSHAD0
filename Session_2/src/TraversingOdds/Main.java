package TraversingOdds;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
       ArrayList<Integer> list = new ArrayList<>();

       for (int i = 1; i <= 50; i++)
       {
           list.add(i);
       }

       list = removeEvens(list);

       printArrayList(list);
    }

    public static ArrayList<Integer> removeEvens(ArrayList<Integer> arry)
    {
        if (arry.size() == 0)
            return arry;

        for (int i = 0; i < arry.size(); i++)
        {
            if (arry.get(i) % 2 == 0)
            {
                arry.remove(i);
                i--;
            }
        }

        return arry;
    }

    public static void printArrayList(ArrayList<Integer> arry)
    {
        System.out.print("[");

        for (int i = 0; i < arry.size() - 1; i++)
        {
            System.out.print(arry.get(i) + ", ");
        }

        System.out.print(arry.get(arry.size() - 1));
        System.out.print("]");
    }
}
