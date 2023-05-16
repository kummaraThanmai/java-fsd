
public class DoublyLinkedList {

	    static class Node {
	        int data;
	        Node prev;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.prev = null;
	            this.next = null;
	        }
	    }

	    static class LinkedList {
	        Node head;

	        void insert(int data) {
	            Node newNode = new Node(data);

	            if (head == null) {
	                head = newNode;
	            } else {
	                Node current = head;
	                while (current.next != null) {
	                    current = current.next;
	                }
	                current.next = newNode;
	                newNode.prev = current;
	            }
	        }

	        void displayForward() {
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }

	        void displayBackward() {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }

	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.prev;
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        LinkedList linkedList = new LinkedList();

	        
	        linkedList.insert(10);
	        linkedList.insert(20);
	        linkedList.insert(30);
	        linkedList.insert(40);

	        
	        System.out.println("Forward traversal:");
	        linkedList.displayForward(); // Output: 10 20 30 40

	        
	        System.out.println("Backward traversal:");
	        linkedList.displayBackward(); // Output: 40 30 20 10
	    }
	

}
