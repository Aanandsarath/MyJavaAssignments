package javaweek3assignments;

public class JavaConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Network has been connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Network has been disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update has been Executed");
		
	}

	public static void main(String[] args) {
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.executeUpdate();
		JC.disconnect();
	}

}
