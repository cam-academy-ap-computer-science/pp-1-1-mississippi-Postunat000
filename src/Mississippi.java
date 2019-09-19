/* Grading Notes
25/25 points
Best practice indicates that method names should be lower camel case (starting with a lower-case letter). 
Also, methods should do one thing so if the method is intended to print letter M, that's all it should do. 
No need to nest other letters.
I did not deduct points for any of these things as they are more stylistic/best practice things.
-Sarah Gilliam
*/
public class Mississippi {

	public static void main(String[] args) {
		TheM();
		TheS();
		TheS();
		TheP();
	}
	
	public static void TheM() {
		System.out.println("M     M");
		System.out.println("MM   MM");
		System.out.println("M M M M");
		System.out.println("M  M  M");
		System.out.println("M     M");
		System.out.println("M     M");
		System.out.println("M     M");
		System.out.println();
		TheI();
		System.out.println();
	}
	
	public static void TheS() {
		System.out.println(" SSSSS");
		System.out.println("S     S");
		System.out.println("S");
		System.out.println(" SSSSS");
		System.out.println("      S");
		System.out.println("S     S");
		System.out.println(" SSSSS");
		System.out.println();
		System.out.println(" SSSSS");
		System.out.println("S     S");
		System.out.println("S");
		System.out.println(" SSSSS");
		System.out.println("      S");
		System.out.println("S     S");
		System.out.println(" SSSSS");
		TheI();
		System.out.println();
	}
	
	public static void TheP() {
		System.out.println("PPPPPP");
		System.out.println("P     P");
		System.out.println("P     P");
		System.out.println("PPPPPP");
		System.out.println("P");
		System.out.println("P");
		System.out.println("P");
		System.out.println();
		System.out.println("PPPPPP");
		System.out.println("P     P");
		System.out.println("P     P");
		System.out.println("PPPPPP");
		System.out.println("P");
		System.out.println("P");
		System.out.println("P");
		System.out.println();
		TheI();
	}
	
	public static void TheI() {
		System.out.println("IIIII");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("  I");
		System.out.println("IIIII");
	}
}
