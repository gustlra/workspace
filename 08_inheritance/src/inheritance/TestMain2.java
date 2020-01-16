package inheritance;

class AA {
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.print("AA : "+ a + " " );
	}
}
//----------------
class BB extends AA {
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : "+ a + " " );
	}
}
//----------------
public class TestMain2 {
	public static void main(String[] args) {
		BB bb = new BB();
		bb.disp();// BB : 13
		System.out.println(bb.a + " ");
		System.out.println();
		
		AA aa = new BB();//부모 = 자식
		aa.disp();
		System.out.println(aa.a + " ");
		System.out.println();
		
		BB bb2 = (BB)aa;//자식 = (자식)부모
		System.out.print(bb2.a + " ");
	}
	
}














