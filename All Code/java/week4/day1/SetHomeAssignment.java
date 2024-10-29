package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;


public class SetHomeAssignment {

	public static void main(String[] args) {
		String name = "Aanand";
		System.out.println("Before converting to Set : "+name);
		char[] charArray = name.toCharArray();
		Set<Character> set1 = new LinkedHashSet<Character>();
		String end="";
		
		for (Character cha : charArray) {
		      set1.add(cha);
		}
		System.out.println("After converting to Set : "+set1);
		for (Character s : set1) {
			end+=s;
		}
		System.out.println("Desired output in String Format : "+end);
	}  
	
	
	

}
