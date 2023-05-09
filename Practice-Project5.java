package collections;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list);

		//traversing list through iteartor
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//vector
		
		System.out.println("\n");
	      System.out.println("Vector");
	      Vector<String> vec = new Vector();
	      vec.addElement("mom"); 
	      vec.addElement("dad"); 
	      System.out.println(vec);
	      
	      //stack
	      
	      System.out.println("\n");
	      System.out.println("stack");
	      Stack<String> stackk = new Stack<String>();
	      stackk.push("mango");
	      stackk.push("apple");
	      stackk.push("banana");
	      
	      System.out.println(stackk);
	      
	      //queue
	      System.out.println("\n");
	      System.out.println("queue");
	      PriorityQueue<String> Queue = new PriorityQueue<String>();
	      Queue.add("carrot");
	      Queue.add("tomato");
	      Queue.add("beetroot");
	      System.out.println("head:"+Queue.element());
	      System.out.println("head:"+Queue.peek());
	      Iterator itr1 = Queue.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
				Queue.remove();
				Queue.poll();
				
				System.out.println("\n");
				
			      Iterator itr2 = Queue.iterator();
					while(itr2.hasNext()) {
						System.out.println(itr2.next());
					}
				
	      
	      
		

	}

}
