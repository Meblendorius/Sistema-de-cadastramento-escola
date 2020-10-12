package Projeto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class altcadAluno extends JFrame implements ActionListener{
	JLabel ti,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField matricula,nome,datanasc,codCurso,nomeCurso,p1,p2,med,faltas;
	JList coddisc,nomedisc;
	JButton binc,bsair,balterar,bexcluir;
	Font f = new Font("SansSerif", Font.BOLD, 20);
	
	public altcadAluno() {
		setTitle("Alterar Alunos (alterar pela Matricula)");
		setResizable(false);
		setSize(750,700);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		ti= new JLabel("Alterar Alunos (alterar pela Matricula");
		ti.setLocation(30,30);
		ti.setSize(600,20);
		ti.setFont(f);
		
		l1= new JLabel("Matricula:");
		l1.setLocation(30,90);
		l1.setSize(300,20);
		
		l2= new JLabel("Nome:");
		l2.setLocation(30,l1.getY()+60);
		l2.setSize(300,20);
		
		l3= new JLabel("Data de Nascimento");
		l3.setLocation(30,l2.getY()+60);
		l3.setSize(300,20);
		
		l4= new JLabel("Código do Curso:");
		l4.setLocation(30,l3.getY()+60);
		l4.setSize(300,20);
		
		l5=new JLabel("Nome do Curso:");
		l5.setLocation(30,l4.getY()+60);
		l5.setSize(300,20);
		
		l6= new JLabel("Nota p1:");
		l6.setLocation(30,l5.getY()+60);
		l6.setSize(300,20);
		
		l7= new JLabel("Nota p2:");
		l7.setLocation(30,l6.getY()+60);
		l7.setSize(300,20);
		
		l8= new JLabel("Média:");
		l8.setLocation(30,l7.getY()+60);
		l8.setSize(300,20);
		
		l9=new JLabel("Faltas:");
		l9.setLocation(450,l1.getY());
		l9.setSize(300,20);
		
		l10=new JLabel("Dados Disciplina:");
		l10.setLocation(450,l2.getY());
		l10.setSize(300,20);
		
		coddisc= new JList();
		coddisc.setLocation(l10.getX(),l10.getY()+30);
		coddisc.setSize(100,400);
		
		
		nomedisc= new JList();
		nomedisc.setLocation(coddisc.getX()+150,coddisc.getY());
		nomedisc.setSize(100,400);
		
		matricula= new JTextField("");
		matricula.setLocation(l1.getX()+200, l1.getY());
		matricula.setSize(150,20);
		
		nome= new JTextField("");
		nome.setLocation(l2.getX()+200, l2.getY());
		nome.setSize(150,20);
		
		datanasc= new JTextField("");
		datanasc.setLocation(l3.getX()+200, l3.getY());
		datanasc.setSize(150,20);
		
		codCurso= new JTextField("");
		codCurso.setLocation(l4.getX()+200, l4.getY());
		codCurso.setSize(150,20);
		
		nomeCurso= new JTextField("");
		nomeCurso.setLocation(l5.getX()+200, l5.getY());
		nomeCurso.setSize(150,20);
		
		p1= new JTextField("");
		p1.setLocation(l6.getX()+200, l6.getY());
		p1.setSize(150,20);
		
		p2= new JTextField("");
		p2.setLocation(l7.getX()+200, l7.getY());
		p2.setSize(150,20);
		
		med= new JTextField("");
		med.setLocation(l8.getX()+200, l8.getY());
		med.setSize(150,20);
		
		faltas= new JTextField("");
		faltas.setLocation(l9.getX()+100, l9.getY());
		faltas.setSize(150,20);
		
		

	
		
		
		balterar= new JButton("Alterar");
		balterar.setSize(120,50);
		balterar.setBackground(Color.decode("#91b4ed"));
		balterar.addActionListener(this);
		balterar.setLocation(30,600);
		
		bsair= new JButton("SAIR");
		bsair.setSize(120,50);
		bsair.setBackground(Color.decode("#91b4ed"));
		bsair.addActionListener(this);
		bsair.setLocation(balterar.getX()+150,balterar.getY());
		
		add(ti);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(matricula);
		add(nome);
		add(datanasc);
		add(codCurso);
		add(nomeCurso);
		add(p1);
		add(p2);
		add(med);
		add(faltas);
		add(coddisc);
		add(nomedisc);
		

		add(balterar);
		add(bsair);	
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==balterar) {
			
		}
		if(e.getSource()==bsair) {
			dispose();
			
		}
		
	}
}
