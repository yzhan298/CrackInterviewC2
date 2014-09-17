package q5;

public class LinkedList {
	
	public Node head;
	public LinkedList() {
		head = null;
	}

	public void addNodeAtHead(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}
	
	public void addNodeAtTail(int d) {
		Node current = head;
		Node newNode = new Node(d);
		while(current != null)
			current = current.next;
		current = newNode;
		newNode.next = null;
		
	}

	public void showList() {
		Node current = head;
		while(current != null) {
			System.out.print("  ");
			System.out.print(current.data);
			current = current.next;
		}
	}
	
	public Node returnHead() {
		return head;
	}
	
	public int showLength() { // find the nth to last element of a singly linked list 
		Node current = head;
		int size = 1;
		while(current.next != null) {
			current = current.next;
			size++;
		}
		return size;
	}
	
	public void LastNNodes(int n) {
		Node current = head;
		Node flag = head;
		int size = 1;
		while(current.next != null) {
			current = current.next;
			size++;
			if(size == n)
				flag.next = current;
		}
		while(flag.next != null) {
			System.out.print(flag.next.data);
			System.out.print("  ");
			flag = flag.next;
		}
	}
	
	public Node findBeginning(Node head) { // find the beginning node of a loop(if there is a loop)
		Node pointer1 = head; // slower one
		Node pointer2 = head; // faster one
		while(pointer2.next != null) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
			if(pointer1==pointer2)
				break;
		}
		
		if(pointer2.next == null) // there is no meeting point
			return null;
		
		pointer1 = head;
		while(pointer1 != pointer2) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
		}
		return pointer2;
	}
	
}
