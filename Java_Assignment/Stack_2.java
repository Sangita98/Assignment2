package assignment;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack_2 {

	private int[] array;
	private int size;
	private int capacity;
	
	public Stack_2(int initialCapacity) {
		array =new int[initialCapacity];
		size =0;
		capacity =initialCapacity;
	}
	
	public Stack_2() {
		this(10);
	}
	
	public void push(int element) {
		if(size ==capacity ) {
			resize();
		}
		
		array[size++] =element ;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
	
	
	int element =array[--size];
	array[size] = 0;
	return element;
}

	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return array[size - 1];
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	private void resize() {
		capacity *=2;
		array =Arrays.copyOf(array, capacity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_2 sk =new Stack_2(); 
		sk.push(10);
		sk.push(20);
		sk.push(30);
		
		System.out.println("Top element is: " + sk.peek());
		System.out.println("Stack size is: " + sk.size());
		System.out.println("Popped element is: " + sk.pop());
		System.out.println("Stack size is: " + sk.size());
		System.out.println("Is stack empty?  " + sk.isEmpty());
		System.out.println("Popped element is: " + sk.pop());
		System.out.println("Popped element is: " + sk.pop());
		System.out.println("Is stack empty? " + sk.isEmpty());

	}

}
