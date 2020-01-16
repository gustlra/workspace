package collection;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO>{
	private int key;
	private String name;
	private int kor;	
	private int eng;	
	private int math;	
	private int tot;
	private double avg;
	
	public void calc() {
		tot = kor+eng+math;
		avg = (double)tot/3;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return key+"\t"
			 + name+"\t"
			 + kor+"\t"
			 + eng+"\t"
			 + math+"\t"
			 + tot+"\t"
			 + new DecimalFormat("#.##").format(avg);
	}

	@Override
	public int compareTo(SungJukDTO dto) {
//		if(tot < dto.tot) return 1;
//		else if(tot == dto.tot) return 0;
//		else if(tot > dto.tot) return -1;
		
		return tot > dto.tot ? -1 : 1;
	}
}















