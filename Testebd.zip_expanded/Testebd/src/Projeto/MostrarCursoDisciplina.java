package Projeto;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class MostrarCursoDisciplina extends JFrame implements ActionListener {
	public MostrarCursoDisciplina() {
		setTitle("Sistema Atendimento aos Profressores / Disnciplinas");
		setResizable(false);
		setSize(500,600);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		String cursos []= {"Claudio","amenor","Jorge"};
		
		
		JLabel lblNewLabel = new JLabel("Curso");
		lblNewLabel.setBounds(38, 11, 128, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JList prof= new JList(cursos);
		prof.setLocation(lblNewLabel.getX(),lblNewLabel.getY()+50);
		prof.setSize(200,400);
		add(prof);
		
		JList disc= new JList();
		disc.setLocation(265,lblNewLabel.getY()+50);
		disc.setSize(200,400);
		add(disc);
		
		
		
		JLabel lblProfessores = new JLabel("Disciplina");
		lblProfessores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProfessores.setBounds(265, 11, 128, 30);
		getContentPane().add(lblProfessores);
		
		JButton bconsulta = new JButton("Consultar");		
		bconsulta.setBackground(Color.decode("#91b4ed"));
		bconsulta.addActionListener(this);
		bconsulta.setBounds(150, 480, 89, 23);
		getContentPane().add(bconsulta);
		
		JButton bsair = new JButton("Sair");		
		bsair.setBackground(Color.decode("#91b4ed"));
		bsair.addActionListener(this);
		bsair.setBounds(bconsulta.getX()+100, 480, 89, 23);
		getContentPane().add(bsair);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
