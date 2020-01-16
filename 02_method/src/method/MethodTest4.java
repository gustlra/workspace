package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
이름(name), 주민번호(id)를 입력하여 성별을 출력하시오  
성별(gender)을 구별하는 comp()와 나이(age)를 계산하는 calcAge() 작성하시오

이름 입력 : 홍길동
주민번호 입력 : 021023-345678

2019 - 2000 + 1

홍길동님은 남자이고 20살 입니다

      012345
aa = "orange";
aa.charAt(0);  0번째 위치 'o'
aa.charAt(1);  1번째 위치 'r'
aa.charAt(5);  2번째 위치 'a'

aa = "orange";
aa.substring(0,2); 0번부터 2번 이전까지  "or"
*/

public class MethodTest4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("주민번호 입력 : ");
		String id = br.readLine(); //910716-1~~~
		
		MethodTest4 mt = new MethodTest4();
		
		String gender = mt.comp(id);//호출
		int age = mt.calcAge(id);//호출
		
		System.out.println(name+"님은 "+gender+"이고 "+age+"살 입니다.");
	}
		
	private int calcAge(String id) {
		int year = Integer.parseInt(id.substring(0,2));//91
		char g = id.charAt(7);
		year += (g=='1' || g=='2' ? 1900 : 2000); 
		int age = 2019 - year + 1;
		
		return age;
	}

	public String comp(String id) {
		return id.charAt(7)=='1' || id.charAt(7)=='3' ? "남자" : "여자" ;
	}

}


















