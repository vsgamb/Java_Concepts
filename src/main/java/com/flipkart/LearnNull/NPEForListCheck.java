package com.flipkart.LearnNull;

import java.util.ArrayList;
import java.util.List;

public class NPEForListCheck {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        if(a.contains("EQUALS"))
            System.out.println("True");
        System.out.println("False");
    }
}
