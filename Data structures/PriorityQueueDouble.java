
import java.util.*;

public class PriorityQueueDouble {

	public static void main(String[] args) {

		PriorityQueue<Double> pq1= new PriorityQueue<Double>();
            pq1.add(10.11);
            pq1.add(30.22);
            pq1.add(20.33);
            System.out.println("Elements of queue 1 "+ pq1);
                           
            Double remov =  pq1.remove();
            System.out.println("removed element-"+ remov);                
            System.out.println(pq1);

            Double head = pq1.peek();
            System.out.println("The head of pq1-" +head);

            int size =  pq1.size();
            System.out.println("Size of queue-"+ size);

            pq1.clear();
            boolean Result=pq1.isEmpty();
            System.out.println("The pq is empty(true/false): " +Result);

            pq1.add(13.11);
             pq1.add(10.19);
            System.out.println("New elements of  priorityqueue1 :"+pq1);

            Queue<Double> pq2= new LinkedList<>();  
            pq2.add(14.13);
            pq2.add(9.23);
           
            System.out.println("The elements of pqueue 2: "+pq2);
            pq1.addAll(pq2);
            System.out.println("The new pqueue is: "+pq1);
    System.out.println("this pqueue contains 14.13 "+pq2.contains(14.13));


    }

}