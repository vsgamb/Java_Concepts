package com.flipkart.learnPickingDataFromJson;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StudentPojo {
    int age;
    String name;
    double salary;
    Optional<String> company;
//    Map<String, String> relations;
     //List<Marks> marks;   // List of marks he got in classes 1 and 2


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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
