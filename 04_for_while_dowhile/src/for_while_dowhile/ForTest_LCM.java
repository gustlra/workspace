package for_while_dowhile;

public class ForTest_LCM {

	public static void main(String[] args) {
		int num, sum=0, count=0;
		
		for(int i=1; i<=100; i++) {
			num = (int)((Math.random()*500)+1);//1~500
			if(num%2==0 && num%3==0) { 
				System.out.print(String.format("%5d",num)); 
				count++;
				if(count%7==0) System.out.println();
				sum += num;
			}
		}//for
		System.out.println();
		System.out.println("2�� 3�� ����� ���� = "+count);
		System.out.println("2�� 3�� ����� �� = "+sum);
		
	}

}
/*
1~500������ ������ 100�� �߻��Ͽ� 2�� 3�� ������� ����ϰ� �հ� ������ ����Ͻÿ�
�� 1�ٿ� 7���� ����Ͻÿ�

[������]
36  12  ...

2�� 3�� ����� ���� = 
2�� 3�� ����� �� =
*/













