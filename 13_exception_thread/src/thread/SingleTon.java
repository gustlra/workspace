package thread;

public class SingleTon {
	private int num=3;
	private static SingleTon instance;
	
	public static SingleTon getInstance() {
		if(instance==null) {
			synchronized(SingleTon.class) {
				instance = new SingleTon();//迭 1锅 贸府等促
			}
		}
		
		return instance;
	}

	public static void main(String[] args) {
		SingleTon aa = new SingleTon();
		aa.num++;
		System.out.println("aa = " + aa);//4
		System.out.println("num = " + aa.num);
		System.out.println();

		SingleTon bb = new SingleTon();
		bb.num++;
		System.out.println("bb = " + bb);//4
		System.out.println("num = " + bb.num);
		System.out.println();
		
		System.out.println("*** 教臂沛 ***");
		SingleTon cc = SingleTon.getInstance();
		cc.num++;
		System.out.println("cc = " + cc);//4
		System.out.println("num = " + cc.num);
		System.out.println();

		SingleTon dd = SingleTon.getInstance();
		dd.num++;
		System.out.println("dd = " + dd);//5
		System.out.println("num = " + dd.num);
		System.out.println();
	}

}



