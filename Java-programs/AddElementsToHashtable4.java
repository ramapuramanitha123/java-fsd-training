// Java program to demonstrate
// adding elements to Hashtable

import java.io.*;
import java.util.*;

class AddElementsToHashtable4 {
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Map<Double, Character> ht1 = new HashMap<>();

		// Inserting the Elements
		// using put() method
		ht1.put(1.43, 'A');
		ht1.put(2.89, 'B');
		ht1.put(3.65, 'C');

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Double, Character> ht2
			= new Hashtable<Double,Character>(ht1);

		// Print mappings to the console

		System.out.println("Mappings of ht2 : " + ht2);
	}
}
