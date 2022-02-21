// Java program to demonstrate
// the removing mappings from Hashtable

import java.io.*;
import java.util.*;
class RemovingMappingsFromHashtable {

	public static void main(String args[])
	{
		// Initialization of a Hashtable
		Map<Double, Character> ht
			= new Hashtable<Double, Character>();

		// Inserting the Elements
		// using put method
		ht.put(1.34, 'G');
		ht.put(2.90, 'F');
		ht.put(3.45, 'G');
		ht.put(4.67, 'F');

		// Initial HashMap
		System.out.println("Initial map : " + ht);

		// Remove the map entry with key 4
		ht.remove(4.67);

		// Final Hashtable
		System.out.println("Updated map : " + ht);
	}
}
