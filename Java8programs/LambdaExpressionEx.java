package com.ust;

@FunctionalInterface //optional
interface MyInterface1{
    public void myMethod1();
}
public class LambdaExpressionEx{
    public static void main(String args[])
    {
        int variable = 10;
        //implemenmtation with lambda expression
        MyInterface1 myInterface1 = ()->{
            System.out.println("variable = "+variable);
        };
        myInterface1.myMethod1();
    }
}
