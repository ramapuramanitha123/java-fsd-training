
import java.util.*;

class PriorityQueueString{
public static void main(String[] args)
{
PriorityQueue<String> pq1= new PriorityQueue<String>();
            pq1.add("ani");
           pq1.add("sai");
            pq1.add("uma");
            pq1.add("paddu");
            System.out.println("Elements of priorityqueue 1 "+ pq1);
                           
            String remov = pq1.remove();
            System.out.println("removed element-"+ remov);                
            System.out.println(pq1);

           String head = pq1.peek();
            System.out.println("head of pq1-" +head);

            int size = pq1.size();
            System.out.println("The Size of priorityqueue-"+ size);

            pq1.clear();
            boolean Result=pq1.isEmpty();
            System.out.println(Result);

            pq1.add("ani");
            pq1.add("paddu");
            System.out.println("New elements of priorityqueue1 :"+pq1);

            PriorityQueue<String> pq2= new PriorityQueue<String>();  
            pq2.add("Good");
            pq2.add("Friends");
           
            System.out.println("The elements of priorityqueue 2: "+pq2);
            pq1.addAll(pq2);
            System.out.println("The new priorityqueue is: "+pq1);
    System.out.println("this priorityqueue contains ani "+pq2.contains("ani"));


    }

}