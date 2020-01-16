package thread;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ThreadOnOff extends JFrame implements Runnable {
	private JButton btn = new JButton("누르기");
	private boolean bb = true;
	private static int ii;

	public ThreadOnOff(){
		super("Test");
		
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);	
		
		add("South",p);
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//이벤트
		btn.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e){
				bb = true; 
				new Thread(ThreadOnOff.this).start();
			}

			@Override
			public void mouseReleased(MouseEvent e){
				bb = false;
			}
		});
	}

	public void run(){
		if(ii==100)	ii=0;
		int i=ii;
		while(true){
			i++;
			if(!bb) break;
			try{
				Thread.sleep(50);
			}catch(InterruptedException ee){ ee.printStackTrace(); }
			System.out.println("i="+i);
			ii = i;
		}
	}

	public static void main(String[] args) {
		new ThreadOnOff();
	}
}
