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
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 검색");
			System.out.println("   4. 삭제");
			System.out.println("   5. 정렬");
			System.out.println("   6. 끝");
			System.out.println("**************");
			System.out.print("번호 : ");
			num = scan.nextInt();
			if (num == 6) break;
			
			if(num==1) insertArticle();
			else if(num==2) printArticle();
			else if(num==3) searchArticle();
			else if(num==4) deleteArticle();
			else if(num==5) sortArticle();
			else {
				System.out.println("1~6중에 선택하세요");
			}
		}//while		
	}

	public void sortArticle() {
		int num;
		while(true) {
			System.out.println();
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전메뉴");
			System.out.print("   번호 입력 : ");
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
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();
		int count=0;
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()){
			SungJukDTO dto = it.next();
			
			if(dto.getName().equals(name)) {
				it.remove(); // it.next()가 반환한 값을 지운다
				count++;
			}
		}//for 
		
		if(count==0) System.out.println("찾는 회원이 없습니다.");
		else System.out.println(count+"개 삭제 완료!!");
	}

	public void searchArticle() {
		System.out.print("찾고자 이름 입력 : ");
		String name = scan.next();
		int count=0;
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				System.out.println(dto);
				count++;
			}
		}//if
		
		if(count==0) System.out.println("찾는 회원이 없습니다.");
	}

	public  void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO dto : list) {
			System.out.println(dto);
		}//for		
	}

	public void insertArticle() {
		SungJukDTO dto = new SungJukDTO();
		
		System.out.print("번호 입력 : ");
		dto.setKey(scan.nextInt());
		System.out.print("이름 입력 : ");
		dto.setName(scan.next());
		System.out.print("국어 입력 : ");
		dto.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		dto.setEng(scan.nextInt());		
		System.out.print("수학 입력 : ");
		dto.setMath(scan.nextInt());
		
		dto.calc();
		
		list.add(dto);
		System.out.println("입력 완료!!");
	}
}













