package q1;

public class LinkedList {
	
	public Node head;
	public LinkedList() {
		head = null;
	}

	public void addNode(int d) {
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}

	public void showList() {
		Node current = head;
		while(current != null) {
			System.out.print("-->");
			System.out.print(current.data);
			current = current.next;
		}
	}
	
	public Node returnHead() {
		return head;
	}
}
