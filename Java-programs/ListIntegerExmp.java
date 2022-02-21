import java.util.*;  
class ListIntegerExmp {  
public static void main(String args[]){  
List<Integer> lst=new ArrayList<Integer>();//Creating arraylist  
lst.add(30);//Adding object in arraylist  
lst.add(14);  
lst.add(28);  
lst.add(12);  
//Traversing list through Iterator  
Iterator itr=lst.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  