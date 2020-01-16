package thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Racer extends Canvas implements Runnable {//말 1마리
	private Image img;
	private int pos;
	private static int rank;
	
	public Racer() {
		img = Toolkit.getDefaultToolkit().getImage("horse.gif");
		//setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), 255));
	}
	@Override
	public void paint(Graphics g) {
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		g.drawImage(img, pos, 0, 25, this.getHeight(),  this);//x, y, width, height
	}
	
	@Override
	public void run() {
		for(int i=0; i<600; i+=(int)(Math.random()*10+1)) {
			pos = i;
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
		
		rank++;
		System.out.println(rank+"등"+"\t"+Thread.currentThread().getName());
	}
}
































