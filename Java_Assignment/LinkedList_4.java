package assignment;


public class LinkedList_4 {

	private Node head;
	private int size;
	
	public static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data =data ;
			this.next=null;
		}
	}
	
	public LinkedList_4() {
		this.head =null;
		this.size=0;
	}
	
	public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
	public boolean remove(int data) {
		if(head ==null) {
			return false;
		}
		if(head.data==data) {
			head =head.next;
			size--;
			return true;
	}
		 Node current = head;
	        Node previous = null;
	        while (current != null && current.data !=data) {
	            previous = current;
	            current = current.next;
	        }
	        if (current != null) {
	            previous.next = current.next;
	            size--;
	            return true;
	        }
	        return false; 
	    }
	
	public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
	
	public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
	 public int size() {
	        return size;
	    }
	
	 public static void main(String[] args) {
	        LinkedList_4 list = new LinkedList_4();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.display(); 

	        list.remove(2);
	        list.display(); 

	        System.out.println(list.get(1));

	        System.out.println("Size: " + list.size()); 
	    }
	}


