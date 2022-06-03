package com.flipkart.ExtraMethoda;

import com.flipkart.learnPickingDataFromJson.StudentPojo;

public class LearnAboutClassKeyword {


    public static void main(String[] args) {
        StudentPojo studentPojo = new StudentPojo();

        //When we have an instance , then we can call the getClass() method to get the class name as (class com.flipkart.learnPickingDataFromJson.StudentPojo).
        System.out.println(studentPojo.getClass());

        // WE can also get class name by using classname.class keyword.
        System.out.println(StudentPojo.class);
        System.out.println(StudentPojo.class.getClass());

        // To get actual class name we have called a method called classname.class.getname()  or  classname.getClass().getName()
        System.out.println(StudentPojo.class.getName());

        System.out.println();

        String string = "hello";
        System.out.println(string.getClass());
        System.out.println(string.getClass().toString());

        System.out.println(string.getClass().getName());
    }
}
