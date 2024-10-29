package adios;

public class Constructors {
	int id;
	String empname;
	String compname;
	String designation;
	int salary;
	Constructors() {
		System.out.println("This is a Default Constructor");
	}
	
	Constructors(int a) {
		this();
		this.id=a;
		System.out.println("Employee ID number is : "+a);
	}
	Constructors(String b, String c) {
		this(1098735);
		this.empname=b;
		this.compname=c;
		System.out.println("The employee name is : "+b+ "\n" + "Company name is : "+c);
	}
	Constructors(String d ,int e) {
		this("Walter White", "Los pollos hermanos");
        this.designation=d;
        this.salary=e;
		System.out.println("The employee designation is : "+d+ "\n" + "Salary of the employee is "+e);
	}
	

	public static void main(String[] args) {
		Constructors obj = new Constructors("Businessman", 20000);
		

	}

}
