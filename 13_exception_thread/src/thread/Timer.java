package thread;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer extends JFrame implements ActionListener, Runnable {
	private JLabel label;
	private JButton startBtn, stopBtn;
	private boolean bb = true;
	
	public Timer() {
		setLayout(null);
		
		label = new JLabel();
		label.setFont(new Font("고딕체", Font.BOLD, 70));
		startBtn = new JButton("시작");
		stopBtn = new JButton("멈춤");
		
		label.setBounds(70, 30, 100,100);
		startBtn.setBounds(200,40,60,30);
		stopBtn.setBounds(200,80,60,30);
		
		add(label);
		add(startBtn);
		add(stopBtn);
		
		setTitle("타이머");
		setBounds(900,200,300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		startBtn.addActionListener(this);
		stopBtn.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t;
		
		if(e.getSource()==startBtn) {
			t = new Thread(this);
			t.start();
			
			bb=true;
			startBtn.setEnabled(false);//버튼 안눌리게
			stopBtn.setEnabled(true);
			
		}else if(e.getSource()==stopBtn) {
			t = null;
			
			bb=false;
			startBtn.setEnabled(true);
			stopBtn.setEnabled(false);
			
		}
	}
	
	@Override
	public void run() {		
		for(int n=1; n<=20; n++) {
			label.setText(Integer.toString(n));
			if(!bb)break;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		startBtn.setEnabled(true);
		stopBtn.setEnabled(false);
	}
	
	public static void main(String[] args) {
		new Timer();
	}

	
}









