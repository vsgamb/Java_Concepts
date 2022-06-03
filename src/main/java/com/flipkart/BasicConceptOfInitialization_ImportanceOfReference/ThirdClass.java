package com.flipkart.BasicConceptOfInitialization_ImportanceOfReference;

public class ThirdClass {
    FirstClass firstClass = new FirstClass();
    String favouriteSubject;

    public FirstClass getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public void setFirstClassImplicitely(FirstClass firstClass) {
        this.firstClass.setName(firstClass.getName());
        this.firstClass.setAge(firstClass.getAge());
    }

    public String getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }
}
