// Java program to demonstrate
// adding elements to Hashtable

import java.io.*;
import java.util.*;

class AddElementsToHashtable5 {
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Hashtable<Double, Character> ht1 = new Hashtable<>();

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Double, Character> ht2
			= new Hashtable<Double, Character>();

		// Inserting the Elements
		// using put() method
		ht1.put(1.89, 'G');
		ht1.put(2.98, 'F');
		ht1.put(3.56, 'G');

		ht2.put(1.89, 'G');
		ht2.put(2.65, 'F');
		ht2.put(3.09, 'G');
		
		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
	}
}
