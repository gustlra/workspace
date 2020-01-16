package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Packman extends Frame implements KeyListener, Runnable {
	private Image img, foodImg;
	private int sel=2;
	private int x=225, y=225;
	private int mx, my;
	private int[] foodX, foodY;
	
	public Packman() {
		img = Toolkit.getDefaultToolkit().getImage("packman.jpg");
		foodImg = Toolkit.getDefaultToolkit().getImage("food.jpg");
		
		foodX = new int[5];
		foodY = new int[5];
		for(int i=0; i<foodX.length; i++) {
			foodX[i] = (int)(Math.random()*461+20);//20 ~ 480
			foodY[i] = (int)(Math.random()*461+20);
		}
			
		setBounds(700, 200, 500, 500);
		setVisible(true);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addKeyListener(this);
		
		//스레드 생성
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 
				x, y, x+50, y+50,//화면 위치
				sel*50, 0, sel*50+50, 50,//이미지 위치
				this);
		
		//먹이
		for(int i=0; i<foodX.length; i++) {
			g.drawImage(foodImg, foodX[i], foodY[i], this);
		}
	}
	
	@Override
	public void run() {
		while(true) {
			if(sel%2==0) sel++;
			else sel--;
			
			x+=mx;
			y+=my;
			if(x>500) x=0;
			else if(x<0) x=500;
			else if(y>500) y=0;
			else if(y<0) y=500;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
			
			for(int i=0; i<foodX.length; i++) {
				if(x+25 >= foodX[i]-10 && y+25>=foodY[i]-10
				&& x+25 <= foodX[i]+20+10 && y+25 <= foodY[i]+20+10) foodX[i] = foodY[i] = -100;
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==27) System.exit(0);
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			sel=0;
			mx=-10; my=0;
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			sel=2;
			mx=10; my=0;
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP) {
			sel=4;
			mx=0; my=-10;
		}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN) { 
			sel=6;
			mx=0; my=10;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String[] args) {
		new Packman();
	}

}











