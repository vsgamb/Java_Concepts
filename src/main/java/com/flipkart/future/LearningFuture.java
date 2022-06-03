package com.flipkart.future;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LearningFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        int result = 0;
        Future<Integer> integerFuture = executorService.submit(() -> {
            System.out.println("Before Sleep");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Exception in sleep");
            }
            System.out.println("After Sleep");
            return 420;
        });
        System.out.println("After the future Service"); // First this is printed
        if(integerFuture.isDone()){
            try {
                result = integerFuture.get();
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Exception after executor. What to do man !!");
            }
        }
        System.out.println("After Future Extraction");

        while(!integerFuture.isDone()){
            System.out.println("Future Extraction not done");
        }
        System.out.println("Future Extraction is done finally . Result:" + result); // Why 0 is shown at output here and not 420
    }
}
