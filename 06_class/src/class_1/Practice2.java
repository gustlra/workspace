package class_1;

class ShapeTest{
	public static final double PI = 3.141592;//���ȭ
	
	public double area(int a) {
		return PI * a * a;
	}
	public double area(int a, int b) {
		return a*b/2.0;
	}
	public double area(int a, int b, int c) {
		return (a+b)*c/2.0;
	}
}
//-------------
public class Practice2 {

	public static void main(String[] args) {
		//ShapeTest.PI = 100; - error
		System.out.println("PI = "+ ShapeTest.PI);
		
		ShapeTest st = new ShapeTest();
		System.out.println("���� ���� : " + st.area(3));
		System.out.println("�ﰢ���� ���� : " + st.area(5, 7));
		System.out.println("��ٸ����� ���� : " + st.area(2, 3, 5));

	}

}









