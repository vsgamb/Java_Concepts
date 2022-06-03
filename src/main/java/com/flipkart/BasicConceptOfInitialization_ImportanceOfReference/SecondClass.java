package com.flipkart.BasicConceptOfInitialization_ImportanceOfReference;

public class SecondClass {
    FirstClass firstClass;
    String favouriteSubject;

    public SecondClass(FirstClass firstClass, String favouriteSubject) {
        this.firstClass = firstClass;
        this.favouriteSubject = favouriteSubject;
    }

    public FirstClass getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(FirstClass firstClass) {
        this.firstClass = firstClass;
    }

    public String getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }
}
