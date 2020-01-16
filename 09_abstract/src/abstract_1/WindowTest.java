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
		Toolkit t = Toolkit.getDefaultToolkit();//����
		Image img = t.getImage("D:/java_se/workspace/09_abstract/peach.png");//�̹��� �ҷ�����
		g.drawImage(img, 20, 100, this);//�̹��� �׸���
	}

	public static void main(String[] args) {
		new WindowTest();

	}

}











