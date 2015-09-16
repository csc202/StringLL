
public class StringLL {
	private Node head;
	
	public StringLL() {
		head = null;
	}
	
	
	//insert for queue (FIFO)
	public void insert(String data) {
		//1. create new node
		Node tail = head;
		Node node = new Node(data);
		Node prev = tail;
		tail = node;

		//2. move LL head
		if(head==null) {
			this.head = node;
		} else {
			prev.setPtr(node);
		}
		
	}
	
	//insert for stack (LIFO)
//	public void insert(String data) {
//		//1. create new node
//		Node node = new Node(data);
//		//1.1 set the pointer to head 
//		if (head!=null) {
//			node.setPtr(head);
//		}
//		//2. move LL head
//		this.head = node;
//	}
	
	public String toString() {
		String list = "";
		Node current = this.head;
		while(current!=null) {
			list += current.getData() + ",";
			current = current.getPtr();
		}
		return list;
	}

}
