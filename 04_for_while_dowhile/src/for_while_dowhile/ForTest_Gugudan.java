package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Gugudan {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dan, i;
		System.out.print("원하는 단을 입력 : ");
		dan = Integer.parseInt(br.readLine());
		
		for(i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}

	}

}
/*
원하는 단을 입력 : 2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
*/










