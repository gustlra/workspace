package instance;

/*
이름(name)이 홍길동, 성별(gender)M일 때는 남자라고 출력 M이 아니면 여자라고 출력하시오

[실행결과]
홍길동은 남자이다
또는 
홍길동은 여자이다

 */
public class Practice7 {

	public static void main(String[] args) {
		String name = "홍길동";
		//char gender = 'F';
		char gender = 'M';
		
		String verify_gen = gender == 'M' ? "남자" : "여자";
		
		System.out.println(name+"은 "+verify_gen+"이다.");
	}
}










