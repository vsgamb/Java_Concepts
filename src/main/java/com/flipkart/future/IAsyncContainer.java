package com.flipkart.future;

@FunctionalInterface
public interface IAsyncContainer<T> {
    T apply() throws Exception;
}
