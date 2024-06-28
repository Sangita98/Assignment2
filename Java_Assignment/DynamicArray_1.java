package assignment;

import java.util.Arrays;


public class DynamicArray_1 {
	
	private int[]array;
	private int size;
	private int capacity;
	
	
	public DynamicArray_1() {
		array=new int[2];
		size=0;
		capacity =2;
	}
	
	public void add(int element) {
		if(size == capacity) {
			resize();
		}
		array[size++] =element ;
	} 
	
	public void insert(int index, int element) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		if(size == capacity) {
			resize();
		}
		
		for(int i= size; i> index; i--) {
			array[i] =array[i-1];
		}
		
		array[index] =element ;
		size++;
	}
	
	public void delete(int index) {
		if(index < 0 || index >=size) {
			throw new IndexOutOfBoundsException("Index out og bounds");
		}
		
		for(int i=index; i < size-1; i++) {
			array[i] = array[i+1];
			
			}
		array[--size]=0;
		if(size>0 && size == capacity/4) {
			shrink();
		}
	}
	
	public void update(int index, int element) {
		if(index < 0 || index >=size) {
			throw new IndexOutOfBoundsException("Index out og bounds");
		}
		
		array[index] =element ;
	}
	
	public int get(int index) {
		if(index < 0 || index >=size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		return array[index];
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void resize() {
		capacity *=2;
		array  =Arrays.copyOf(array, capacity) ;
		
	}
	 private void shrink() {
		 capacity /=2;
		 array = Arrays.copyOf(array, capacity);
	 }
	 
	 public void display() {
		 for(int i =0; i<size; i++) {
			 System.out.print(array[i]+ " ");
		 }
		 System.out.println();
	 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicArray_1 dArray =new DynamicArray_1();
		
		dArray.add(1);
		dArray.add(2);
		dArray.add(3);
		dArray.insert(1, 5);
		dArray.display();
		
		dArray.delete(3);
		dArray.display();
		
		dArray.update(1,4);
		dArray.display();
		
		System.out.println(dArray.get(2));
		System.out.println(dArray.size());
		System.out.println(dArray.isEmpty());

	}

}
