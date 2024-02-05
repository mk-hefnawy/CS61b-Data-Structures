package org.example.Sorting;

public class SelectionSort {


    public static void testSelectionSort(int[] input, int[] expected){
        int[] inp = new int[input.length];
        System.arraycopy(input, 0, inp, 0, input.length);

        selectionSort(inp);

        for (int i = 0; i < inp.length; i++){
            if (expected[i] != inp[i]){
                System.out.println("Error");
                System.out.println("Nismatch at ppsition " + i + " expexted: " + expected[i] + " but found: " + inp[i]);
                return;
            }
        }
    }
    public static void selectionSort(int[] numbers){

        for (int i = 0; i< numbers.length ; i++){
            int minIndex = -1;
            int min = Integer.MAX_VALUE;
            for (int j = i ; j < numbers.length ; j++){
                if (numbers[j] < min){
                    min = numbers[j];
                    minIndex = j;
                }
            }

            swap(i, minIndex, numbers);
        }
    }

    private static void swap(int index1, int index2, int[] numbers){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public static void selectionSortRecursively(int [] numbers){
        selectionSortRecursively(numbers, 0);
    }
    private static void selectionSortRecursively(int[] numbers, int start){

        if (start >= numbers.length - 1) return;

        int minIndex = start;
        for (int i = start + 1; i < numbers.length ; i++){
            if (numbers[i] < numbers[minIndex]) minIndex = i;
        }

        swap(start, minIndex, numbers);
        selectionSortRecursively(numbers, start + 1);

    }
}
