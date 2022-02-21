// Java program to illustrate
// traversal of Hashtable

import java.util.Hashtable;
import java.util.Map;

public class IteratingHashtable {
	public static void main(String[] args)
	{
		// Create an instance of Hashtable
		Hashtable<Character, Double> ht = new Hashtable<>();

		// Adding elements using put method
		ht.put('V', 10.90);
		ht.put('O', 30.87);
		ht.put('P', 20.45);
	
		// Iterating using enhanced for loop
		for (Map.Entry<Character, Double> e : ht.entrySet())
			System.out.println(e.getKey() + " "
							+ e.getValue());
	}
}
