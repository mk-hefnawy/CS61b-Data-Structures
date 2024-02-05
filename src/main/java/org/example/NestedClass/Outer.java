package org.example.NestedClass;

public class Outer {
    public static int staticNum = 4;
    public int nonStaticNum = 4;
    private class Inner{

        public int c;
        private void innerFun(){
            staticNum += 1;
            nonStaticNum += 1;
        }
    }
}
