package IntListTesting;

import org.example.IntList.IntList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntListTest {

    private IntList intList;
    @BeforeEach
    public void setUp(){
        intList = new IntList();
    }

    @Test
    public void creatingAnEmpty_ProducesAnEmptyList(){
        assertEquals("", intList.toString());
        assertEquals(0, intList.size());
        assertEquals(0, intList.fastSizeUsingCaching());
    }

    @Test
    public void addingASingleItemAtTheEnd_ToAnEmpty_ProducesAListWithThatItem(){
        intList.addLast(10);
        assertEquals("10", intList.toString());
        assertEquals(1, intList.size());
        assertEquals(1, intList.fastSizeUsingCaching());
    }

    @Test
    public void addingTwoItemsAtTheEnd_ToAnEmpty_ProducesAListWithThoseItems(){
        intList.addLast(10);
        intList.addLast(20);
        assertEquals("10,20", intList.toString());
        assertEquals(2, intList.size());
        assertEquals(2, intList.fastSizeUsingCaching());
    }

    // Adding First
    @Test
    public void addingASingleItemAtTheBeginning_ToAnEmpty_ProducesAListWithThatItem(){
        intList.addFirst(10);
        assertEquals("10", intList.toString());
        assertEquals(1, intList.size());
        assertEquals(1, intList.fastSizeUsingCaching());
    }

    @Test
    public void addingTwoItemsAtTheBeginning_ToAnEmpty_ProducesAListWithThoseItems(){
        intList.addFirst(20);
        intList.addFirst(10);
        assertEquals("10,20", intList.toString());
        assertEquals(2, intList.size());
        assertEquals(2, intList.fastSizeUsingCaching());
    }

    @Test
    public void addingThreeItemsAtTheBeginning_ToAnEmpty_ProducesAListWithThoseItems(){
        intList.addFirst(30);
        intList.addFirst(20);
        intList.addFirst(10);
        assertEquals("10,20,30", intList.toString());
        assertEquals(3, intList.size());
        assertEquals(3, intList.fastSizeUsingCaching());
    }
}
