package week3.day1;

public class Safari extends Edge {
   public void readermode() {
	System.out.println("Optimised to reader mode");

}
   public void fullscreenmode() {
	System.out.println("Optimised to Full screen mode");

}
   public static void main(String[] args) {
	 Safari sf = new Safari();
	 sf.allbrowser("BrowserName",2.45f);
	 sf.openURL();
	 sf.closebrowser();
	 sf.navigatebrowser();
	 sf.openincognito();
	 sf.clearcache();
	 sf.takesnap();
	 sf.clearcookies();
	 sf.readermode();
	 sf.fullscreenmode();
}

}
