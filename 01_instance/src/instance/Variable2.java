package instance;

public class Variable2 {
	int a;//field, �ʱ�ȭ, �ν��Ͻ� ����
	static int b;//field, �ʱ�ȭ, Ŭ���� ����
	String str;

	public static void main(String[] args) {
		int a=10; //local variable(��������), �����Ⱚ(�ݵ�� �ʱ�ȭ)
		System.out.println("���� a="+a);
		System.out.println("�ʵ� a="+ new Variable2().a);
		System.out.println("�ʵ� b="+ Variable2.b);
		System.out.println("�ʵ� str="+new Variable2().str);
	}

}


