package com.wipro.service;


public class Task1Factorial implements Runnable{
		private int num;
		
		public Task1Factorial(int num) {
			super();
			this.num = num;
		}
		@Override
		public void run() {
			int result = factorial(num);
			System.out.println("Factorial of "+num+" : "+result);
			
		}
		private int factorial(int n) {
			if(n<=1)
				return 1;
			else
				return n*factorial(n-1);
		}
		
		
	}
