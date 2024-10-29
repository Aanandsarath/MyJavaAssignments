package javaweek3assignments;

public class JavaConnection2 extends MySQLConnection{
	
	@Override
	public void executeQuery() {
		System.out.println("The Qurey has been Executed");
		
	}

	public static void main(String[] args) {
		JavaConnection2 JC2 = new JavaConnection2();
		JC2.connect();
		JC2.executeQuery();
		JC2.executeUpdate();
		JC2.disconnect();
	}


}
