package ArrayTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void testArray(){
        int[] arr1 = new int[] {1, 2, 3, 4, 5};

        int[] arr2 = new int[5];
        System.arraycopy(arr1, 0, arr2, 0, 5);

        Assertions.assertArrayEquals(arr1, arr2);
    }

    @Test
    public  void test2(){
        int[][] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] z = new int[3][];
        z[0] = x[0]; // shallow copy
        z[0][0] = -z[0][0];

        int[][] w = new int[3][3];
        System.arraycopy(x[0], 0, w[0], 0, 3);
        w[0][0] = -w[0][0];

        Assertions.assertEquals(x[0][0], -1);
        Assertions.assertEquals(w[0][0], 1);
        System.out.println("Passed");
    }

}
