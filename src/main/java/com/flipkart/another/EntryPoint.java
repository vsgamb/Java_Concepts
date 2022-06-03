package com.flipkart.another;

import com.flipkart.LearnNull.LearnNullPointer;

public class EntryPoint {
    public int age;
    public static int houseNo;
    public String name;

    public void fun()
    {
        System.out.println("Hello Ji");
    }

    public static void main(String[] args) {
        LearnNullPointer learnNullPointer = null;     //= new LearnNullPointer();
        //System.out.println(learnNullPointer.age);
        System.out.println(learnNullPointer.year);

        //learnNullPointer.print();

        learnNullPointer.second();

        System.out.println(LearnNullPointer.year);

        LearnNullPointer.second();

        //age=15;
        houseNo=15;
    }
}
