package com.flipkart.Inheritance;

public class ParentClass {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fun(){
        System.out.println("In Parent Class");
    }

    public static void enjoy(){
        System.out.println("In Parent Class Static Function");
    }

    public void ajmer(){
        System.out.println(this);
        System.out.println("Visit Ajmer / Parent");
        System.out.println(this.getClass());
    }
}

