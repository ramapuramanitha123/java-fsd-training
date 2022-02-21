import java.util.LinkedList;
import java.util.Queue;

public class QueueDouble {

	public static void main(String[] args) {

		Queue<Double> q1= new LinkedList<>();
            q1.add(10.11);
            q1.add(20.222);
            q1.add(30.333);
            System.out.println("Elements of queue 1 "+ q1);
                           
            Double remov = q1.remove();
            System.out.println("removed element-"+ remov);                
            System.out.println(q1);

            Double head = q1.peek();
            System.out.println("head of q1-" +head);

            int size = q1.size();
            System.out.println("Size of queue-"+ size);

            q1.clear();
            boolean Result=q1.isEmpty();
            System.out.println("The queue is empty(true/false): " +Result);

            q1.add(11.11);
            q1.add(12.11);
            System.out.println("New elements of queue1 :"+q1);

            Queue<Double> q2= new LinkedList<>();  
            q2.add(14.13);
            q2.add(13.23);
           
            System.out.println("The elements of queue 2: "+q2);
            q1.addAll(q2);
            System.out.println("The new queue is: "+q1);
    System.out.println("is queue contains 14.23 "+q2.contains(14.23));


    }

}