
public class SinglyLinkedList {

	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
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
	            }
	        }

	        void delete(int data) {
	            if (head == null) {
	                return;
	            }

	            if (head.data == data) {
	                head = head.next;
	            } else {
	                Node current = head;
	                while (current.next != null && current.next.data != data) {
	                    current = current.next;
	                }

	                if (current.next != null) {
	                    current.next = current.next.next;
	                }
	            }
	        }

	        void display() {
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        LinkedList linkedList = new LinkedList();

	        // Insert elements into the linked list
	        linkedList.insert(10);
	        linkedList.insert(20);
	        linkedList.insert(30);
	        linkedList.insert(40);

	        
	        linkedList.display(); 

	        
	        linkedList.delete(20);

	        
	        linkedList.display(); 
	    }

}
