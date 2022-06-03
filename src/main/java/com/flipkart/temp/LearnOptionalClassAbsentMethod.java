package com.flipkart.temp;

import com.google.common.base.Optional;

public class LearnOptionalClassAbsentMethod {
    public static void main(String[] args) {
        Optional<String> name = Optional.absent();
        System.out.println(name);
//        System.out.println(name.get());

        System.out.println();
        Subject subject = new Subject();
        String favouriteSubject = "Physics";
        Optional<String> optionalFavouriteSubject = Optional.fromNullable(favouriteSubject);
        subject.setFavouriteSubject(optionalFavouriteSubject);
        System.out.println(subject.getFavouriteSubject());
        System.out.println(subject.getFavouriteSubject().get());

        System.out.println("Second Case: When We don't pass the value there");

        Subject subject1 = new Subject();
        // So basically if we assign any value to the attribute itself , then it means that
        // its default value should be that only which is set at that time.
        // but say if that value is been set then it will simply over ride and
        // Say is we assign some attribute to Optional.absent() , it means that if we don't assign the value  to it then
        // its value will remain optional.absent() , and if we try to do any operation with it like doing .get() ,
        // then it will throw exceptions , i.e. value which was expected to be passed is not passed.
        // hence all the values which are critical and are needed can be assigned like this.

        // So this will give exception because we have not assign any value to the favouriteSubject attribute
        // and hence it was kept to its default value i.e. Optional.absent()
        // And on which after doing any operation like (First operation performed is .get()) , will give us exception.
        System.out.println(subject1.getFavouriteSubject());
        System.out.println(subject1.getFavouriteSubject().get());

        System.out.println("Testing for different values getting overlapped or not");

        // This shows that values which were assigned to attribute at time of declaration itself gets overrided when
        // we try to set the value to it.
        Subject subject2 = new Subject();
        System.out.println(subject2.getSinceTime());
        System.out.println();
        subject2.setSinceTime(1992);
        System.out.println(subject2.getSinceTime());
    }

}
