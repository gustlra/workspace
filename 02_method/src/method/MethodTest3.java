package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("국어 입력 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 입력 : ");
		int math = Integer.parseInt(br.readLine());
		
		MethodTest3 mt = new MethodTest3();
		int tot = mt.calcTot(kor,eng,math);
		double avg = mt.calcAvg(tot);
		
		System.out.println("\t *** "+name+" 성적표 ***");
		System.out.println("국어 \t 영어 \t 총점 \t 평균");
		System.out.println(kor+"\t"+eng+"\t"+tot+"\t"+String.format("%.2f", avg));

	}//main
	
	public int calcTot(int kor,int eng,int math){
		return kor+eng+math;
	}//calcTot
	
	public double calcAvg(int tot){
		return tot/3.0;
	}
}



































		
		
		
		
		
		
		
		
		
		
		
		
		
