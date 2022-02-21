import java.util.LinkedList;
import java.util.Queue;


public class QueueCharExample { 
      public static void main(String[] args){


      Queue<Character> q1= new LinkedList<>();
            q1.add('P');
            q1.add('P');
            q1.add('A');
            q1.add('R');
            System.out.println("Elements of queue 1 "+ q1);
                           
            Character remov = q1.remove();
            System.out.println("removed element-"+ remov);                
            System.out.println(q1);

            Character head = q1.peek();
            System.out.println("head of q1-" +head);

            int size = q1.size();
            System.out.println("Size of queue-"+ size);

            q1.clear();
            boolean Result=q1.isEmpty();
            System.out.println(Result);

            q1.add('P');
            q1.add('A');
            System.out.println("New elements of queue1 :"+q1);

            Queue<Character> q2= new LinkedList<>();  
            q2.add('R');
            q2.add('U');
           
            System.out.println("The elements of queue 2: "+q2);
            q1.addAll(q2);
            System.out.println("The new queue is: "+q1);
          System.out.println("is queue contains A "+q2.contains('A'));


    }

}	
		