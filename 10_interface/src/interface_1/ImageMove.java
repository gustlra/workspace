package interface_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
//Frame - BorderLayout
public class ImageMove extends Frame implements ActionListener, WindowListener {
	public static final int FRAME_WIDTH=500, FRAME_HEIGHT=500;
	private Button resetB, leftB, upB, downB, rightB;
	private int x=100, y=100;
	
	public void init() {
		resetB = new Button("초기화");
		leftB = new Button("왼쪽");
		upB = new Button("위");
		downB = new Button("아래");
		rightB = new Button("오른쪽");
		
		Panel p = new Panel();//FlowLayout(순서배치-중앙)
		p.setLayout(new GridLayout(1,5,3,0));
		p.add(resetB);
		p.add(leftB);
		p.add(upB);
		p.add(downB);
		p.add(rightB);
		
		this.add("North", p);
		
		setTitle("이미지 이동");
    	setBounds(700,100,FRAME_WIDTH,FRAME_HEIGHT);
    	setVisible(true);
    	
    	//이벤트
    	this.addWindowListener(this);
    	
    	resetB.addActionListener(this);
    	leftB.addActionListener(this);
    	upB.addActionListener(this);
    	downB.addActionListener(this);
    	rightB.addActionListener(this);
	}

	public static void main(String[] args) {
		new ImageMove().init();
	}
	
	@Override
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("peach.png");
		g.drawImage(img, x, y, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==resetB) {x=y=100;}
		else if(e.getSource()==leftB) {
			x-=10;
			if(x<-150) x=460;
		}
		else if(e.getSource()==upB) {
			y-=10;
			if(y<-90) y=460;
		}
		else if(e.getSource()==downB) {
			y+=10;
			if(y>460) y=-90;
		}
		else if(e.getSource()==rightB) {
			x+=10;
			if(x>460) x=-150;
		}
		
		System.out.println("X:"+x+"\t Y:"+y);
		repaint();
	}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}

}
*/

public class ImageMove extends Frame implements ActionListener {
	/**
	 * <font style="color: red;">왼쪽, 오른쪽, 위, 아래로 이동시키는 버튼이다</font>
	 */
	public Button initButton, leftButton, upButton, downButton, rightButton = null;
	public final int FRAME_WIDTH = 500, FRAME_HEIGHT = 500;
	/**
	 * 이미지의 시작 위치
	 */
	public int imageX = 200, imageY = 200;
	
	/**
	 * <font style="color: blue;">메인화면을 꾸며주는 메소드</font>
	 */
    public void init() {
    	setTitle("이미지 이동");
    	setBounds(700,400,FRAME_WIDTH,FRAME_HEIGHT);
    	setVisible(true);
    	
    	initButton = new Button("초기화");
    	leftButton = new Button("왼쪽");
    	upButton = new Button("위");
    	downButton = new Button("아래");
    	rightButton = new Button("오른쪽");
    	
    	Panel p = new Panel();
    	p.add(initButton);
    	p.add(leftButton);
    	p.add(upButton);
    	p.add(downButton);
    	p.add(rightButton);
    	
    	this.add("North", p);
    	
    	this.addWindowListener(new WindowExit());
    	
    	initButton.addActionListener(this);
    	leftButton.addActionListener(this);
    	upButton.addActionListener(this);
    	downButton.addActionListener(this);
    	rightButton.addActionListener(this);
    }  // init()
	
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();// 이미지 불러오기
		Image img = t.getImage("lion.jpg");
		
		g.drawImage(img, imageX, imageY, this);
		if(imageX>400) {
			g.drawImage(img, imageX - 500, imageY, this);
		}
		if(imageX<0) {
			g.drawImage(img, 500 + imageX, imageY, this);
		}
		if(imageY>400) {
			g.drawImage(img, imageX, imageY - 440, this);
		}
		if(imageY<60) {
			g.drawImage(img, imageX, 440 + imageY, this);
		}
	} // paint()
	
	public static void main(String[] args) {
		new ImageMove().init();
	} // main()
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == initButton) {
			System.out.println("초기화");
			imageX = 200;
			imageY = 200;
			repaint();
		}else if(e.getSource() == leftButton) {
			imageX -= 10;
			if(imageX == -100) imageX = 400;
			repaint();
		}else if(e.getSource() == upButton) {
			imageY -=10;
			if(imageY == -40) imageY = 400;
			repaint();
		}else if(e.getSource() == downButton) {
			imageY +=10;
			if(imageY == 500) imageY = 60;
			repaint();
		}else if(e.getSource() == rightButton) {
			imageX += 10;
			if(imageX == 500) imageX = 0;
			repaint();
		}
	}  // actionPerformed()
}
