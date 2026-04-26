package linked_list;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	// Insertion
	public void insertAtEnd(int newData) {
		Node newNode = new Node(newData);

		if (head == null) {
			head = new Node(newData);
			return;
		}

		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}

	// Display

	public void displayLL() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList obj = new LinkedList();
		
		obj.insertAtEnd(0);
		obj.insertAtEnd(2);
		obj.insertAtEnd(4);
		obj.insertAtEnd(6);
		
		System.out.print("Original Linked List : ");
		obj.displayLL();
		
		System.out.println();
		System.out.println();
		
		obj.insertAtEnd(10);
		System.out.print("After Insertion Linked List : ");
		obj.displayLL();
		
		
	}

}
