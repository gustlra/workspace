package instance;

/*
�̸�(name)�� ȫ�浿, ����(gender)M�� ���� ���ڶ�� ��� M�� �ƴϸ� ���ڶ�� ����Ͻÿ�

[������]
ȫ�浿�� �����̴�
�Ǵ� 
ȫ�浿�� �����̴�

 */
public class Practice7 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		//char gender = 'F';
		char gender = 'M';
		
		String verify_gen = gender == 'M' ? "����" : "����";
		
		System.out.println(name+"�� "+verify_gen+"�̴�.");
	}
}










