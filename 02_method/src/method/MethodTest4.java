package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
�̸�(name), �ֹι�ȣ(id)�� �Է��Ͽ� ������ ����Ͻÿ�  
����(gender)�� �����ϴ� comp()�� ����(age)�� ����ϴ� calcAge() �ۼ��Ͻÿ�

�̸� �Է� : ȫ�浿
�ֹι�ȣ �Է� : 021023-345678

2019 - 2000 + 1

ȫ�浿���� �����̰� 20�� �Դϴ�

      012345
aa = "orange";
aa.charAt(0);  0��° ��ġ 'o'
aa.charAt(1);  1��° ��ġ 'r'
aa.charAt(5);  2��° ��ġ 'a'

aa = "orange";
aa.substring(0,2); 0������ 2�� ��������  "or"
*/

public class MethodTest4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();
		System.out.print("�ֹι�ȣ �Է� : ");
		String id = br.readLine(); //910716-1~~~
		
		MethodTest4 mt = new MethodTest4();
		
		String gender = mt.comp(id);//ȣ��
		int age = mt.calcAge(id);//ȣ��
		
		System.out.println(name+"���� "+gender+"�̰� "+age+"�� �Դϴ�.");
	}
		
	private int calcAge(String id) {
		int year = Integer.parseInt(id.substring(0,2));//91
		char g = id.charAt(7);
		year += (g=='1' || g=='2' ? 1900 : 2000); 
		int age = 2019 - year + 1;
		
		return age;
	}

	public String comp(String id) {
		return id.charAt(7)=='1' || id.charAt(7)=='3' ? "����" : "����" ;
	}

}


















