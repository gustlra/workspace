package instance;

/*
���� score�� ���� 2�� 3�� ��������� �ƴ����� ����Ͻÿ�

[������]
25�� 2�� 3�� ������� �ƴϴ� (score=25�϶�)
�Ǵ�
12�� 2�� 3�� ������̴� (score=12�϶�)
*/

public class Practice5 {

	public static void main(String[] args) {
		int score = 24;
		//int score = 20;
		String result = 
				score%2==0 && score%3==0 ? score+"�� 2�� 3�� ������̴�" : score+"�� 2�� 3�� ������� �ƴϴ�"; 
		System.out.println(result);
	}
}













