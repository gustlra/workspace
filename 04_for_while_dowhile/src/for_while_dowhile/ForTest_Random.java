package for_while_dowhile;

public class ForTest_Random {

	public static void main(String[] args) {
		int num;
		int count=0;
		
		for(int i=1; i<=100; i++) {
			num = (int)(Math.random()*26+65);//65~90
			System.out.print((char)num+" ");
			
			if(num=='A') count++;
			
			if(i%10==0) System.out.println();
		}//for
		System.out.println();
		System.out.println("A의 개수 = " + count);
	}

}

/*
A~Z(65~90) 무작위로 100개를 출력하시오
1줄당 10개씩 출력하시오
이 중에서 A가 몇개인지 출력하시오

[실행결과]
F G Q W T O P ....

A의 개수 = 6
*/
















