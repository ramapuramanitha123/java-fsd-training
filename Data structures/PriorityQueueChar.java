
import java.util.*;


public class PriorityQueueChar { 
      public static void main(String[] args){


     PriorityQueue<Character> pq1= new PriorityQueue<Character>();
            pq1.add('P');
            pq1.add('B');
            pq1.add('A');
            pq1.add('R');
            System.out.println("Elements of queue 1 "+ pq1);
                           
            Character remov = pq1.remove();
            System.out.println("removed element-"+ remov);                
            System.out.println(pq1);

            Character head = pq1.peek();
            System.out.println("head of  pq1-" +head);

            int size = pq1.size();
            System.out.println("Size of queue-"+ size);

            pq1.clear();
            boolean Result=pq1.isEmpty();
            System.out.println(Result);

            pq1.add('P');
            pq1.add('A');
            System.out.println("New elements of queue1 :"+pq1);

            PriorityQueue<Character> pq2= new PriorityQueue<Character>();  
            pq2.add('R');
            pq2.add('U');
           
            System.out.println("The elements of queue 2: "+pq2);
            pq1.addAll(pq2);
            System.out.println("The new queue is: "+pq1);
          System.out.println("is queue contains A "+pq2.contains('A'));


    }

}	
		