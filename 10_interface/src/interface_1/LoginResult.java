package interface_1;

import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginResult extends JFrame implements WindowListener {
	private String id, pwd;
	
	public LoginResult(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
		
		setBounds(1200,200,150,150);
        setVisible(true);
        
        //�̺�Ʈ
        this.addWindowListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		if(id.equals("angel") && pwd.equals("1004")) {
			g.drawString("�α��� ����", 40, 80);
			JOptionPane.showMessageDialog(this, "�α��� ����");
		}else {
			g.drawString("�α��� ����", 40, 80);
			JOptionPane.showMessageDialog(this, "�α��� ����");
		}
	}
	
	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		//System.exit(0); //���α׷� ���� ����
		setVisible(false);
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
