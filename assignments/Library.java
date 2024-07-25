package assignments;

public class Library {
	public String addbook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	public void issuebook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library Lib = new Library();
		String bookTitle = null;
		Lib.addbook(bookTitle );
		Lib.issuebook();
	}

}
