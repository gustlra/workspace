package inheritance;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο��� �Է� : ");
		int size = sc.nextInt();
		
		Exam[] exam = new Exam[size]; //��ü �迭
		for(int i=0; i<size; i++) {
			exam[i] = new Exam();
			exam[i].compare();
		}
		
		System.out.println("�̸�\t1 2 3 4 5\t����");
		for(Exam data : exam) {
			System.out.print(data.getName()+"\t");
			
			for(int j=0; j<data.getOx().length; j++) {
				System.out.print(data.getOx()[j]+" ");
			}
			System.out.println("\t"+data.getScore());
		}//for i

	}

}





























