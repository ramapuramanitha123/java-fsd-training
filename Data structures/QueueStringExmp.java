import java.util.LinkedList;
import java.util.Queue;

class QueueStringExmp
{
public static void main(String[] args)
{
Queue<String> q1= new LinkedList<>();
            q1.add("ani");
            q1.add("sai");
            q1.add("uma");
            q1.add("paddu");
            System.out.println("Elements of queue 1 "+ q1);
                           
            String remov = q1.remove();
            System.out.println("removed element-"+ remov);                
            System.out.println(q1);

           String head = q1.peek();
            System.out.println("head of q1-" +head);

            int size = q1.size();
            System.out.println("Size of queue-"+ size);

            q1.clear();
            boolean Result=q1.isEmpty();
            System.out.println(Result);

            q1.add("ani");
            q1.add("paddu");
            System.out.println("New elements of queue1 :"+q1);

            Queue<String> q2= new LinkedList<>();  
            q2.add("Good");
            q2.add("Friends");
           
            System.out.println("The elements of queue 2: "+q2);
            q1.addAll(q2);
            System.out.println("The new queue is: "+q1);
    System.out.println("is queue contains ani "+q2.contains("ani"));


    }

}