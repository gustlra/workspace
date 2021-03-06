package interface_1;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class WindowTest extends JFrame implements MouseListener, MouseMotionListener {
	private int x, y;
	
	public WindowTest() {
		setTitle("내가 만든 윈도우");
		setBounds(900,200,300,400);
		setVisible(true);
		
		//이벤트
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
	}

	public static void main(String[] args) {
		new WindowTest();

	}
	
	public void paint(Graphics g) {
		g.drawString("X:"+x+"\t Y:"+y, x, y);
	}

	//MouseListener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
		x = e.getX();
		y = e.getY();
		System.out.println("X:"+e.getX()+"\t Y:"+e.getY());
		
		repaint();//update()-paint()순으로 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 IN");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 OUT");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//MouseMotionListener Override - Event Handler
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("마우스 드래그");		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
