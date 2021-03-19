enum SIZE{
	SMALL, MEDIUM, LARGE
}
public class Fruits {
	
	public static void Apple() {
		System.out.println("Apple");
		SIZE s = SIZE.LARGE;
		System.out.println("Size of an apple is " + s);
		System.out.println("Colour is dark red.");
	}
	
	public static void Guava() {
		System.out.println("Guava");
		SIZE s = SIZE.MEDIUM;
		System.out.println("Size of an guava is " + s);
		System.out.println("Colour is light green.");
	}
	
	public static void Banana() {
		System.out.println("Banana");
		SIZE s = SIZE.SMALL;
		System.out.println("Size of an banana is " + s);
		System.out.println("Colour is bright yellow.");
	}
	
	public static void Grapes() {
		System.out.println("Grape");
		SIZE s = SIZE.SMALL;
		System.out.println("Size of an grape is " + s);
		System.out.println("Colour is green.");
	}

}
