package javaweek3assignments;

public interface DatabaseConnection {
	public void connect();
	public void disconnect();
	public void executeUpdate();
}
