package com.flipkart.smallProgram;

//import com.google.gson.internal.LinkedHashTreeMap;

import java.util.*;
import java.io.*;

class Fibonaaci {
    private static HashMap<Integer,String> hashMap = new HashMap<>();

    static String findSum(String string1, String string2)
    {
        if (string1.length() > string2.length()){
            String t = string1;
            string1 = string2;
            string2 = t;
        }
        String str = "";
        int n1 = string1.length(), n2 = string2.length();
        int diff = n2 - n1;
        int carry = 0;
        for (int i = n1 - 1; i>=0; i--)
        {
            int sum = ((int)(string1.charAt(i)-'0') +
                    (int)(string2.charAt(i+diff)-'0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }
        for (int i = n2 - n1 - 1; i >= 0; i--)
        {
            int sum = ((int)(string2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }
        if (carry > 0)
            str += (char)(carry + '0');
        return new StringBuilder(str).reverse().toString();
    }

    static String rec(int n){
        if(n==0)
            return "0";
        String first;

        if(hashMap.containsKey(n-1)){
            first=hashMap.get(n-1);
        }
        else{
            first=rec(n-1);
            hashMap.put(n-1,first);
        }
        String second;

        if(hashMap.containsKey(n-2)){
            second=hashMap.get(n-2);
        }
        else{
            second=rec(n-2);
            hashMap.put(n-2,second);
        }
        String result=findSum(first,second);
        hashMap.put(n,result);
        return result;
    }

    public static void main(String[] args) {
        Fibonaaci.hashMap.put(0,"0");
        Fibonaaci.hashMap.put(1,"1");
        Fibonaaci.hashMap.put(2,"1");
        String third=rec(5);
        System.out.println(third);
    }
}