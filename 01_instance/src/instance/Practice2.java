package instance;

/*
 [����2] �ﰢ�����̸� ����Ͻÿ� (base, height, area)
      �ﰢ������ = (�غ� * ����)/2
 */
public class Practice2 {

	public static void main(String[] args) {
		int base = 5;
		int height = 7;
		double area = (double)base*height/2;
		
		System.out.println("****�ﰢ���� ���� ���ϱ� ****");
		System.out.println("�غ� : "+base);
		System.out.println("���� : "+height);
		System.out.println("���� : "+String.format("%.2f", area));

	}
}
