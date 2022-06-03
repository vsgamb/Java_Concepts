package com.flipkart.Inheritance;

public class LearnInheritanceWithOverloadingOverhidingandOverriding {
    public static void main(String[] args) {
        ParentClass parentClass = new ChildClass();
        ParentClass parentClass1 = new ParentClass();
        ChildClass childClass = new ChildClass();
        System.out.println();
        //ChildClass childClass1 = new ParentClass(); // ChildClass childClass1 = new ParentClass() this will give error due to child reference
        // variable can not point to parent class object without typecasting.


        // This is called Overriding . Overriding occurs for non-Static methods , It means at run time it will be decided
        // Which method to be called. In overriding , Compiler looks at type of object the reference variable is pointing to and not
        // at type of reference variable. So method based on type of object is called.
        parentClass.fun();        // child class
        parentClass1.fun();         // parent class
        childClass.fun();           // child class
        System.out.println();

        ParentClass.enjoy();         // parent class
        ChildClass.enjoy();         // child class
        System.out.println();

        // This is called hiding . Hiding occurs for Static methods , It means at compile time only it will be decided
        // Which method to be called. In Hiding , Compiler looks at type of reference variable calling the function and not
        // at type of object that reference variable is pointing to.
        parentClass.enjoy();        // parentclass
        parentClass1.enjoy();       // parentclass
        childClass.enjoy();         // childclass
        System.out.println();


        // IMPORTANT:
        // So all depends on two things , first look for if function called is static or non static and then
        // accordingly decide for the function to be called as per the type of reference variable for static function and for
        // the funtcion to be called as per the the type of object that reference is pointing to for non static methods


        // If we have parent class reference pointing to child class object, then it will only be able to call all those methods
        // which are only present in parent class, So only that function which we want to be overrided in child , can be called using such reference
        // If we want to call any method not present in parent belonging to child , then we have to typecast that parent class reference
        // to child class reference variable.
        System.out.println();
        parentClass.getName();
        childClass.study();
        ((ChildClass)parentClass).setAge(24); // See this gives error , because that function is not present in parent class and refernece is parent
        // So it will only work by typecasting the reference variable
        // parentClass.setAge() was giving error

        System.out.println();
        System.out.println();
        parentClass.ajmer();  // Child Class
        parentClass1.ajmer(); // Parent Class
        childClass.ajmer(); // Child Class



    }
}
