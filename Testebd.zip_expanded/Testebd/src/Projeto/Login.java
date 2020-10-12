package Projeto;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Login extends JFrame implements ActionListener{
	JTextField usuario;
	JPasswordField senha;
	JButton b1;
	String[][] login= new String[2][2];
	Login in;
	public Login(){
		
		login[0][0]="cleiton";
		login[0][1]="banana1";
		login[1][0]="Jorge";
		login[1][1]="banana2";
		
		
		setTitle("Sistema De Login");
		setResizable(false);
		setLayout(null);
		setSize(500,500);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		usuario= new JTextField("");
		usuario.setSize(300,50);
		usuario.setLocation(100,90);
		
		senha= new JPasswordField("");
		senha.setSize(300,50);
		senha.setLocation(usuario.getX(),usuario.getY()+150);
		
		b1= new JButton("Login");
		b1.setSize(100,50);
		b1.addActionListener(this);
		b1.setLocation(senha.getX(),330);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(110, 60, 78, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_ = new JLabel("Senha");
		lblNewLabel_.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_.setBounds(110, 200, 78, 22);
		getContentPane().add(lblNewLabel_);
		
		add(usuario);
		add(senha);
		add(b1);	
		
		
		
	}
	public static void main(String args[]) {
		new Login().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			for(int i=0;i<2;i++) {
				if(usuario.getText().equals(login[i][0]) && senha.getText().equals(login[i][1])) {
					Login in= new Login();
					in.setVisible(true);
					break;
					
				}
				
			}
			
		}
		
	}

}
