package com.flipkart;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursors {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(39);
        arrayList.add(73);

        // Iterator

        Iterator iterator = arrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
