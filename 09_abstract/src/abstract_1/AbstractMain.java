package abstract_1;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); - error
		AbstractTest at = new AbstractMain();
		at.setName("홍길동");//호출
		System.out.println("이름="+at.getName());
	}

}
