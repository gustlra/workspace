package abstract_1;

import java.util.Scanner;

public class Assert {
	private int x, y;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("x�� �Է� : ");
		x = sc.nextInt();
		System.out.print("y�� �Է� : ");
		y = sc.nextInt();
	}
	
	public void output(){
		assert y>=0 : "y�� 0���� ũ�ų� ���ƾ� �Ѵ�";
		
		int mul=1;
		for(int i=1; i<=y; i++){
			mul *= x;
		}
		System.out.println(x+"�� "+y+"�� "+ mul);
	}

	public static void main(String[] args) {
		Assert as = new Assert();
		as.input();
		as.output();
	}
}











