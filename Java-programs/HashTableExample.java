// Java program to illustrate
// Java.util.Hashtable

import java.util.*;

public class HashTableExample {
	public static void main(String[] args)
	{
		// Create an empty Hashtable
		Hashtable<Character, Double> ht = new Hashtable<>();

		// Add elements to the hashtable
		ht.put('X', 10.34);
		ht.put('Y', 30.98);
		ht.put('Z', 20.67);

		// Print size and content
		System.out.println("Size of map is:- " + ht.size());
		System.out.println(ht);

		// Check if a key is present and if
		// present, print value
		if (ht.containsKey('X')) {
			Double a = ht.get('X');
			System.out.println("value for key"
							+ " \'X\' is:- " + a);
		}
	}
}
