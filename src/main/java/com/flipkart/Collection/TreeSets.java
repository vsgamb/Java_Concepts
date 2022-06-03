package com.flipkart.Collection;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        Person person = new Person("Gaurav Bhai",28,20000000.0);
        Person person1 = new Person("Shekhar Bhaiya",37,20000000.0);
        Person person2 =new Person("Atul",24,20000000.0);

        TreeSet treeSet = new TreeSet();
        treeSet.add(person);
        treeSet.add(person1);
        treeSet.add(person2);

        System.out.println(treeSet);
    }
}
