package inheritance;


class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "사자";
	public static final String ANIMAL2;
	
	static {
		ANIMAL2 = "기린";
	}
	public Final() {
		FRUIT2 = "딸기";
	}
}
//-------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		//AGE++; - error
		
		final int AGE2;
		AGE2 = 30;
		//AGE2 = 35; - error
		
		Final f = new Final();
		System.out.println("FRUIT = "+f.FRUIT);
		System.out.println("FRUIT2 = "+f.FRUIT2);
		
		System.out.println("ANIMAL = "+Final.ANIMAL);
		System.out.println("ANIMAL2 = "+Final.ANIMAL2);
	}

}













