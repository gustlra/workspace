package abstract_1;

import java.text.NumberFormat;
import java.util.Scanner;

public class MoneyMain {

	public static void main(String[] args) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);
		Money m=null;
		int money;

		System.out.print("현금 입력 : ");
		money = scan.nextInt();
		System.out.print("1. 달러 2. 엔화 3. 위안 : ");
		int num = scan.nextInt();

		if(num == 1) m = new USMoney(money);
		else if(num == 2) m = new JapanMoney(money);
		else if(num == 3) m = new ChinaMoney(money);
		m.calcMoney();
		System.out.println(numberFormat.format(money)+" -> "+ m.getMoney());
	}
}








