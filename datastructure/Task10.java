package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 =new LinkedList<String>();
		l1.add("Robin");
		l1.add("Vincent");
		l1.add("Robert");
		l1.add("Alex");
		
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
