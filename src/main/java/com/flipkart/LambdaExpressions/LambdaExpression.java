package com.flipkart.LambdaExpressions;

public class LambdaExpression {
    public static void main(String[] args) {
        // This is just the way of implementing an Interface using Lambda Expression
        Greeting lambdaGreeting = () -> System.out.println("Loves Gamb");
        // This is how we execute the lambda expression
        lambdaGreeting.foo();


        AddInt addInt = (int a,int b) -> a+b; // This will not execute/call this method which is shown as implementation of AddInt interface

        int c = addInt.addInt(5,6); // This will actually call this method which has definition defined as above in form of lambda expression
        System.out.println(c);  // And this will actually print that third number
    }
}
