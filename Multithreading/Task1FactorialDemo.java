package com.wipro.app;

import java.util.Scanner;

import com.wipro.service.Task1Factorial;

public class Task1FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		
		Runnable runnable=new Task1Factorial(n);
		Thread thread=new Thread(runnable);
		thread.start();
		sc.close();
		
	}

}