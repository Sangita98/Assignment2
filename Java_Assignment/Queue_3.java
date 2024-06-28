package assignment;


class Node{
	int data;
	Node next;
	
	public Node(int data) {
		
		this.data = data;
		this.next = null;
	}
	
}

	
public class Queue_3 {
	private Node front;
	private Node rear;
	
	 public Queue_3() {
		// TODO Auto-generated constructor stub
		 this.front=null;
		 this.rear=null;
		
	}
	 
	 public boolean isEmpty() {
		 return front == null;
	 }
	 
	 public void enqueue(int data) {
		 Node newNode =new Node(data); 
		 if(isEmpty()) {
			 front=newNode;
			 rear= newNode;
		 } else {
			 rear.next=newNode;
			 rear=newNode;
		 }
	 }
	 
	 public int dequeue() {
		 if(isEmpty()) {
			 throw new RuntimeException("Queue is empty");
		 } else {
			 int data = front.data;
			 front =front.next;
			 if(front ==null) {
				 rear =null;
			 }
			 return data;
		 }
	 }
	 
	 public int peek() {
		 if(isEmpty()) {
			 throw new RuntimeException("Quesue is empty");
		 }
		 else {
			 return front.data;		 }
	 }

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue_3 queue =new Queue_3();
		 
		 queue.enqueue(10);
		 queue.enqueue(20);
		 queue.enqueue(30);
		 
		 
		 System.out.println("Peek: " + queue.peek());
		 
		 System.out.println("Dequeue: " + queue.dequeue());
		 System.out.println("Dequeue: " + queue.dequeue());
		 
		 System.out.println("Is Queue empty? " + queue.isEmpty());
		 
		 System.out.println("Dequeue: : " + queue.dequeue());
		 System.out.println("Is Queue empty?  " + queue.isEmpty());
	}

	

}
