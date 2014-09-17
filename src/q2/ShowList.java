package q2;

public class ShowList {

	public static void main(String[] args) {
		LinkedList newList = new LinkedList();
		newList.addNodeAtHead(1);
		newList.addNodeAtHead(2);
		newList.addNodeAtHead(3);
		newList.addNodeAtHead(8);
		newList.addNodeAtHead(7);
		newList.addNodeAtHead(6);
		newList.addNodeAtHead(5);
		newList.addNodeAtHead(4);
		newList.showList();
		System.out.println("");
		newList.LastNNodes(4);
		
		
	}

}
