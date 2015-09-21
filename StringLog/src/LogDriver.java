
public class LogDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log studentLog = new Log("Student Log");
		System.out.print("List: ");
		studentLog.add("Kerby");
		studentLog.add("Elohe");
		studentLog.add("Shayan");
		studentLog.add("Jimmy");
		System.out.println(studentLog);
		System.out.println("Remove:");
		System.out.println(studentLog.delete());
		System.out.print("Updated List: ");
		System.out.println(studentLog);

		System.out.println("Remove:");
		System.out.println(studentLog.delete());
		System.out.print("Updated List: ");
		System.out.println(studentLog);
		
		System.out.println("Remove:");
		System.out.println(studentLog.delete());
		System.out.print("Updated List: ");
		System.out.println(studentLog);
		
		System.out.println("Remove:");
		System.out.println(studentLog.delete());
		System.out.print("Updated List: ");
		System.out.println(studentLog);
		
		System.out.println("Remove:");
		System.out.println(studentLog.delete());
		System.out.print("Updated List: ");
		System.out.println(studentLog);
}
}
