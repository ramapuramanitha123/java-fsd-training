import java.util.*;
public class Stringarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array= ");
		int size = sc.nextInt();
		
		String[] s1 = new String[size];
		
		System.out.println("Enter the elements for array= "); 
		for(int i=0;i<size;i++)
		{
			s1[i] = sc.next();
		}
		
		System.out.println("Entered array elements are= ");
		for(int i=0;i<size;i++)
		{
			System.out.print(s1[i]+",");
		}
		
		int len= s1.length;
		int[] s2= new int[len];
		
		for(int i=0; i<len; i++) {
			s2[i] = Integer.parseInt(s1[i]);
		}
		System.out.println("");
		
		System.out.println("The integer array is= "+Arrays.toString(s2));
		System.out.println("----------------------");
		
		System.out.println("type of the array is = "+s2.getClass().getSimpleName());
		
		System.out.println("----------------------");
		
		int sum=0;
		for (int i = 0; i < s2.length; i++) {  
	           sum = sum + s2[i];  
	        }  
		System.out.println("Sum of all elements"+sum);
}

}