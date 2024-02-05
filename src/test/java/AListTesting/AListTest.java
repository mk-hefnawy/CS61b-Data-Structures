package AListTesting;

import org.checkerframework.checker.units.qual.A;
import org.example.AList.AList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AListTest {
    // Initializing
    AList aList;
    @Test
    public void newlyCreatedList_isEmpty(){
        aList = new AList();

        assertTrue(aList.isEmpty());
    }

    @DisplayName("Adding an item to an empty list, makes its size 1")
    @Test
    public void addOneItemToAnEmptyList_makesTheSize1(){
        aList = new AList();
        aList.addLast(10);
        assertEquals(1, aList.size());
    }

    @DisplayName("Adding 3 items to an empty list, then removing the last one, makes its size 2")
    @Test
    public void addThreeItemsToAnEmptyList_thenRemoveTheLastOne_makesTheSize2(){
        aList = new AList();
        aList.addLast(10);
        aList.addLast(20);
        aList.addLast(30);
        int removed = aList.removeLast();
        assertEquals(2, aList.size());
        assertEquals(30, removed);
    }

    @DisplayName("Adding 6 items to an empty list, makes the array to resize and size becomes 6")
    @Test
    public void addSixItemsToAnEmptyList_makesTheArrayToBeResized_andSizeBecomes6(){
        aList = new AList();
        aList.addLast(10);
        aList.addLast(20);
        aList.addLast(30);
        aList.addLast(40);
        aList.addLast(50);
        aList.addLast(60);
        assertEquals(6, aList.size());

    }
}
