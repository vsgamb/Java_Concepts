package com.flipkart.BasicConceptOfInitialization_ImportanceOfReference;

public class InitializationConcept {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(24,"Vishal");
        SecondClass secondClass = new SecondClass(firstClass,"Physics");
        //FirstClass firstClass1 = new FirstClass(29,"Bullu Di");
        ThirdClass thirdClass = new ThirdClass();

        // com.flipkart.BasicConceptOfInitialization.FirstClass@5e2de80c
        System.out.println(firstClass);

        //com.flipkart.BasicConceptOfInitialization.FirstClass@1d44bcfa
        System.out.println(thirdClass.getFirstClass());

        // IF this will be used then address will be changed as per the assignment we have done
        thirdClass.setFirstClass(firstClass);

        //If this is done , then it will not change the address as we are explicitly putting values to primitive data types
        // If inside first class also we have some objects , then same thing would happen, Each reference variable would be pointing to same single object present in the memory.
        //thirdClass.setFirstClassImplicitely(firstClass);

        thirdClass.setFavouriteSubject("G.K.");

        //com.flipkart.BasicConceptOfInitialization.FirstClass@5e2de80c
        System.out.println(thirdClass.getFirstClass());
        System.out.println();

        System.out.println(firstClass.getName()+" "+firstClass.getAge());
        System.out.println(secondClass.getFirstClass().getName()+" "+secondClass.getFirstClass().getAge()+" "+secondClass.getFavouriteSubject());
        System.out.println(thirdClass.getFirstClass().getName()+" "+thirdClass.getFirstClass().getAge()+" "+thirdClass.getFavouriteSubject());

        firstClass.setAge(28);
        firstClass.setName("AkkuDi");

        System.out.println();

        // So remember since we have just passed the reference , so value changed in its first class would also correspond to value change in second class
        System.out.println(firstClass.getName()+" "+firstClass.getAge());
        System.out.println(secondClass.getFirstClass().getName()+" "+secondClass.getFirstClass().getAge()+" "+secondClass.getFavouriteSubject());
        System.out.println(thirdClass.getFirstClass().getName()+" "+thirdClass.getFirstClass().getAge()+" "+thirdClass.getFavouriteSubject());

        // ********************************** IMPORTANT *************************************
        // So if we are providing the reference , no matter what and where we change the variable value at that particular reference, it will change for all.
        // So we have to set completely new object and set value at each level to get entirely new object and not independent on its sub-objects



        // ---------------------------------------------------------------------------- //

        System.out.println();
        System.out.println();

        FirstClass firstClass1 = new FirstClass(30,"Bullu Didi");
        SecondClass secondClass1 = new SecondClass(firstClass1,"History");
        ThirdClass thirdClass1 = new ThirdClass();
        thirdClass1.setFirstClass(new FirstClass(firstClass1.age, firstClass1.name));
        thirdClass1.setFavouriteSubject("Civics");

        System.out.println(firstClass1.getName()+" "+firstClass1.getAge());
        System.out.println(secondClass1.getFirstClass().getName()+" "+secondClass1.getFirstClass().getAge()+" "+secondClass1.getFavouriteSubject());
        System.out.println(thirdClass1.getFirstClass().getName()+" "+thirdClass1.getFirstClass().getAge()+" "+thirdClass1.getFavouriteSubject());

        firstClass1.setName("ZK");
        firstClass1.setAge(22);

        System.out.println(firstClass1.getName()+" "+firstClass1.getAge());
        System.out.println(secondClass1.getFirstClass().getName()+" "+secondClass1.getFirstClass().getAge()+" "+secondClass1.getFavouriteSubject());
        System.out.println(thirdClass1.getFirstClass().getName()+" "+thirdClass1.getFirstClass().getAge()+" "+thirdClass1.getFavouriteSubject());

        // So Primitive datatypes when set always kind of forms a new space in memory and value is copied.
        // For Complex objects , if we assign values by reference , then values would be changed otherwise it won't (By explicitly passing valuyes to objects
        // by creating new object)

    }


}
