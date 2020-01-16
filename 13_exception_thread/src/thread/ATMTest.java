package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMTest implements Runnable {
	private long depositeMoney=100000;//잔액
	private long balance;//찾고자 하는 금액

	public static void main(String[] args) {
		ATMTest atm = new ATMTest();
		System.out.println("atm = "+atm);
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		//mom.setName("엄마");
		
		mom.start();
		son.start();

	}

	@Override
	//public synchronized void run() { - 동기화 O
	public void run() {
		synchronized(this) { //- 동기화 O
		//synchronized(ATMTest.class) { //- 동기화 O
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(Thread.currentThread().getName()+"님 안녕하세요");
			
			try {
				System.out.print("찾고자 하는 금액 입력 : ");
				balance = Long.parseLong(br.readLine());
				
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			withDraw();//잔액 계산
		}
	}
	
	public void withDraw() {
		if(depositeMoney>=balance) {
			if(balance%10000==0) {
				depositeMoney-=balance;
				System.out.println("잔액은 "+depositeMoney+"원 입니다");
			}else
				System.out.println("만원 단위로 입력하세요");
				
		}else
			System.out.println("잔액이 부족");
		System.out.println();
	}

}






















