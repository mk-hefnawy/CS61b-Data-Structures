package ArrayMapTesting;

import org.example.ArrayMap.ArrayMapWithPairObject;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayMapWithPairObjectTest {
    ArrayMapWithPairObject<Integer, String> arrayMapWithPairObject;

    @BeforeEach
    public void setUp(){
        arrayMapWithPairObject = new ArrayMapWithPairObject();
    }

    @Test
    public void emptyArrayMap_sizeGivesZero(){
        assertEquals(0, arrayMapWithPairObject.size());
    }

    @Test
    public void emptyArrayMap_addOnePair_sizeGivesOne(){
        arrayMapWithPairObject.put(1, "Ali");
        assertEquals(1, arrayMapWithPairObject.size());
    }

    @Test
    public void emptyArrayMap_addOnePair_getGivesOne(){
        arrayMapWithPairObject.put(1, "Ali");

        String value = arrayMapWithPairObject.get(1);
        assertEquals("Ali", value);

    }

    @Test
    public void emptyArrayMap_addTwoIdenticalKeys_getGivesTheFirstOne(){
        arrayMapWithPairObject.put(1, "Ali");
        arrayMapWithPairObject.put(1, "Samir");

        String value = arrayMapWithPairObject.get(1);
        assertEquals("Ali", value);
        assertEquals(1, arrayMapWithPairObject.size());

    }
}
