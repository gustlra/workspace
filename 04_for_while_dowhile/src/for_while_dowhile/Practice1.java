package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int com, user;
		String again;
		
		for (;;) {

			System.out.print("����(1), ����(2), ��(3) �� ��ȣ�� �Է��ϼ��� : ");
			user = Integer.parseInt(br.readLine());
			
			com = (int) (Math.random() * 3) + 1;//1~3

			if(user == 1) {//����
				if(com==1){//����
					System.out.println("��ǻ�� : ����\t �� : ����");
					System.out.println("You Draw!!");
				}else if (com == 2) { //����
					System.out.println("��ǻ�� : ����\t �� : ����");
					System.out.println("You Lose!!");
				} else if (com == 3) {//��
					System.out.println("��ǻ�� : ���ڱ�\t �� : ����");
					System.out.println("You Win!!");
				}
				
			} else if(user == 2) {//����
				if (com == 1) {
					System.out.println("��ǻ�� : ����\t �� : ����");
					System.out.println("You Win!!");
				} else if (com == 2) {
					System.out.println("��ǻ�� : ����\t �� : ����");
					System.out.println("You Draw!!");
				} else {
					System.out.println("��ǻ�� : ���ڱ�\t �� : ����");
					System.out.println("You Lose!!");
				}
				
			}else if(user == 3) {//��
				if (com == 1) {
					System.out.println("��ǻ�� : ����\t �� : ���ڱ�");
					System.out.println("You Lose!!");
				} else if (com == 2) {
					System.out.println("��ǻ�� : ����\t �� : ���ڱ�");
					System.out.println("You Win!!");
				} else {
					System.out.println("��ǻ�� : ���ڱ�\t �� : ���ڱ�");
					System.out.println("You Draw!!");
				}
			} else {
				System.out.println("�߸��� ���Դϴ�.");
			}
			System.out.println();
			System.out.print("�� �ҷ�?(Y/N) : ");
			again = br.readLine();
			if (again.equals("N") || again.equals("n")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}

//����������
/*
[������]
 ����(1), ����(2), ��(3) �� ��ȣ �Է� : 3(user)
��ǻ�� : ���� 	�� : ���ڱ�
 You Win!!
 
����(1), ����(2), ��(3) �� ��ȣ �Է� : 3(user) 
��ǻ�� : ���� 	�� : ���ڱ� 
You Lose!! 

����(1), ����(2), ��(3)�� ��ȣ �Է� : 3(user)
��ǻ�� : ���� 	�� : ���� 
You Draw!!
 */














