package method;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice3 {
	// �ʸ� �Է¹޾Ƽ� time()���� ��,��,�ʸ� ���Ͽ� ����Ѵ�.

	public void time(int second) {
		int hour = second / 3600; //1�ð� = 3600��
		int minute = second % 3600 / 60; //1�� = 60��
		int sec = second % 3600 % 60;
		System.out.println(hour+"�ð� "+minute+"�� "+sec+"�� �Դϴ�.");	
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Practice3 p3 = new Practice3();
		System.out.print("�ʸ� �Է��Ͻÿ�. : ");
		int second = Integer.parseInt(br.readLine());
		p3.time(second);
		System.out.println("���α׷� �����մϴ�");
	}
}












