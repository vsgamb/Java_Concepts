package com.flipkart.Serialization;

import java.util.*;

public class Person {
    String name;
    int age;
    List<String> marks = new ArrayList<>();
    Map<String , String> love = new HashMap<>();
    Optional<MembershipStatus> lockinStatus;

    public List<String> getMarks() {
        return marks;
    }

    public void setMarks(List<String> marks) {
        this.marks = marks;
    }

    public Map<String, String> getLove() {
        return love;
    }

    public void setLove(Map<String, String> love) {
        this.love = love;
    }

    public Optional<MembershipStatus> getLockinStatus() {
        return lockinStatus;
    }

    public void setLockinStatus(Optional<MembershipStatus> lockinStatus) {
        this.lockinStatus = lockinStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
