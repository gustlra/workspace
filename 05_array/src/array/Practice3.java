package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practice3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] lotto = new int[6];
		int money;
		
		System.out.print("돈 입력 : ");
		money = Integer.parseInt(br.readLine());
		
		Practice3 p = new Practice3();
		
		for(int i=1; i<=money/1000; i++) {
			p.input(lotto);
			//Arrays.sort(lotto);//오름차순
			p.sort(lotto);
			p.output(lotto);
			if(i%5==0) System.out.println();
		}
		
	}

	private void sort(int[] lotto) {
		//Selection Sort
		int temp;
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] < lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
	}

	private void input(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			//중복체크
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) { i--; break;}
			}
		}//for i
		
	}
	
	public void output(int[] lotto) {
		for(int n : lotto) System.out.print(String.format("%5d", n));
		System.out.println();
	}
}










