package week3.day2;

import java.util.Iterator;

public class NoOfOccurence {

	public static void main(String[] args) {
		int repeatedtimes = 0;
		String name = "TestLeaf";
		char[] test = name.toCharArray();
		for (int i = 0; i < test.length; i++) {
			if(test[i]=='e') {
				repeatedtimes++;
			}
		}
		System.out.println("The number of occurances of letter 'E' is : "+repeatedtimes);
	}

}
