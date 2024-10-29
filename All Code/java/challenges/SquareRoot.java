package challenges;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 4;
		int sr = 0;
		for (int i = 1; i <= x; i++) {
			if (x%i==0) {
				if (i*i==x) {
					sr=i;				
				}			
		}		
		}
		System.out.println("The Square root of the number is : "+sr);
		
	}

}
