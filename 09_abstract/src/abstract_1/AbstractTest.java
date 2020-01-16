package abstract_1;

public abstract class AbstractTest { //POJO (Plain Old Java Object)
	String name;
	
	public abstract void setName(String name);//추상 메소드
	
	public String getName() {//구현
		return name;
	}
}
