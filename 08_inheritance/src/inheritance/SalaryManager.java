package inheritance;

import java.util.Scanner;

public class SalaryManager {
	EmployeeDTO[] emp = new EmployeeDTO[5];
	Scanner scan = new Scanner(System.in);

	public void menu() {
		int choice;

		while (true) {
			System.out.println();
			System.out.println("-------------");
			System.out.println("   1. ���");
			System.out.println("   2. ���");
			System.out.println("   3. ����");
			System.out.println("   4. �˻�");
			System.out.println("   5. ����");
			System.out.println("-------------");
			System.out.print("��ȣ ���� : ");
			choice = scan.nextInt();
			if (choice == 1) {
				// ��� �޼ҵ�
				insert();
			} else if (choice == 2) {
				// ��� �޼ҵ�
				list();
			} else if (choice == 3) {
				// ���� �޼ҵ�
				update();
			} else if (choice == 4) {
				// �˻� �޼ҵ�
				search();
			} else if (choice == 5) {
				break;
			} else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}//while
	}// menu

	public void insert() {
		String name, position;
		int i, basePay, benefit;

		for(i=0; i<emp.length; i++) {
			if (emp[i] == null)
				break;
		}
		if(i==emp.length) return;
		
		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		position = scan.next();
		System.out.print("�⺻�� �Է� : ");
		basePay = scan.nextInt();
		System.out.print("���� �Է� : ");
		benefit = scan.nextInt();

		emp[i] = new EmployeeDTO(name, position, basePay, benefit);
		System.out.println("��� �Ϸ�");
	}

	public void list() {
		System.out.println("======================================================");
		System.out.println("name\tposition\tbasepay\tbenefit\ttaxrate\tsalary");
		System.out.println("======================================================");
		for (int i=0; i<emp.length; i++) {
			if (emp[i] != null) {
				emp[i].calc();
				System.out.println(emp[i]);
			}
		}
		System.out.println("======================================================");
	}

	public void update() {
		String name, position;
		int i, basePay, benefit;

		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("���� �Է� : ");
		position = scan.next();

		for (i = 0; i < emp.length; i++) {
			if (emp[i] != null && emp[i].getName().equals(name) && emp[i].getPosition().equals(position)) {

				System.out.print("���� �� ���� �Է� : ");
				emp[i].setPosition(scan.next());
				System.out.print("���� �� �⺻�� �Է� : ");
				emp[i].setBasePay(scan.nextInt());
				System.out.print("���� �� ���� �Է� : ");
				emp[i].setBenefit(scan.nextInt());

				System.out.println("���� �Ϸ�");
				break;
			}
		}//for
		
		if (i==emp.length) {
			System.out.println("ã�� ������ �����ϴ�.");
		}
	}

	public void search() {
		System.out.print("�̸� �Է� : ");
		String name = scan.next();
		System.out.print("���� �Է� : ");
		String position = scan.next();
		
		int i;
		for (i = 0; i < emp.length; i++) {
			if (emp[i]!=null && emp[i].getName().equals(name) && emp[i].getPosition().equals(position)) {
				System.out.println("======================================================");
				System.out.println("name\tposition\tbasepay\tbenefit\ttaxrate\tsalary");
				System.out.println("======================================================");
				System.out.println(emp[i]);
				break;
			}
		}//for
		
		if (i==emp.length) {
			System.out.println("ã�� ������ �����ϴ�.");
		}
	}
}












