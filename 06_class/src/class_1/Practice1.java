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
		System.out.println("객체 aa = "+aa);
		aa.setBookName("자바완성");
		aa.setAuthor("김완성");
		aa.setPrice(25000);
		System.out.println("책이름 : " + aa.getBookName());
		System.out.println("저  자 : " + aa.getAuthor());
		System.out.println("가  격 : " + aa.getPrice() + "원");
		System.out.println();
		
		BookShop bb = new BookShop();
		System.out.println("객체 bb = "+bb);
		bb.setBookName("JSP잡기");
		bb.setAuthor("송JP");
		bb.setPrice(35000);
		System.out.println("책이름 : " + bb.getBookName());
		System.out.println("저  자 : " + bb.getAuthor());
		System.out.println("가  격 : " + bb.getPrice() + "원");
		System.out.println();
	}

}




















