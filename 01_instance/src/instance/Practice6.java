package instance;

/*
ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오

[실행결과]
T → t (ch에 T에 있을 때)
또는
e → E (ch에 e가 있을 때)
 
*/

public class Practice6 {

	public static void main(String[] args) {
		//char ch = 'E';//대문자
		char ch = 'u';//소문자
		int verify_ch = ch>='A' && ch<='Z' ? ch+32 : ch-32;
		
		System.out.println(ch+" → "+(char)verify_ch);
				
	}
}









