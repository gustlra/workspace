package instance;

public class Variable2 {
	int a;//field, 초기화, 인스턴스 변수
	static int b;//field, 초기화, 클래스 변수
	String str;

	public static void main(String[] args) {
		int a=10; //local variable(지역변수), 쓰레기값(반드시 초기화)
		System.out.println("지역 a="+a);
		System.out.println("필드 a="+ new Variable2().a);
		System.out.println("필드 b="+ Variable2.b);
		System.out.println("필드 str="+new Variable2().str);
	}

}


