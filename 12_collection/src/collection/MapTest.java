package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("book101", "�鼳����");
		map.put("book201", "�ξ����");
		map.put("book102", "�鼳����");//Value �ߺ����
		map.put("book301", "�ǿ���");
		map.put("book101", "��������");//key �ߺ����
		
		//System.out.println(map.get("book101"));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڵ� �Է� : ");
		String key = scan.next();
		
//		if(map.get(key)==null)
//			System.out.println("���� Key �Դϴ�");
//		else
//			System.out.println(map.get(key));
		
		if(map.containsKey(key))
			System.out.println(map.get(key));
		else
			System.out.println("���� Key �Դϴ�");
	}

}











