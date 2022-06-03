package com.flipkart;

import com.flipkart.temp.First;
import com.flipkart.temp.Fourth;
import com.flipkart.temp.Second;
import com.flipkart.temp.Third;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import com.flipkart.another.EntryPoint;

public class OptonalConcepts {

    public static void main(String[] args) {
        //Optional<String> optionalInt = Optional.ofNullable("Tiffene Sharma");
//        Optional<String> optionalInt = Optional.ofNullable(null);
//
//        System.out.println(optionalInt);
//        System.out.println(optionalInt.isPresent());
        // System.out.println(optionalInt.get());

//        HashMap<Integer, String> map = new HashMap<Integer, String>();
//
//        String temp=null;
//        map.put(null, "Amit");
//        map.put("101", temp);
//        map.put("102", "Rahul");
        //Elements can traverse in any order
//        for (Map.Entry m : map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue()+ " " + );

//        EntryPoint entryPoint=new EntryPoint();
//        entryPoint.age=15;
//        //age=14;
//        EntryPoint.houseNo=22;
//        entryPoint.fun();

//        Map<Integer,String> mp=new HashMap<Integer,String >();
//
//        mp.put(101,"hello");
//        mp.put(102,null);
//        mp.put(null, "Akku didi");
//
//        if(mp.containsKey(103))
//            System.out.println("Bullu didi");
//                                            //  IMPORTANT:
//        System.out.println(mp.get(102));   // So remember if certain key is not present and we are asking for value at that key then
//        System.out.println(mp.containsKey(102));// It will return me null.
//
//

        // Optional Concept along with its Map Function

        First first = new First();
        Second second =null;//new Second();
        first.setSecond(second);
        Third third = new Third();
        third.setThird("Suresh");
        //second.setThird(third);

        String accountId = Optional.ofNullable(first).map(First::getSecond).
                map(Second::getThird).map(Third::getThird).orElse("Ramesh");

        System.out.println(accountId);
//
//        First first = new First();
//        Second second = new Second();
//        Third third = new Third();
//        Third third1 = new Third();
//        Fourth fourth = new Fourth();
//        fourth.setFourth("Bullu Di");
//        third.setFourth(fourth);
//        Fourth fourth1 = new Fourth();
//        fourth1.setFourth("Gaurav Bhai");
//        third1.setFourth(fourth1);


//String accountId = Optional.ofNullable(first).map(First::getSecond).flatMap(list -> list.stream().filter(Objects::nonNull).findFirst()).
//        map(Fourth::getFourth).orElse("Akku Didi");

//        System.out.println(accountId);






        }

    }
//}
