package instance;

/*
�̸��� L(name)�� ����� �⺻��(basePay)�� 2500000�϶�
3.3% ����(tax)�� ����(salary)�� ����Ͻÿ�. �����ʹ� �ݵ�� ������ �����ϱ�.

���� = �⺻�� * 3.3%(0.033)
���� = �⺻��-����
<���� ���>
*** L�� ���� ***
�⺻�� : 2500000��
����   : 82500��
����   : 2417500��
 */
public class Practice3 {

	public static void main(String[] args) {
		String name = "L";
		//char name = 'L';
		int basePay = 2500000;
		int tax = (int) (basePay*0.033);
		int salary = basePay-tax;
		
		System.out.println("***"+name+"�� ����***");
		System.out.println("�⺻�� : "+basePay+"��");
		System.out.println("���� : "+tax+"��");
		System.out.println("���� : "+salary+"��");
			
	}
}






