package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	Scanner scan = new Scanner(System.in);
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("   1. �Է�");
			System.out.println("   2. ���");
			System.out.println("   3. �˻�");
			System.out.println("   4. ����");
			System.out.println("   5. ����");
			System.out.println("   6. ��");
			System.out.println("**************");
			System.out.print("��ȣ : ");
			num = scan.nextInt();
			if (num == 6) break;
			
			if(num==1) insertArticle();
			else if(num==2) printArticle();
			else if(num==3) searchArticle();
			else if(num==4) deleteArticle();
			else if(num==5) sortArticle();
			else {
				System.out.println("1~6�߿� �����ϼ���");
			}
		}//while		
	}

	public void sortArticle() {
		int num;
		while(true) {
			System.out.println();
			System.out.println("1. �̸����� ��������");
			System.out.println("2. �������� ��������");
			System.out.println("3. �����޴�");
			System.out.print("   ��ȣ �Է� : ");
			num = scan.nextInt();
			if(num==3) break;
			if(num==1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>(){
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
				};
				
				Collections.sort(list, com);
				printArticle();
				
			}else if(num==2) {
				Collections.sort(list);
				printArticle();
			}
		}//while
	}

	public void deleteArticle() {
		System.out.print("���� �� �̸� �Է� : ");
		String name = scan.next();
		int count=0;
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()){
			SungJukDTO dto = it.next();
			
			if(dto.getName().equals(name)) {
				it.remove(); // it.next()�� ��ȯ�� ���� �����
				count++;
			}
		}//for 
		
		if(count==0) System.out.println("ã�� ȸ���� �����ϴ�.");
		else System.out.println(count+"�� ���� �Ϸ�!!");
	}

	public void searchArticle() {
		System.out.print("ã���� �̸� �Է� : ");
		String name = scan.next();
		int count=0;
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				System.out.println(dto);
				count++;
			}
		}//if
		
		if(count==0) System.out.println("ã�� ȸ���� �����ϴ�.");
	}

	public  void printArticle() {
		System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���");
		for(SungJukDTO dto : list) {
			System.out.println(dto);
		}//for		
	}

	public void insertArticle() {
		SungJukDTO dto = new SungJukDTO();
		
		System.out.print("��ȣ �Է� : ");
		dto.setKey(scan.nextInt());
		System.out.print("�̸� �Է� : ");
		dto.setName(scan.next());
		System.out.print("���� �Է� : ");
		dto.setKor(scan.nextInt());
		System.out.print("���� �Է� : ");
		dto.setEng(scan.nextInt());		
		System.out.print("���� �Է� : ");
		dto.setMath(scan.nextInt());
		
		dto.calc();
		
		list.add(dto);
		System.out.println("�Է� �Ϸ�!!");
	}
}













