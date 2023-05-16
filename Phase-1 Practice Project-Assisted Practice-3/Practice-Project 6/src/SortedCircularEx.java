
public class SortedCircularEx {

	    static class Node {
	        int data;
	        Node next;
	        
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	    
	    static Node insert(Node head, int data) {
	        Node newNode = new Node(data);
	        
	        // If the list is empty, make the new node the head and point it to itself
	        if (head == null) {
	            newNode.next = newNode;
	            return newNode;
	        }
	        
	        // If the new node should be inserted at the beginning
	        if (data <= head.data) {
	            newNode.next = head;
	            
	            // Find the last node and update its 'next' pointer to the new node
	            Node last = head;
	            while (last.next != head) {
	                last = last.next;
	            }
	            last.next = newNode;
	            
	            return newNode;
	        }
	        
	        // Find the node after which the new node should be inserted
	        Node curr = head;
	        while (curr.next != head && curr.next.data < data) {
	            curr = curr.next;
	        }
	        
	        // Insert the new node between curr and curr.next
	        newNode.next = curr.next;
	        curr.next = newNode;
	        
	        return head;
	    }
	    
	    static void printList(Node head) {
	        if (head == null) {
	            return;
	        }
	        
	        Node curr = head;
	        do {
	            System.out.print(curr.data + " ");
	            curr = curr.next;
	        } while (curr != head);
	    }
	    
	    public static void main(String[] args) {
	        Node head = null;
	        
	        // Example usage
	        head = insert(head, 3);
	        head = insert(head, 1);
	        head = insert(head, 4);
	        head = insert(head, 2);
	        
	        printList(head); // Output: 1 2 3 4
	    }
	

}
