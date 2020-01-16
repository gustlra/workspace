package io;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TryNotepad extends JFrame implements ActionListener {
	private JTextArea area;
	private MenuPane menu;
	private File file;

	public TryNotepad() {
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		area.setFont(new Font("���� ���", Font.BOLD, 18));
		
		menu = new MenuPane();
		this.setJMenuBar(menu);
		
		Container c = this.getContentPane();
		c.add(area);
		
		setTitle("���� �޸���");
		setBounds(800,100,700,500);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(TryNotepad.this, 
														"�����Ͻðڽ��ϱ�?", 
														"�޸���", 
														JOptionPane.YES_NO_CANCEL_OPTION);

				if(result == JOptionPane.YES_OPTION) {
				//���� ����
				if(area.getText().length()!=0) {
					saveDialog();
					fileWrite();
				}
				System.exit(0);
				
				}else if(result == JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			}
		});
	}
	
	public void event() {
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu.getNewM()){
			area.setText("");
		
		}else if(e.getSource()==menu.getOpenM()){
			openDialog();//���� ���̾�α�
			fileRead();//���� �б�			
			
		}else if(e.getSource()==menu.getSaveM()){
			saveDialog();
			fileWrite();
			
		}else if(e.getSource()==menu.getExitM()){
			//System.exit(0);
			
			int result = JOptionPane.showConfirmDialog(this, 
												"�����Ͻðڽ��ϱ�?", 
												"�޸���", 
												JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(result == JOptionPane.YES_OPTION) {
				//���� ����
				if(area.getText().length()!=0) {
					saveDialog();
					fileWrite();
				}
				System.exit(0);
				
			}else if(result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
			
		}else if(e.getSource()==menu.getCutM()){
			area.cut();
			
		}else if(e.getSource()==menu.getCopyM()){
			area.copy();
			
		}else if(e.getSource()==menu.getPasteM()){
			area.paste();
			
		}
		
	}
	
	public void openDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
		
		if(result == JFileChooser.APPROVE_OPTION) {
		//if(result == 0) {
			file = chooser.getSelectedFile();//������ ��ο� ���ϸ�
		}
		
		JOptionPane.showMessageDialog(this, file);
	}
	public void fileRead() {
		if(file==null) return;
		
		area.setText("");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			
			while( (line=br.readLine()) != null) {
				//area.setText(line);
				area.append(line+"\n");	
			}
			
			br.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//������ ��ο� ���ϸ�
		}
		
		JOptionPane.showMessageDialog(this, file);
		
	}
	public void fileWrite() {
		if(file==null) return;
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			String data = area.getText();
			
			bw.write(data);
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TryNotepad().event();
	}
}

















