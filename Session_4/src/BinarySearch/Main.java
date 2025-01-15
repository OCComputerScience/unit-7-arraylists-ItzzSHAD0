package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(
                1, 9, 16, 22, 24, 30, 34, 39, 41, 47,
                51, 58, 61, 65, 68, 71, 74, 75, 76, 77,
                78, 81, 85, 88, 89
        ));

        int idx = binarySearch(sortedNumbers, 89);

        System.out.println(idx);
    }

    public static int binarySearch(ArrayList<Integer> nums, int target)
    {
        if (nums.isEmpty()) return -1;

        int leftBound = 0;
        int rightBound = nums.size();

        double maxIterate = Math.ceil(Math.log10(nums.size()) / Math.log10(2));

        for (int i = 0; i < maxIterate; i++)
        {
            int middle = (rightBound + leftBound) / 2;

            // Checks mid
            if (nums.get(middle) == target)
            {
                return middle;
            }

            // Checks target binary side
            if (nums.get(middle) > target)
            {
                rightBound = middle;
            }
            else
            {
                leftBound = middle;
            }
        }

        return -1;
    }
}