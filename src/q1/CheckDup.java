package q1;

public class CheckDup {
	
	public static void checkDup(Node head) {
		if(head == null) return;
		Node previous = head;
		Node current = previous.next;
		while(current != null) {
			Node pointer = head;
			while(pointer != current) {
				if(pointer.data == current.data) {
					previous.next = current.next;
					current = current.next;
					break;
				}
				pointer = pointer.next;
			}
			if(pointer == current) {
				previous = current;
				current = current.next;
			}
				
		}	
	}



	public static void main(String[] args) {

		LinkedList newList = new LinkedList();
		
		newList.addNode(1);
		newList.addNode(2);
		newList.addNode(3);
		newList.addNode(4);
		newList.addNode(5);
		newList.addNode(2);
		newList.showList();
		Node head = newList.returnHead();
		checkDup(head);
		System.out.println("");
		newList.showList();
	}

}
