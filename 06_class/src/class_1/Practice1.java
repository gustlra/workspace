package class_1;

class BookShop {
	private String bookName;
	private String author;
	private int price;
	
	public void setBookName(String bookName) {
		System.out.println("this = "+this);
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
}
//-------------
public class Practice1 {

	public static void main(String[] args) {
		BookShop aa = new BookShop();
		System.out.println("��ü aa = "+aa);
		aa.setBookName("�ڹٿϼ�");
		aa.setAuthor("��ϼ�");
		aa.setPrice(25000);
		System.out.println("å�̸� : " + aa.getBookName());
		System.out.println("��  �� : " + aa.getAuthor());
		System.out.println("��  �� : " + aa.getPrice() + "��");
		System.out.println();
		
		BookShop bb = new BookShop();
		System.out.println("��ü bb = "+bb);
		bb.setBookName("JSP���");
		bb.setAuthor("��JP");
		bb.setPrice(35000);
		System.out.println("å�̸� : " + bb.getBookName());
		System.out.println("��  �� : " + bb.getAuthor());
		System.out.println("��  �� : " + bb.getPrice() + "��");
		System.out.println();
	}

}



















