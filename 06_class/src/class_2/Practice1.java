package class_2;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int index=0;//��ġ
		int count=0;//����
		
		System.out.print("���ڿ� �Է� : ");
		String str = scan.next();

		System.out.print("���� ���ڿ� �Է� : ");
		String target = scan.next();

		System.out.print("�ٲ� ���ڿ� �Է� : ");
		String replacing = scan.next();
		
		if(str.length() < target.length()) {
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�");
			return;
		}
		
		str = str.toLowerCase();
		target = target.toLowerCase();
		
		while((index=str.indexOf(target, index)) != -1) {
			index += target.length();
			count++;			
		}//while
		
		System.out.println(str.replace(target, replacing));
		System.out.println(count+"�� ġȯ");
	}

}















