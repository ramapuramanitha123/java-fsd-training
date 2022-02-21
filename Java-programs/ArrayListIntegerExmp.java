import java.util.*;  
class ArrayListIntegerExmp {  
public static void main(String args[]){  
ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist  
list.add(30);//Adding object in arraylist  
list.add(14);  
list.add(28);  
list.add(12);  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  