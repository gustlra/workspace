package class_2;

public class FruitMain {

	public static void main(String[] args) {
		Fruit[] ar = {new Fruit("���", 100,80,75), 
					  new Fruit("����", 30,25,10), 
					  new Fruit("����", 25,30,90)};
		
		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");
		for(Fruit f : ar) {
			f.calc();
			f.disp();
		}
		System.out.println("-----------------------------------");
		Fruit.output();

	}

}
