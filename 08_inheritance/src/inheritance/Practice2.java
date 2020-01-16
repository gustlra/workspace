package inheritance;

public class Practice2 {
	public static void main(String[] args) {
		SalaryManager s = new SalaryManager();
		System.out.println("객체 s = "+s);//클래스@16진수
		System.out.println("객체 s = "+s.toString());
		s.menu();
		System.out.println("프로그램을 종료합니다");
	}
}
