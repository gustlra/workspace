package abstract_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame {
	public WindowTest() {
		setBounds(900,200,300,400);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();//생성
		Image img = t.getImage("D:/java_se/workspace/09_abstract/peach.png");//이미지 불러오기
		g.drawImage(img, 20, 100, this);//이미지 그리기
	}

	public static void main(String[] args) {
		new WindowTest();

	}

}











