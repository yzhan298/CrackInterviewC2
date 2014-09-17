package q4;

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
	
	public int showLength() {
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
	
	public void addList(LinkedList a, LinkedList b) {
		int[] arr_a = new int[a.showLength()];
		int[] arr_b = new int[b.showLength()];
		Node current;
		for(int i=0;i<a.showLength();i++) {
			arr_a[a.showLength()-1-i] = current.data;
			current = current.next;
		}
	}
	
}
