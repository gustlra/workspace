package constructor;

class ConstructorTest {
	private String name;
	private int age;
	
	public ConstructorTest() {
		System.out.println("�⺻ ������");
	}
	public ConstructorTest(String name) {
		this();//Overload�� �ٸ� �����ڸ� ȣ��
		this.name = name;
	}
	public ConstructorTest(int age) {
		this("�ڳ�");
		this.age = age;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
}
//----------
public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest aa = new ConstructorTest();
		System.out.println("�̸�="+aa.getName()+"\t ����="+aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("ȫ�浿");
		System.out.println("�̸�="+bb.getName()+"\t ����="+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("�̸�="+cc.getName()+"\t ����="+cc.getAge());
		System.out.println();
	}

}












