package com.flipkart.Inheritance;

public class UnderstandSuperKeywordUsecase {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        /*
        Below is the result of function call made below. So here we can see that , super and this both refer to same instance only ,

        RESULT:
        Child Class Constructor
        Visit Ajmer / Child

        com.flipkart.Inheritance.ChildClass@6e0be858
        class com.flipkart.Inheritance.ChildClass
        class com.flipkart.Inheritance.ChildClass

        com.flipkart.Inheritance.ChildClass@6e0be858
        Visit Ajmer / Parent
        class com.flipkart.Inheritance.ChildClass
         */
        childClass.ajmer();
        System.out.println(" Child <-> Parent");
        ParentClass parentClass = new ChildClass();
        parentClass.ajmer();
    }
}
