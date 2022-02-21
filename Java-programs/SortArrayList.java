import java.util.*;  
public class SortArrayList 
{  
public static void main(String args[])  
{  

ArrayList<Double> list = new ArrayList<Double>();  
list.add(16.6);  
list.add(21.3);  
list.add(12.3);  
list.add(11.8);  
list.add(58.9);  
list.add(35.2);  
list.add(45.87);  
  
System.out.println("ArrayList Before Sorting:");  
for(double marks: list)  
{  
System.out.println(marks);  
}  

 Collections.sort(list, Collections.reverseOrder());  

System.out.println("ArrayList After Sorting:");  
for(double marks: list)  
{  
System.out.println(marks);  
}  
}  
}  