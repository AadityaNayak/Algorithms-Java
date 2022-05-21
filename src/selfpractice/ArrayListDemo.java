package selfpractice;
import java.util.*;

public class ArrayListDemo {
	
		
		
		public static void main(String args[]) {
			
		// Interface name on LHS and concrete declaration on RHS
		List<Integer> arrayList = new ArrayList<Integer>(5);
		
		for(int i = 0; i<5; i++) {
			arrayList.add(i);
		}
		
		for(int i = 0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
		
	
}
