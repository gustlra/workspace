package interface_1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener, WindowListener {
	private JLabel idL, pwdL;
	private JTextField idT;
	private JTextField  pwdT;
	private JButton loginB, cancelB;
	
	public Login() {
		this.setLayout(null);
		
		idL = new JLabel("아이디");
		pwdL = new JLabel("비밀번호");
		
		idT = new JTextField();
		pwdT = new JPasswordField();
		
		loginB = new JButton("로그인");
		cancelB = new JButton("취소");
		
		//idL.setLocation(50, 70);
		//idL.setSize(50,30);
		idL.setBounds(50, 70, 50, 30);
		pwdL.setBounds(50,120,60,30);
		
		idT.setBounds(120,70,100,30);
		pwdT.setBounds(120,120,110,30);
		
		loginB.setBounds(40,190,100,30);
		cancelB.setBounds(150,190,100,30);
		
		Container c = this.getContentPane();
		c.add(idL);
		c.add(idT);
		
		c.add(pwdL);
		c.add(pwdT);
		
		c.add(loginB);
		c.add(cancelB);
		
		setBounds(900,100,300,300);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
		
		loginB.addActionListener(this);
		cancelB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="로그인") {
			String id = idT.getText();
			String pwd = pwdT.getText();
			
			new LoginResult(id, pwd);
			
			
			
		}else if(e.getSource()==cancelB) {
			idT.setText("");
			pwdT.setText("");
		}		
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

	public static void main(String[] args) {
		new Login();
	}
	
}
