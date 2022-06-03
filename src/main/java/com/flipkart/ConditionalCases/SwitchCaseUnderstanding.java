package com.flipkart.ConditionalCases;

public class SwitchCaseUnderstanding {
    public static void main(String[] args) {
        // Good Reference Link to Understand these:
        // https://www.geeksforgeeks.org/switch-statement-in-java/


        // Case when we don't write break statement:

        // An important observation is that , if we match with any of the case statement , then it will execute all the statement
        // irrespective of any case statement (i.e. after getting matched once with a case , then it will not match with other cases too)
        // below all the cases will be executed once it founds a cases match with switch value passed
        // So if stringToMatch value is "Mayanka Di"
        // then since it will match with the first case , so since no where the break statement is written ,
        // So It does not match any of the cases below , and hence all the statement are executed without taking care of case value mentioned
        // Hence in this case here , "Mayanka Di is here" , "Gaurav Bhai is here" , "Akku Di is here" , "Gamb Family" , these all are printed.

        // for stringToMatch value to be "Gaurav Bhai" , then it will print these three lines as per below code
        // "Gaurav Bhai is here" , "Akku Di is here" , "Gamb Family"

        // And if stringToMatch value is other than the 3 values mentioned in case statements , then
        // "Not member of Gamb Family" will be printed only.
        String stringToMatch = "Gaurav Bhai";
        switch(stringToMatch){
            case "Mayanka Di":
                System.out.println("Mayanka Di is here");
            case "Gaurav Bhai":
                System.out.println("Gaurav Bhai is here");
            case "Akku Di":
                System.out.println("Akku Di is here");
                System.out.println("Gamb Family");
                break;
            default:
                System.out.println("Not member of Gamb Family");
                break;
        }
    }
}
