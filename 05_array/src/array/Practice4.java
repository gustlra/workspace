package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
		String inputStr;
		int strike, ball;
		
		do {
			System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
			yn = br.readLine();
		}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
		
		if(yn.equals("Y") || yn.equals("y")) {
			System.out.println();
			System.out.println("������ �����մϴ�.");
			
			//�����߻�
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9)+1;
				
				//�ߺ�
				for(int j=0; j<i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			//System.out.println(com[0]+","+com[1]+","+com[2]);
			
			//�Է�
			while(true) {
				System.out.println();
				System.out.print("���� �Է� : ");
				inputStr = br.readLine();
				
				for(int i=0; i<user.length; i++) {
					user[i] = inputStr.charAt(i)-48;
				}
				
				//��
				strike = ball = 0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if(com[i] == user[j]) {
							if(i == j) strike++;
							else ball++;
						}
					}
				}//for i
				System.out.println(strike+"��Ʈ����ũ   "+ball+ "��");
				
				if(strike==3) break;
			}//while
			
		}
		
		System.out.println("���α׷��� �����մϴ�");
			
	}

}


















