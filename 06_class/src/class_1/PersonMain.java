package class_1;

class Person{
	private String name;//�ʵ�, �ʱⰪ
	private int age;
	
	public void setName(String n) {//����
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setData(String n,int a) {
		name = n;
		age = a;
	}
	public void setData() {}
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
}
//----------
public class PersonMain {
	public static void main(String[] args) {
		Person aa;
		aa = new Person();
		System.out.println("��ü aa = "+aa);
		aa.setName("ȫ�浿");//ȣ��
		aa.setAge(25);
		System.out.println("�̸�="+aa.getName()+"\t ����="+aa.getAge());
		System.out.println();
		
		Person bb;
		bb = new Person();
		System.out.println("��ü bb = "+bb);
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("�̸�="+bb.getName()+"\t ����="+bb.getAge());
		System.out.println();
		
		Person cc;
		cc = new Person();
		cc.setData("��ġ", 30);
		System.out.println("��ü cc = "+cc);
		System.out.println("�̸�="+cc.getName()+"\t ����="+cc.getAge());
		System.out.println();
		
		Person dd;
		dd = new Person();
		dd.setData();
		System.out.println("��ü dd = "+dd);
		System.out.println("�̸�="+dd.getName()+"\t ����="+dd.getAge());
		System.out.println();
	}

}
















