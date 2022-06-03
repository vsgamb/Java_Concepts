package com.flipkart.BasicConceptOfInitialization_ImportanceOfReference;

public class FirstClass {
    int age;
    String name;

    public FirstClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public FirstClass() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
