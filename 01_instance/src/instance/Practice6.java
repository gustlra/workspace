package instance;

/*
ch�� �ִ� �����Ͱ� �빮���̸� �ҹ��ڷ� ����ϰ� �ƴϸ�(�ҹ���) �빮�ڷ� ����Ͻÿ�

[������]
T �� t (ch�� T�� ���� ��)
�Ǵ�
e �� E (ch�� e�� ���� ��)
 
*/

public class Practice6 {

	public static void main(String[] args) {
		//char ch = 'E';//�빮��
		char ch = 'u';//�ҹ���
		int verify_ch = ch>='A' && ch<='Z' ? ch+32 : ch-32;
		
		System.out.println(ch+" �� "+(char)verify_ch);
				
	}
}









