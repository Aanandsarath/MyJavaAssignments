package challenges;

public class PalindromeChallenge {

	public static void main(String[] args) {
		 //      STRING FUNCTION CHALLENGE 3 - INPUT = "A man, a plan, a canal: Panama"
		String pal = "A man, a plan, a canal: Panama";
		String reverse ="";
		String replace1 = pal.replace(":"," ");
		String replace2 = replace1.replace(","," ");
		String replace3 = replace2.replace(" ","");
		String strmain = replace3.toLowerCase();
		int length = strmain.length();
		System.out.println("Before reverse " +strmain);
		for (int i = length-1; i >= 0; i--) {
			reverse=reverse+strmain.charAt(i);		
		}
		System.out.println("After reverse "+reverse);
		if (reverse.equals(strmain)) {
			System.out.println("The String " +strmain+" is a palindrome");
		} else {
			System.out.println("The String " +strmain+ " is not a palindrome");
		}
             //      STRING FUNCTION CHALLENGE 3 - INPUT = "RACE A CAR"
		String pal2 = "race a car";
		String reverse2 ="";
		String strmain2 = pal2.replace(" ","");
		int length2 = strmain2.length();
		System.out.println("Before reverse " +strmain2);
		for (int i = length2-1; i >= 0; i--) {
			reverse2=reverse2+strmain2.charAt(i);		
		}
		System.out.println("After reverse "+reverse2);
		if (reverse2.equals(strmain2)) {
			System.out.println("The String " +strmain2+" is a palindrome");
		} else {
			System.out.println("The String " +strmain2+ " is not a palindrome");
		}
		
		//         STRING FUNCTION CHALLENGE 3 - INPUT = " "
		String pal3 = " ";
		String reverse3 ="";
		String strmain3 = pal3.replace(" ","");
		int length3 = strmain3.length();
		System.out.println("Before reverse " +strmain3);
		for (int i = length3-1; i >= 0; i--) {
			reverse3=reverse3+strmain3.charAt(i);		
		}
		System.out.println("After reverse "+reverse3);
		if (reverse3.equals(strmain3)) {
			System.out.println("The String " +strmain3+" is a palindrome");
		} else {
			System.out.println("The String " +strmain3+ " is not a palindrome");
		}
	}
		
	}


