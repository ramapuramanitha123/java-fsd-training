
import java.util.*;

class PriorityQueueInteger {
	
	
	public static void main(String args[])
	{
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
                                
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

		
            pq.add(10);
            pq.add(20);
            pq.add(30);
            System.out.println("Elements of queue 1 "+ pq);
                           
            int remov = pq.remove();
            System.out.println("removed element-"+ remov);                
            System.out.println(pq);

            int head = pq.peek();
            System.out.println("head of pq-" +head);

            int size = pq.size();
            System.out.println("Size of pq-"+ size);

            pq.clear();
            boolean result=pq.isEmpty();
            System.out.println("The queue is empty(true/false): " +result);
             pq.add(11);
            pq.add(5);
            System.out.println("New elements of queue1 :"+pq);
  
            pq1.add(14);
            pq1.add(10);
            pq1.add(19);
            System.out.println("The elements of queue 2: "+pq1);
            pq.addAll(pq1);
             System.out.println("the new  queue is"+pq1) ;
           System.out.println("is queue contains 14 "+pq1.contains(14));


    }

}