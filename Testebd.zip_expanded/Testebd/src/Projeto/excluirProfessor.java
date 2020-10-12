package Projeto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class excluirProfessor extends JFrame implements ActionListener{
	JLabel l1;
	JTextField tx1;
	JButton bexcluir;
	
	public excluirProfessor() {
		setTitle("Excluir");
		setResizable(false);
		setSize(500,300);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		l1= new JLabel("Digite a identificação do professor");
		l1.setLocation(30,50);
		l1.setSize(200,20);
		
		tx1= new JTextField("");
		tx1.setLocation(l1.getX(), l1.getY()+50);
		tx1.setSize(200,20);
		
		bexcluir= new JButton("Excluir");
		bexcluir.setSize(120,50);
		bexcluir.setBackground(Color.decode("#91b4ed"));
		bexcluir.addActionListener(this);
		bexcluir.setLocation(l1.getX()+150,l1.getY()+100);
		
		add(l1);
		add(tx1);
		add(bexcluir);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
