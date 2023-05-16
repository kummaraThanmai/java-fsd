import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
		
		    public static void main(String[] args) {
		        Queue<Integer> queue = new LinkedList<>();

		        
		        queue.add(10);
		        queue.add(20);
		        queue.add(30);
		        queue.add(40);

		        System.out.println("Queue elements: " + queue);

		        
		        int removedElement = queue.remove();
		        System.out.println("Removed element: " + removedElement);

		       
		        int frontElement = queue.peek();
		        System.out.println("Front element: " + frontElement);

		      
		        boolean isEmpty = queue.isEmpty();
		        System.out.println("Is queue empty? " + isEmpty);
		    }
		

	}


