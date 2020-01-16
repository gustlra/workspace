package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b,answer,count;
		String yn;
		
		while(true) {
			count=0;
			
			for(int i=1; i<=5; i++) {
				a = (int)(Math.random()*90 + 10);//10~99
				b = (int)(Math.random()*90 + 10);//10~99
				
				for(int j=1; j<=2; j++) {//틀리면 1번 더
					System.out.print("["+i+"] "+a+" + "+b+" = ");
					answer = Integer.parseInt(br.readLine());
					
					if(answer==a+b) {
						System.out.println("딩동뎅");
						count++;
						break; //for j를 벗어나라
					}else {
						if(j==2) System.out.println("틀렸다..정답은 "+(a+b));
						else System.out.println("틀렸다");
					}
				}//for j
			}//for i
			System.out.println("당신은 총 " + count + "문제를 맞추어서 " + count*20 + "점 입니다");
			
			System.out.println();
			do {
				System.out.print("continue(Y/N) : ");
				yn = br.readLine();
			}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
			if(yn.equals("N") || yn.equals("n")) break;
			
		}//while
		
		System.out.println("프로그램을 종료합니다");
	}

}
















