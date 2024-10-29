package adios;

import java.util.Arrays;

public class Arraypractice {

	public static void main(String[] args) {
		int [] data = {2,10,10,100,2,10,11,2,11,2};
		int length = data.length;
		for (int i = 0; i <length; i++) {
			for (int j = i+1; j <length; j++) {
				if (data[i]==data[j]) {
					System.out.println("The Duplicate Values are : " + data[j]);
					break;
				}
				
			}
			
		}
		int [] data2 = {5, 40, 1, 40, 100000, 1, 5, 1};
		Arrays.sort(data2);
		for (int i = 0; i < data2.length-1; i++) {
			if (data2[i]==data2[i+1]) {
				System.out.println("Doop values are : " +data2[i]);
				
			}
			
		}
	}

}
