package selfpractice;

import java.io.*;
import java.util.*;

public class TreeMapDemo {
	public static void main(String args[]) {

// Arranges keys in sorted order
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "A");
		treeMap.put(5, "B");
		treeMap.put(4, "D");
		treeMap.put(6, "E");
		treeMap.put(2, "F");

		System.out.println(treeMap);

		for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
			System.out.println("key: "+e.getKey() + ", "+ "value: "+ e.getValue());
		}

	}
}
