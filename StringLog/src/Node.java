public class Node {
	private String data;
	private Node ptr;

	public Node(String data) {
		this.data = data;
		this.ptr = null;
	}

	public Node(String data, Node ptr) {
		this.data = data;
		this.ptr = ptr;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getPtr() {
		return ptr;
	}

	public void setPtr(Node ptr) {
		this.ptr = ptr;
	}

}
