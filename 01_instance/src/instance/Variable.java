package instance;

public class Variable {
	public static void main(String[] args) {
		//메모리 할당
		boolean a;
		a = true;
		System.out.println("a = "+a);
		
		char b;
		b = 'A';
		System.out.println("b = "+b);
		
		char c;
		c = 65;
		//c = 65536; - error
		System.out.println("c = "+c);
		
		int d = 65;
		System.out.println("d = "+d);
		
		int e = 'A';
		System.out.println("e = "+e);
		
		int f = (int)25L; //25L long형
		
		//float g = 43.8; - default double형
		float g = 43.8f; //float형
	}
}


















