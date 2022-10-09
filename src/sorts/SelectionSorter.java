package sorts;

import utilities.Utility;

/**
 * The type Basic sorts.
 *
 * @author Jacob J
 * @version 1.0
 */
public class SelectionSorter {
    /**
     * Selection sort.
     *
     * @param array the array
     */
    public static void sort(int[] array)
    {
        // make n selections, where n is array.length
        for (int i = 0; i < array.length; i++)
        {
            int smallest = i;

            // find the next smallest element for index i
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[smallest])
                {
                    smallest = j;
                }
            }

            // swap whatever is in index i with the next smallest element
            Utility.swap(array, i, smallest);
        }
    }
}
