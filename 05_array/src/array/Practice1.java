package array;

public class Practice1 {

	public static void main(String[] args) {
		int[] arr = new int[50];
		int[] count = new int[26];
		
		/*
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*26+65);//65~90
			System.out.print((char)arr[i]+"  ");
			if((i+1)%10==0) System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<count.length; j++) {
				if(arr[i]==j+'A') count[j]++;
			}
		}
		
		System.out.println();
		for(int i=0; i<count.length; i++) {
			System.out.println((char)(i+'A')+"\t"+count[i]);
		}
		*/
		//--------------------
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * ('Z' - 'A' + 1) + 'A');//A ~ Z
			System.out.print((char)arr[i] + " ");
			if((i+1) % 10 == 0) System.out.println();
			
			count[arr[i]-'A']++;
		}
				
		System.out.println();
		for(int i = 0; i < count.length; i++) {
			System.out.printf("%c : %d\n", (char)i + 'A', count[i]);
		}
		
	}

}


















