package com.flipkart;

public class StringMethods {
    public static void main(String[] args) {
        String url = "ACC9FADE25963C5456482FC0D733063CC6DT:P:A-0001";
        String cartRefId = url.substring(url.lastIndexOf("/") + 1).trim();

        System.out.println((cartRefId));
        String accountId = cartRefId.indexOf(":") == -1 ? cartRefId : cartRefId.substring(0,cartRefId.indexOf(":"));
        System.out.println(accountId);
    }
}
