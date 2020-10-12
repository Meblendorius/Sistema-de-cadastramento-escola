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


public class MostrarCursos extends JFrame implements ActionListener {
	public MostrarCursos() {
		setTitle("Sistema De Cursos");
		setResizable(false);
		setSize(1000,600);
		setLocation(800,500);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cursos");
		lblNewLabel.setBounds(465, 22, 120, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JList list = new JList();
		list.setSelectionForeground(SystemColor.control);
		list.setForeground(Color.white);
		list.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		list.setBackground(new Color(255, 255, 255));
		list.setSelectionBackground(SystemColor.control);
		getContentPane().setLayout(null);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  ");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(100, 80, 800, 400);
		getContentPane().add(lblNewLabel_1);
		
		JButton bsair = new JButton("Sair");		
		bsair.setBackground(Color.decode("#91b4ed"));
		bsair.addActionListener(this);
		bsair.setBounds(465, 500, 89, 23);
		getContentPane().add(bsair);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
