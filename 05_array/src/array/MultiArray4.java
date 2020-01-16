package array;

public class MultiArray4 {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿", "�ڳ�", "��ġ"};
		int[][] jumsu = {{90,95,100,0},{100,89,75,0},{75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		//���
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j];//����		
			}//for j
			
			avg[i] = (double)jumsu[i][3]/3;
			if(avg[i]>=90) grade[i]='A';
			else if(avg[i]>=80) grade[i]='B';
			else if(avg[i]>=70) grade[i]='C';
			else if(avg[i]>=60) grade[i]='D';
			else grade[i]='F';
		}
		
		//���
		System.out.println("----------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("----------------------------------------------------");
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");//����, ����, ����, ����
			}//for j
			System.out.println(String.format("%.2f", avg[i])+"\t"+grade[i]);
		}//for i
		System.out.println("----------------------------------------------------");
	}

}

/*
----------------------------------------------------
�̸�		����		����		����		����		���		����
----------------------------------------------------
ȫ�浿	90		95		100
�ڳ�		100		89		75
��ġ		75		80		48
----------------------------------------------------
*/















