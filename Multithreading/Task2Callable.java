package com.wipro.service;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task2Callable implements Callable<Long> {
    private int number;

    public Task2Callable(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        return factorial(number);
    }

    private long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter the Number: ");
    	int number=sc.nextInt();
        
        Task2Callable task = new Task2Callable(number);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Long> future = executorService.submit(task);

        try {
            Long result = future.get();  
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        sc.close();
    }
}
