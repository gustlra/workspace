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

			System.out.print("가위(1), 바위(2), 보(3) 중 번호를 입력하세요 : ");
			user = Integer.parseInt(br.readLine());
			
			com = (int) (Math.random() * 3) + 1;//1~3

			if(user == 1) {//가위
				if(com==1){//가위
					System.out.println("컴퓨터 : 가위\t 나 : 가위");
					System.out.println("You Draw!!");
				}else if (com == 2) { //바위
					System.out.println("컴퓨터 : 바위\t 나 : 가위");
					System.out.println("You Lose!!");
				} else if (com == 3) {//보
					System.out.println("컴퓨터 : 보자기\t 나 : 가위");
					System.out.println("You Win!!");
				}
				
			} else if(user == 2) {//바위
				if (com == 1) {
					System.out.println("컴퓨터 : 가위\t 나 : 바위");
					System.out.println("You Win!!");
				} else if (com == 2) {
					System.out.println("컴퓨터 : 바위\t 나 : 바위");
					System.out.println("You Draw!!");
				} else {
					System.out.println("컴퓨터 : 보자기\t 나 : 바위");
					System.out.println("You Lose!!");
				}
				
			}else if(user == 3) {//보
				if (com == 1) {
					System.out.println("컴퓨터 : 가위\t 나 : 보자기");
					System.out.println("You Lose!!");
				} else if (com == 2) {
					System.out.println("컴퓨터 : 바위\t 나 : 보자기");
					System.out.println("You Win!!");
				} else {
					System.out.println("컴퓨터 : 보자기\t 나 : 보자기");
					System.out.println("You Draw!!");
				}
			} else {
				System.out.println("잘못된 값입니다.");
			}
			System.out.println();
			System.out.print("또 할래?(Y/N) : ");
			again = br.readLine();
			if (again.equals("N") || again.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}

//가위바위보
/*
[실행결과]
 가위(1), 바위(2), 보(3) 중 번호 입력 : 3(user)
컴퓨터 : 바위 	나 : 보자기
 You Win!!
 
가위(1), 바위(2), 보(3) 중 번호 입력 : 3(user) 
컴퓨터 : 가위 	나 : 보자기 
You Lose!! 

가위(1), 바위(2), 보(3)중 번호 입력 : 3(user)
컴퓨터 : 가위 	나 : 가위 
You Draw!!
 */














