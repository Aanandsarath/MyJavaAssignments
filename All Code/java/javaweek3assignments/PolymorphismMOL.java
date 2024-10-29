package javaweek3assignments;

public class PolymorphismMOL {
	public void reportStep(String msg, String status) {
        System.out.println("The message and Status of the step is : "+msg+", "+status);
	}
	public void reportStep(String msg, String status, boolean parameter) {
		System.out.println("The message and Status of the step is : "+msg+", "+status+" and the parameter is : "+parameter);

	}

	public static void main(String[] args) {
		PolymorphismMOL pmol = new PolymorphismMOL();
		pmol.reportStep("Welcome Home","You have entered the home");
		pmol.reportStep("Hello World","Entered the World", true);

	}

}
