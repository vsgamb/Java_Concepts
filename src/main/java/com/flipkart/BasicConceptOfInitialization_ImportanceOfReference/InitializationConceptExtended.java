package com.flipkart.BasicConceptOfInitialization_ImportanceOfReference;

public class InitializationConceptExtended {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(24,"Vishal");
        FirstClassExtended firstClassExtended = new FirstClassExtended(firstClass.getAge()*100, firstClass.getName()+ "_Gamb");

        System.out.println(firstClass.age + " " + firstClass.name);
        System.out.println(firstClassExtended.age + " " + firstClassExtended.name);

        String address = firstClass.age + "_Home";
        System.out.println(address);

//        String another = new StringBuilder().append("Vishal").append(21).toString();
//        System.out.println(another);

        firstClass.setAge(28);
        firstClass.setName("Atul");

        System.out.println(firstClass.age + " " + firstClass.name);
        System.out.println(firstClassExtended.age + " " + firstClassExtended.name);


    }
}
