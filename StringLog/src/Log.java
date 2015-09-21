import edu.nvcc.csc202.exception.EmptyListException;


public class Log {
	private LL<String> stringLL;
	private String name;
	
	public Log() {
		this.setName("unknown");
		stringLL = new LL<String>();
	}
	
	public Log(String name) {
		this.setName(name);
		stringLL = new LL<String>();
	}
	
	public void add(String data) {
		stringLL.enqueue(data);
	}
	
	public String delete() {
		String element= null;
		try {
			element = stringLL.dequeue();
		} catch (EmptyListException e) {
			System.out.println("Remove the list from empty list will return null");
		}
		return element;
	}
	
	public LL<String> getStringLL() {
		return stringLL;
	}
	
	public String toString() {
		return stringLL.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
