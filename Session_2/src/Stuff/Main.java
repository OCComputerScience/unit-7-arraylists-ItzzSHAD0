package Stuff;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 1, 90};

        arr = sortArrayR(arr);

        for (int num : arr)
        {
            System.out.print(num + ", ");
        }
    }

    public static int[] sortArrayR(int[] arr)
    {
        if (arr.length == 0) return arr;

        // Breaks arry down into sorted pairs
        for (int i = 0; i < arr.length - 1; i += 2)
        {
            if (i == arr.length) break;

            if (arr[i] > arr[i + 1])
            {
                SwapElements(arr, i, i + 1);
            }
        }

        for (int i = 0; i < (arr.length - 1) / 2; i += 2)
        {

        }

        return arr;
    }

    public static void sortArraySort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int lowestIdx = i;

            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[lowestIdx] > arr[j])
                {
                    lowestIdx = j;
                }

                SwapElements(arr, i, lowestIdx);
            }
        }
    }

    private static void SwapElements(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    /*
        1. Create a new array to put smallest in order inside
        2. Loop through each index of the array
        3. For each index loop through to find the smallest index
        4. Set that index of the first loop for each element of the new array
     */
}
