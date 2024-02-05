package ArrayMapTesting;

import org.example.ArrayMap.ArrayMapWithTwoArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class ArrayMapWithTwoArraysTest {
    ArrayMapWithTwoArrays<String, Integer> arrayMap;

    @BeforeEach
    public void setUp(){
        arrayMap = new ArrayMapWithTwoArrays<>();
    }
    @Test
    public void emptyMap_addOnePair_thenRetrieveItByKey(){
        arrayMap.put("One", 1);
        int expected = 1;
        Integer actual = arrayMap.get("One");

        assertEquals((Integer) expected, actual);
                    Assertions.assertEquals(expected, actual);
    }
}
