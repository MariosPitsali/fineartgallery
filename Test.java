public class Test {

public static void main (String [] args){

	User n = new User ( "Marios", "Pitsalidis", "mpitsali", "manestroparea007", "marios.pitsali@gmail.com", "Korinthias 6");
	User an = new User ( "Maris", "Pitsalidis", "mpitsali", "manestroparea007", "marios.pitsali@gmail.com", "Korinthias 6");
	System.out.println (n.getId());
	System.out.println (an.getId());

	Photo m = new Photo("b&w", 1876, "America", "www.youtubr.gr", 4.50);
	double h = m.getPrice();
	System.out.println(h);


}

}