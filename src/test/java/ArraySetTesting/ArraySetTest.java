package ArraySetTesting;

import org.example.ArraySet.ArraySet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySetTest {
    ArraySet<Integer> arraySet;

    @BeforeEach
    public void setUp() {
        arraySet = new ArraySet<>();
    }

    @Test
    public void emptyArraySet_sizeReturnsZero() {
        assertEquals(0, arraySet.size());
        assertEquals("[]", arraySet.toString());
    }

    @Test
    public void emptyArraySet_whenAddOneItem_sizeIsOne() {
        arraySet.add(10);
        assertEquals(1, arraySet.size());
    }

    @Test
    public void emptyArraySet_whenAddTwoItems_sizeIsTwo() {
        arraySet.add(10);
        arraySet.add(20);
        assertEquals(2, arraySet.size());
    }

    @Test
    public void emptyArraySet_whenAddTwoIdenticalItems_onlyFirstIsAdded() {
        arraySet.add(10);
        arraySet.add(10);
        assertEquals(1, arraySet.size());
    }

    @Test
    public void emptyArraySet_whenAddThreeItems_containsReturnsTrueForEach() {
        arraySet.add(10);
        arraySet.add(20);
        arraySet.add(30);

        assertTrue(arraySet.contains(10));
        assertTrue(arraySet.contains(20));
        assertTrue(arraySet.contains(30));
    }

    @Test
    public void emptyArraySet_whenAddThreeIdenticalItems_sizeIsOne() {
        arraySet.add(20);
        arraySet.add(20);
        arraySet.add(20);

        assertEquals(1, arraySet.size());
    }

    @Test
    public void testIterations() {
        arraySet.add(20);
        arraySet.add(20);
        arraySet.add(20);

        for (Integer item : arraySet){
            System.out.println(item);
        }


    }
}
