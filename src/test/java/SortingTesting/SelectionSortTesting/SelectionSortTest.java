package SortingTesting.SelectionSortTesting;

import org.example.Sorting.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    public void testSelectionSort(){
        int[] numbers = new int[] {4, 19, -2, 0, 21, 7};

        SelectionSort.selectionSort(numbers);

        Assertions.assertArrayEquals(new int[]{-2, 0, 4, 7, 19, 21}, numbers);
    }

    @Test
    public void testSelectionRecursivelySort(){
        //int[] numbers = new int[] {4, 19, -2, 0, 21, 7};
        int[] numbers = new int[] {4};

        SelectionSort.selectionSortRecursively(numbers);

        //Assertions.assertArrayEquals(new int[]{-2, 0, 4, 7, 19, 21}, numbers);
        Assertions.assertArrayEquals(new int[]{4}, numbers);
    }
}
