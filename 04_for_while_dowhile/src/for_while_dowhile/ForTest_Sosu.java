package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Sosu {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sw;
		
		while(true) {
			sw=0;
			System.out.print("���ڸ� �Է����ּ��� : ");
			int num = Integer.parseInt(br.readLine());
			if(num==0) break;
	
			for (int i=2; i<num; i++) {
				if(num%i==0) sw=1;
			}
			if(sw==0)
				System.out.println(num+"�� �Ҽ��̴�");
			else
				System.out.println(num+"�� �Ҽ��� �ƴϴ�");
			
			System.out.println();
		}//while
		System.out.println("���α׷��� �����մϴ�");
	}

}
/*
�Ҽ� - 1�� ������ �ڱ��ڽ��� ��
�Ҽ��� ���ϱ�
��, 0�� �ԷµǸ� ���α׷� �����մϴ�

[������]
���� �Է� : 12
12�� �Ҽ��� �ƴϴ�

���� �Է� : 37
37�� �Ҽ��̴�

���� �Է� : 0
���α׷��� �����մϴ�
*/






