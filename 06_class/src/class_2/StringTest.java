package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";//literal ����
		String b = "apple";
		if(a==b) System.out.println("a�� b�� �������� ����"); //O
		else System.out.println("a�� b�� �������� �ٸ���");
		if(a.equals(b)) System.out.println("a�� b�� ���ڿ��� ����");//O
		else System.out.println("a�� b�� ���ڿ��� �ٸ���");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c�� d�� �������� ����");
		else System.out.println("c�� d�� �������� �ٸ���"); // O
		if(c.equals(d)) System.out.println("c�� d�� ���ڿ��� ����"); //O
		else System.out.println("c�� d�� ���ڿ��� �ٸ���");
		System.out.println();
		
		String e = "���� ��¥�� "+2019+12+30;
		System.out.println("e = "+e);
		
		/*
		 * ���ڿ��� ������ �ȵǹǷ� �޸� 4�� �����ȴ�
		 * JVM�� ���ؼ� ���� �� Garbage Collector�� ������
		 * Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����
		 * "���� ��¥�� "
		 * "���� ��¥�� 2019"
		 * "���� ��¥�� 201912"
		 * e ---> "���� ��¥�� 20191230"
		 */
		
		System.out.println("���ڿ� ũ�� = "+e.length());
		
		for(int i=0; i<e.length(); i++){
			System.out.println(i+" : "+e.charAt(i));
		}

		System.out.println("�κ� ���ڿ� ����="+e.substring(7));
		System.out.println("�κ� ���ڿ� ����="+e.substring(7,11));
		
		System.out.println("�빮�� ���� = "	+ "Hello".toUpperCase());//HELLO
		System.out.println("�ҹ��� ���� = "	+ "Hello".toLowerCase());//hello

		System.out.println("���ڿ� �˻�="+e.indexOf("¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("��¥"));
		System.out.println("���ڿ� �˻�="+e.indexOf("���ٺ�"));//-1
	}

}


















