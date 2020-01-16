package class_1;

class This{
	private String name;
	private int age;
	
	public void setName(String name) {//구현
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
//--------------
public class ThisTest {
	public static void main(String[] args) {
		This aa = new This();
		System.out.println("객체 aa = "+aa);
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println("이름="+aa.getName()+"\t 나이="+aa.getAge());
		System.out.println();
		
		Person bb;
		bb = new Person();
		System.out.println("객체 bb = "+bb);
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("이름="+bb.getName()+"\t 나이="+bb.getAge());
		System.out.println();
	}

}













