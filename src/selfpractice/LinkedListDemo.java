package selfpractice;
import java.util.*;
public class LinkedListDemo {
	
	public static void main(String args[]) {
		
		// Concrete declaration on RHS since some methods are only in Liked list class
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.addFirst("D");
		list.addLast("A");
		list.add(2, "A");
		
		for(String item: list) {
			System.out.print(item + " ");
		}
	}
	
}
