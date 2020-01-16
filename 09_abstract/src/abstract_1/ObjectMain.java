package abstract_1;

/*
 * class Object {
 * 		public boolean equals(Object ob){} //������ ��
 * 		public String toString(){}  //Ŭ����@16����
 * 		public int hashCode(){} //10����
 * }
 * 
 * class String extends Object {
 * 		public boolean equals(Object ob){} //���ڿ� ��
 * 		public String toString(){} //���ڿ�(���Ѵ�)
 * 		public int hashCode(){} // int 21��, �Ұ���
 * }
 * 
 */
class Test extends Object {
	@Override
	public String toString(){
		return getClass()+"@���ٺ�";
	}
}
//----------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��ü t = "+t);
		System.out.println("��ü t = "+t.toString());
		System.out.println("��ü t = "+t.hashCode());//10����
		System.out.println();
		
		String str = "apple";
		System.out.println("��ü str = "+str);
		System.out.println("��ü str = "+str.toString());
		System.out.println("��ü str = "+str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));//������ - false
		System.out.println("aa.equals(bb) : "+aa.equals(bb));//���ڿ� - true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+(cc==dd));//������ - false
		System.out.println("cc.equals(dd) : "+cc.equals(dd));//������ - false
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff));//������ - false 
		System.out.println("ee.equals(ff) : "+ee.equals(ff));//���ڿ� - true
		System.out.println();

	}

}
















