package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user, count;
		String yn;
		
		do {
			count=0;
			com = (int)(Math.random()*100)+1;//1~100
			System.out.println("com="+com);
			while(true) {
				System.out.print("���� �Է� : ");
				user = Integer.parseInt(br.readLine());
				count++;
				
				if(com==user) break;//while�� �����
				if(com > user)
					System.out.println(user+"���� Ů�ϴ�");
				else
					System.out.println(user+"���� �۽��ϴ�");
				System.out.println();
			}//while    
			
			System.out.println("������ "+count+"������ ���߼̽��ϴ�");
			
			System.out.print("\n �� �ҷ�(Y/N) : ");
			yn = br.readLine();
			if(yn.equals("N") || yn.equals("n")) break;//do~while �����
			
		}while(true);
		System.out.println("���α׷��� �����մϴ�");
	}

}
/*
���ڸ��߱� ����
1~100������ ������ �߻��Ͽ� ���ߴ� ����

[������]
���� �Է� : 50
50���� Ů�ϴ�

���� �Է� : 90
90���� �۽��ϴ�

...

���� �Է� : 87
������ xx������ ���߼̽��ϴ�

�� �ҷ�(Y/N) : n
���α׷��� �����մϴ�
*/














