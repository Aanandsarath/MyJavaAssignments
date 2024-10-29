package javaweek3assignments;

public abstract class MySQLConnection implements DatabaseConnection {


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
	public abstract void executeQuery();
}
