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
		setTitle("���� ���� ������");
		setBounds(900,200,300,400);
		setVisible(true);
		
		//�̺�Ʈ
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
		System.out.println("���콺 Ŭ��");
		x = e.getX();
		y = e.getY();
		System.out.println("X:"+e.getX()+"\t Y:"+e.getY());
		
		repaint();//update()-paint()������ ȣ��
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺 IN");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("���콺 OUT");
		
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
		System.out.println("���콺 �巡��");		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
