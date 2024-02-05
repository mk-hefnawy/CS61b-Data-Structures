package StringAndStringBuilderTesting;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    @Test
    public void testTheSpeed(){
        long upperBound = 2900_00;
        String str = "";
        long before = System.currentTimeMillis();
        for (long i = 0; i < upperBound ; i++){
            str += "1";
        }
        long dur = System.currentTimeMillis() - before;
        System.out.println("String: " + dur/1000);


        StringBuilder strB = new StringBuilder();
        before = System.currentTimeMillis();
        for (long i = 0; i < upperBound ; i++){
            strB.append("1");
        }
        dur = System.currentTimeMillis() - before;
        System.out.println("String Builder: " + dur/1000);
    }
}
