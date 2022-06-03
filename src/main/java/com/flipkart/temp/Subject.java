package com.flipkart.temp;

import com.google.common.base.Optional;

public class Subject {
    Optional<String>  favouriteSubject = Optional.absent();

    int sinceTime = 1997;

    public Optional<String> getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(Optional<String> favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }

    public int getSinceTime() {
        return sinceTime;
    }

    public void setSinceTime(int sinceTime) {
        this.sinceTime = sinceTime;
    }
}
