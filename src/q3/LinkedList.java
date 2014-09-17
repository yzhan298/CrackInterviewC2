package q3;

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}

	public void addNodeAtHead(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}
	
	public void addNodeAtTail(int d) { // Need to be improved
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
	
	public void deleteMidNode() {
		LinkedList test;
		test.show
	}
}
