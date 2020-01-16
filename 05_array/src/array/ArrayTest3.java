package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		ArrayTest3 at = new ArrayTest3();
		
		System.out.print("�迭 ũ�� : ");
		int size = Integer.parseInt(at.br.readLine());
		
		int[] ar = new int[size];
		int sum = at.input(ar);//ȣ��
		int max = at.big(ar);
		int min = at.small(ar);
		at.output(ar,sum,max,min);
	}//main
	
	private void output(int[] ar, int sum, int max, int min) {
		for(int data : ar){
			System.out.print(data+"  ");
		}
		System.out.println();
		System.out.println("��=" + sum);
		System.out.println("�ִ밪="+max);
		System.out.println("�ּҰ�="+min);		
	}
	
	private int small(int[] ar) {
		int min = ar[0];
		for(int i=1; i<ar.length; i++){
			if(ar[i] < min) min = ar[i];
		}
		return min;
	}
	
	private int big(int[] ar) {
		int max = ar[0];
		for(int i=1; i<ar.length; i++){
			if(ar[i] > max) max = ar[i];
		}
		return max;
	}

	public int input(int[] ar) throws IOException {//����
		int sum=0;
		for(int i=0; i<ar.length; i++){
			System.out.print("ar["+i+"] : ");
			ar[i] = Integer.parseInt(br.readLine());
			sum += ar[i];
		}//for
		return sum;
	}

}
/*
�迭�� ũ�⸦ �Է¹޾Ƽ� �迭�� �����ϰ� ������ �Է��� ����Ͻÿ�

[������]
�迭 ũ�� : 3
ar[0] : 25 
ar[1] : 36
ar[2] : -78

25  36  -78
�� = xxx
�ִ밪 = 
�ּҰ� = 
*/












