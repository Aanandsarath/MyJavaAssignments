package challenges;

public class Challenge1 {

	public static void main(String[] args) {
		//example 1
		String name1 = "Hello World";
		String ss1 = name1.substring(6);
		System.out.println(ss1.length());
		//example 2
		String name2 = "   fly me   to   the moon  ";
		String ss2 = name2.substring(23, 27);
		System.out.println(ss2.length());
		//example 3
		String name3 = "luffy is still joyboy";
		String ss3 = name3.substring(15, 21);
		System.out.println(ss3.length());
	}

}
