// Java program to demonstrate
// updating Hashtable

import java.io.*;
import java.util.*;
class UpdatesOnHashtable {
	public static void main(String args[])
	{

		// Initialization of a Hashtable
		Hashtable<Double, Character> ht
			= new Hashtable<Double, Character>();

		// Inserting the Elements
		// using put method
		ht.put(15.90, 'G');
		ht.put(26.78, 'U');
		ht.put(36.43, 'L');
		
		// print initial map to the console
		System.out.println("Initial Map " + ht);
		
		// Update the value at key 2
		ht.put(26.78, 'F');
		
		// print the updated map
		System.out.println("Updated Map " + ht);
	}
}
