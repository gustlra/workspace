package constructor;

import java.util.Scanner;

public class MemberMain {
	Scanner sc = new Scanner(System.in);
	MemberDTO ar[] = new MemberDTO[5];

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.menu();
		System.out.println("프로그램을 종료합니다");
	}
	
	public void menu() {
		int num=0;
		
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("  1. 가입");
			System.out.println("  2. 출력");
			System.out.println("  3. 수정");
			System.out.println("  4. 탈퇴");
			System.out.println("  5. 끝내기");
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = sc.nextInt();
			if(num==5) break;
			
			if(num==1) this.insert();
			else if(num==2) list();
			else if(num==3) update();
			else if(num==4) delete();
			
		}//while		
	}

	public void insert() {
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) break;
		}
		
		if(i==ar.length) {
			System.out.println("5명 정원이 꽉 찼습니다"); 
			return; //메소드를 벗어나라
		}
		
		//가입
		System.out.print("이름 입력 : ");
		String name=sc.next();
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
		System.out.print("핸드폰 입력 : ");
		String phone=sc.next();
//				 if(!phone.matches("^(01[016789])-(\\d{3,4})-(\\d{4})$")) {
//					 System.out.println("ex)010-1234-5678");
//				 }
		System.out.print("주소 입력 : ");
		String address=sc.next();
		
		ar[i] = new MemberDTO(name,age,phone,address);
		System.out.println("1 row(s) created");
		
		int cnt=0;
		for(i=0; i<ar.length; i++) {
			if(ar[i]==null) cnt++;
		}
		System.out.println(cnt+"자리 남았습니다");
	}
	
	public void list() {
		System.out.println("name\tAge\tPhone\tAddress");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null)
				System.out.println(ar[i].getName()+"\t"
								+ ar[i].getAge()+"\t"
								+ ar[i].getPhone()+"\t"
								+ ar[i].getAddress());
			
		}
	}
	
	public void update() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone = sc.next();
		int i;
		
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null && ar[i].getPhone().equals(phone)) {
				System.out.println(ar[i].getName()+"\t"
						+ ar[i].getAge()+"\t"
						+ ar[i].getPhone()+"\t"
						+ ar[i].getAddress());
				//---------
				System.out.print("수정 할 이름 입력 : ");
				ar[i].setName(sc.next());
				System.out.print("수정 할 핸드폰 입력 : ");
				ar[i].setPhone(sc.next());
				System.out.print("수정 할 주소 입력 : ");
				ar[i].setAddress(sc.next());
				
				System.out.println("1 row(s) updated");
				break;
			}//if
		}//for
		
		if(i==5)
			System.out.println("찾는 회원이 없습니다");
	}
	
	public void delete() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone = sc.next();
		int i;
		
		for(i=0; i<ar.length; i++) {
			if(ar[i]!=null && ar[i].getPhone().equals(phone)) {
				ar[i] = null;
				System.out.println("1 row(s) deleted");
				break;
			}//if
		}//for
		if(i==5)
			System.out.println("찾는 회원이 없습니다");
	}

}


























