package for_while_dowhile;

public class Practice7 {

	public static void main(String[] args) {
		int dan,i,j;
		for(int w=2; w<=8; w+=3) {//w=1,w=2,w=3 ¶Ç´Â w=2,w=5,w=8
			for(i=1; i<=9; i++) {
				for(dan=w; dan<=w+2; dan++) {
					if(dan!=10) System.out.print(dan+"*"+i+"="+dan*i+"\t");
				}
				System.out.println();
			}//for dan
			System.out.println();
		}//for w

	}

}
