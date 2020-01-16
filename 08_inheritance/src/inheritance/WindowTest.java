package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest {
	public WindowTest() {
		//super("내가만든윈도우");//부모생성자 호출
		
		System.out.println("도형");
		Frame f = new Frame("내가만든윈도우") {
			@Override
			public void paint(Graphics g) {//Call Back 콜백메소드 (일정 시점이되면 JVM에 의해서 호출), repaint()
				g.drawLine(50,150, 200,300);
				g.drawLine(200,150,50,300);
				g.drawRect(100, 120, 150, 150);
				g.drawOval(120, 150, 150, 150);
			}
		};
		f.setForeground(Color.YELLOW);
		//setBackground(Color.CYAN);
		f.setBackground(new Color(157,23,238));
				
		//this.setSize(300,400);
		f.setBounds(700,200,300,400);
		f.setVisible(true);
	}
		
	

	public static void main(String[] args) {
		new WindowTest();

	}

}














