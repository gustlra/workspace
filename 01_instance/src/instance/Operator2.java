package instance;

public class Operator2 {

	public static void main(String[] args) {
		boolean a = 25>36;
		System.out.println("a="+a);//flase
		System.out.println("!a="+!a);//true
		System.out.println();
		
		String b = "apple";//���ڿ� literal
		String c = new String("apple");
		System.out.println("b==c : "+ (b==c ? "����" : "�ٸ���"));//�ּ�=������
		System.out.println("b!=c : "+ (b!=c ? "��" : "����"));
		System.out.println();
		
		System.out.println("b.equals(c) : "+ (b.equals(c) ? "����" : "�ٸ���"));
		System.out.println("!b.equals(c) : "+ (!b.equals(c) ? "��" : "����"));
		
	}

}















