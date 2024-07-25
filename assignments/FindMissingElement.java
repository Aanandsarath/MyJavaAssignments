package assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
	   int Array1 [] = {1,3,4,2,8,6,7};
	   int length = Array1.length;
	   Arrays.sort(Array1);
	   // Array1 = {1,2,3,4,6,7,8}
	   for(int i =0;i<=Array1.length;i++) {
		   if(Array1[i]!=i+1) {
			   System.out.println("The missing number is "+(i+1));
			   break;
		   }
	   }

	}

}
