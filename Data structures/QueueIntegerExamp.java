import java.util.LinkedList;
import java.util.Queue;

public class QueueIntegerExamp{

	public static void main(String[] args) throws IllegalStateException {
		
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q1 = new LinkedList<>();
		for (int i = 0; i < 5; i++)
	                 q.add(i);
		
		q1.addAll(q);
		
		System.out.println("Elements of queue q1 " + q1);
		
	
		System.out.println("is q1 contains element 2? " +q1.contains(2));
		
		
		System.out.println("is q1 empty? " +q1.isEmpty());

		
		q1.clear();
		
		System.out.println("Elements of queue q1 after clear " + q1);
		
		System.out.println("Elements of queue " + q);
		int removedele = q.remove();
		System.out.println("removed element-" + removedele);
		System.out.println(q);
		int head = q.peek();
		System.out.println("head of q-  " +head);
		int size = q.size();
		System.out.println("Size of queue-" + size);

	}
}