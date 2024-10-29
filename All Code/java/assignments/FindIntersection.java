package assignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int [] Value1 = {3,2,11,4,6,7};
		int [] Value2 = {1,2,8,4,9,7};
		int length1 = Value1.length;
		int length2= Value2.length;
		Arrays.sort(Value1);
		//After sorting Value 1 array will be like {2,3,4,6,7,11}
		Arrays.sort(Value2);
		//After sorting Value 2 array will be like {1,2,4,7,8,9}
		for (int i = 0; i < Value1.length; i++) {
			for (int j = 0; j < Value2.length; j++) {
				if(Value1[i]==Value2[j]) {
					System.out.println("The Duplicate Value is " +Value1[i]);
				}
				
			}
			
		}
		
	}

}
