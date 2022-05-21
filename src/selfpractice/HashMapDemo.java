package selfpractice;

import java.util.*;

public class HashMapDemo {
public static void main(String args[]) {
	
	HashMap <String, Integer> map = new HashMap<>();
	
	map.put("a", 1);
	map.put("b", 2);
	map.put("c", 3);
	map.put("d", 4);
	
	System.out.println(map);
	System.out.println(map.containsKey("a"));
	
	for(String key: map.keySet()) {
		System.out.println(map.get(key));
	}
	
	for(Map.Entry<String, Integer> entry: map.entrySet()) {
		System.out.println("key: " + entry.getKey() + " value" + entry.getValue());
	}
		
	}
}
