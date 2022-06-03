package com.flipkart;

public class LearnWrapperClass {
    public static void main(String[] args) {

        // valueOf() static mathod
        Integer i = 3;  // So here we can see that Integer type reference variable i can take primitive integer values also
        // So it may internally be typecasted inside ,and also when we are printing its value then its value of primitive int
        //contained inside Integer wrapper class gets printed.
        Integer j = Integer.valueOf(4);  // here what is happening is , this method is taking primitive int value , creating an object of type
        //Integer wrapper class and putting this int value inside that int variable and returning the reference of that object and putting inside j
        Integer k = Integer.valueOf("73");// This method takes String as value
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(i+j);




        // ParseXxx() static method , This method converts string value to particular datatype (primitive type) depending upon what function we call

        int alpha = Integer.parseInt("1234"); // So it takes string value in form of integer and return primitive type value corresponding to that
        System.out.println(alpha);

        double beta = Double.parseDouble("3456");
        System.out.println(beta);

        // xxxValue() , this method returns primitive type of value from Wrapper class object

        int intValue = i.intValue(); // Although this is not required because wrapper class is designed such that it does not require
        // any type of explicit function for its interconversion between say int and Integer. Like see below for reference.
        System.out.println(intValue);
        System.out.println(i);

        int a = 300+i;
        System.out.println(a);
        Integer b = 400 + Integer.valueOf("57");
        System.out.println(b);  // so these are interconvertible between each. Rest there is huge difference between class and primitive data type ,
        // but here class is designed as such to give the exact feeling


        // Concatenation vs error in int vs string


        int s=0;
        //s+="AkkuDidi";   // It will throw error , s is int type object , so akku didi string won't get concatenated.
        System.out.println(s);

        // This would work , Concatenation of integer if oject where concatenation is to be done is of type String
        String gamma="BulluDidi";
        gamma+=29;
        System.out.println(gamma);


        System.out.println();
        boolean defaultValue = Boolean.TRUE;
        boolean defaulatValue1 = Boolean.FALSE;
        System.out.println(defaultValue);
        System.out.println(defaulatValue1);

    }
}
