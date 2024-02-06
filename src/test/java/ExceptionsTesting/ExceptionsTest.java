package ExceptionsTesting;

import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    public void test(){
        try {
            fun();
        }catch (RuntimeException ex){
            System.out.println("Hello");
        }
    }

    private void fun(){
        throw new RuntimeException();
    }
}
