
public class StringLog {
	private StringLL stringLL;
	private String name;
	
	public StringLog() {
		this.name = "unknown";
		stringLL = new StringLL();
	}
	
	public StringLog(String name) {
		this.name = name;
		stringLL = new StringLL();
	}
	
	public void add(String data) {
		stringLL.insert(data);
	}
	
	public StringLL getStringLL() {
		return stringLL;
	}
	
	public String toString() {
		return stringLL.toString();
	}


}
