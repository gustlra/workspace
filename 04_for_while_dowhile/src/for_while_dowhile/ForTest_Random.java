package for_while_dowhile;

public class ForTest_Random {

	public static void main(String[] args) {
		int num;
		int count=0;
		
		for(int i=1; i<=100; i++) {
			num = (int)(Math.random()*26+65);//65~90
			System.out.print((char)num+" ");
			
			if(num=='A') count++;
			
			if(i%10==0) System.out.println();
		}//for
		System.out.println();
		System.out.println("A�� ���� = " + count);
	}

}

/*
A~Z(65~90) �������� 100���� ����Ͻÿ�
1�ٴ� 10���� ����Ͻÿ�
�� �߿��� A�� ����� ����Ͻÿ�

[������]
F G Q W T O P ....

A�� ���� = 6
*/
















