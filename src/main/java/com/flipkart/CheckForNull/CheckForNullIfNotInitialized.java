package com.flipkart.CheckForNull;

import com.flipkart.temp.First;

public class CheckForNullIfNotInitialized {
    public static void main(String[] args) {
        // A normal object when not initialzed and also not set would be null
        First first = new First();
        first.setFirst("Akku Di Is Love");
        System.out.println(first.getFirst());
        System.out.println(first.getSecond());

        System.out.println();

        // So if we are providing whether primitive datatype or Wrapper class here , then also we would be printing the inside result
        // So it does not really matter between true or Boolean.TRUE
        if(Boolean.TRUE) {
            System.out.println("Inside Boolean wrapper class");
        }

        

    }
}
