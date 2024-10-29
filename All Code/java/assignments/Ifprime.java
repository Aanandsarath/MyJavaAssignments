package assignments;

public class Ifprime {

	public static void main(String[] args) {
		int num = 7;
		int count;
		if(num==0||num==1) {
			System.out.println("Not a prime number");
		}
			for (int i = 2; i<=num; i++) {
				count=num%i;
				if(count==0) {
					System.out.println("Not a Prime");
					break;
				}else {
					System.out.println("Prime");
					break;
				}
				
			}
	}
}

		


