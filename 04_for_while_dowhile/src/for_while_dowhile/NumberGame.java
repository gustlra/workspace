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
				System.out.print("숫자 입력 : ");
				user = Integer.parseInt(br.readLine());
				count++;
				
				if(com==user) break;//while를 벗어나라
				if(com > user)
					System.out.println(user+"보다 큽니다");
				else
					System.out.println(user+"보다 작습니다");
				System.out.println();
			}//while    
			
			System.out.println("딩동뎅 "+count+"번만에 맞추셨습니다");
			
			System.out.print("\n 또 할래(Y/N) : ");
			yn = br.readLine();
			if(yn.equals("N") || yn.equals("n")) break;//do~while 벗어나라
			
		}while(true);
		System.out.println("프로그램을 종료합니다");
	}

}
/*
숫자맞추기 게임
1~100사이의 난수를 발생하여 맞추는 게임

[실행결과]
숫자 입력 : 50
50보다 큽니다

숫자 입력 : 90
90보다 작습니다

...

숫자 입력 : 87
딩동뎅 xx번만에 맞추셨습니다

또 할래(Y/N) : n
프로그램을 종료합니다
*/














