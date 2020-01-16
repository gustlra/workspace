package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8 p = new Practice8();
		int num;
		int balance=0;//�ܾ�
		
		while(true) {
			System.out.println();
			System.out.println("***********");
			System.out.println(" 1. ����");
			System.out.println(" 2. ���");
			System.out.println(" 3. �ܰ�");
			System.out.println(" 4. ����");
			System.out.println("***********");
			System.out.print("��ȣ ���� : ");
			num = Integer.parseInt(br.readLine());
			if(num==4) break;
			if(num==1) balance = p.input(balance);
			else if(num==2) balance = p.output(balance);
			else if(num==3)
				System.out.println("�����  �ܾ��� " + balance + "�� �Դϴ�.");;
		}//while
		System.out.println("���α׷��� �����մϴ�");
	}

	private int output(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.print("��ݾ� : ");
		deposit = Integer.parseInt(br.readLine());
		
		if(balance >= deposit) {
			balance -= deposit;
			System.out.println("����� �ܾ��� " + balance + "�� �Դϴ�.");
		}else
			System.out.println("�ܾ��� �����մϴ�");
		
		return balance;
	}

	private int input(int balance) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int deposit;
		
		System.out.print("���ݾ� : ");
		deposit = Integer.parseInt(br.readLine());
		
		if(deposit%10000==0) {
			balance += deposit;
			System.out.println("����� �ܾ��� " + balance + "�� �Դϴ�.");
		}else
			System.out.println("���� ������ �Է��ϼ���");
		
		return balance;
	}

}





















