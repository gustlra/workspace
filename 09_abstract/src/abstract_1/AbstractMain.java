package abstract_1;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); - error
		AbstractTest at = new AbstractMain();
		at.setName("ȫ�浿");//ȣ��
		System.out.println("�̸�="+at.getName());
	}

}
