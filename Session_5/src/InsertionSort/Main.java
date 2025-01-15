package InsertionSort;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = {5, 3, 4, 1, 6, 2};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        insertionSort(array1);

        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int currIdx = i - 1;
            int currNum = arr[i];

            while (currIdx >= 0 && currNum < arr[currIdx])
            {
                arr[currIdx + 1] = arr[currIdx];
                currIdx--;
            }

            arr[currIdx + 1] = currNum;

            System.out.println(Arrays.toString(arr));
        }

        System.out.println();
    }

    public static void swapElements(int[] arr, int idxOne, int idxTwo)
    {
        int temp = arr[idxOne];
        arr[idxOne] = arr[idxTwo];
        arr[idxTwo] = temp;
    }

}
