package com.flipkart.Inheritance;

public class ChildClass extends ParentClass{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void fun() {
        System.out.println("In Child Class");
    }

    public static void enjoy(){
        System.out.println("In Child Class Static Function");
    }

    public ChildClass() {
        System.out.println("Child Class Constructor");
    }

    public void study(){
        System.out.println("Study in child class");
    }

    public void ajmer(){
        System.out.println("Visit Ajmer / Child");
        System.out.println();
        System.out.println(this);
        System.out.println(this.getClass());
        System.out.println(super.getClass());
        System.out.println();
        super.ajmer();
    }
}
