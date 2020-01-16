package abstract_1;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest{
	private int year, month, week, lastDay;
	
	public CalendarTest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵ �Է� : ");
		year = sc.nextInt();
		System.out.print("�� �Է� : ");
		month = sc.nextInt();
	}
	
	public void calculator() {
		//������ ������ �ý��� ��¥ 2020-01-03
		//������ �ٲ۴�
		Calendar cal = Calendar.getInstance();
//		cal.set(cal.YEAR, year);//cal.set(1, year);
//		cal.set(cal.MONTH, month-1);
//		cal.set(cal.DAY_OF_MONTH, 1);
		
		cal.set(year,month-1,1);
		
		week = cal.get(cal.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	public void display() {
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}//for i
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+"\t");
			if(week%7==0) System.out.println();
			week++;
		}
	}
	
}
//--------
public class CalendarMain {
	public static void main(String[] args) {
		CalendarTest calendarTest = new CalendarTest();
		calendarTest.calculator();
		calendarTest.display();
	}
}

/*
Ŭ������ : CalendarTest

�⵵ �Է� : 2002
�� �Է� : 10	

��	��	ȭ	��	��	��	��
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

�⺻������ - �⵵, �� �Է�
calculator()
display()
*/









