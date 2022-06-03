package com.flipkart.temp;

import java.util.Optional;

public class OptionalConcepts {

    public static void main(String[] args) {
        temp.PersonPojo personPojo = new temp.PersonPojo();
        Name name = new Name();
        name.setFirstName("Akshita");
        name.setSecondName("Sharma");
        //name.setSecondName(null);

        //Here Note that if we keep secondName as either Null or we did not set this , then our orElse() method is executed else it picks up name from name object itself
        //Also what map() function does is
        // 1--> First of all , it always works on an Optional Object
        // 2--> Secondly , the type of object on which map is executed should remain same inside map function too and that objects method is mapped here
        // As we can see that on left hand side of .map() function , we brought object of Name type and inside map function we are picking data for this particular object only
        // 3--> What Map function does is that it looks at value being mapped (i.e. the optional value at which map function is applied) ,
        // if that is not null , then it applies the function within map() provided or if that optional object is null , then it does nothing
        // 4--> Also this orElse() function is applied on optional object and it looks for if the optional value is not null then it simply returns the same value
        // else if that optional object is null , then it returns the value supplied within orElse() method.
        //orElse() method provides a default value if Optional is empty

        //personPojo.setNameofPerson(name);
        String secondName = Optional.ofNullable(personPojo.getNameofPerson()).map(Name::getSecondName).orElse("Jangid");
        System.out.println(secondName);

    }

}
