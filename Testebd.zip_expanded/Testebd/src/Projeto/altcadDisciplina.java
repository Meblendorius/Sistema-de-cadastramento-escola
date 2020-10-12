package Projeto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class altcadDisciplina extends JFrame implements ActionListener{
	JLabel ti,l1,l2,l3,l4;
	JTextField coddisc,nomedis,cargah;
	JRadioButton r1,r2,r3,r4,r5,r6;
	ButtonGroup btgRadios = new  ButtonGroup();
	JButton bsair,balterar;
	Font f = new Font("SansSerif", Font.BOLD, 20);
	
	public altcadDisciplina() {
		
		setTitle("Alterar Disciplinas (alterar pelo código)");
		setResizable(false);
		setSize(900,500);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		ti= new JLabel("Alterar Disciplinas (alterar pelo código)");
		ti.setLocation(30,30);
		ti.setSize(600,20);
		ti.setFont(f);
		
		l1= new JLabel("Código da Disciplina:");
		l1.setLocation(30,90);
		l1.setSize(300,20);
		
		l2= new JLabel("Nome da Disciplina:");
		l2.setLocation(30,l1.getY()+100);
		l2.setSize(300,20);
		
		l3= new JLabel("Carga horaria:");
		l3.setLocation(30,l2.getY()+100);
		l3.setSize(300,20);
		
		
		
		coddisc= new JTextField("");
		coddisc.setLocation(l1.getX()+200, l1.getY());
		coddisc.setSize(150,20);
		
		nomedis= new JTextField("");
		nomedis.setLocation(l2.getX()+200, l2.getY());
		nomedis.setSize(150,20);
		
		cargah= new JTextField("");
		cargah.setLocation(l3.getX()+200, l3.getY());
		cargah.setSize(150,20);
		
		l4= new JLabel("Quantidade de aulas na semana");
		l4.setLocation(l1.getX()+400,l1.getY());
		l4.setSize(300,20);
		
		r1= new JRadioButton("1");
		r1.setLocation(l4.getX(),l4.getY()+60);
		r1.setSize(150,40);
		
		r2= new JRadioButton("2");
		r2.setLocation(r1.getX(),r1.getY()+60);
		r2.setSize(150,40);
		
		r3= new JRadioButton("3");
		r3.setLocation(r2.getX(),r2.getY()+60);
		r3.setSize(150,40);
		
		
		
		
		r4= new JRadioButton("4");
		r4.setLocation(r1.getX()+200,r1.getY());
		r4.setSize(150,40);
		
		r5= new JRadioButton("5");
		r5.setLocation(r4.getX(),r4.getY()+60);
		r5.setSize(150,40);
		
		r6= new JRadioButton("6");
		r6.setLocation(r5.getX(),r5.getY()+60);
		r6.setSize(150,40);
		
		btgRadios.add(r1);
		btgRadios.add(r2);
		btgRadios.add(r3);
		btgRadios.add(r4);
		btgRadios.add(r5);
		btgRadios.add(r6);
		
		
		

	
		
		
		balterar= new JButton("Alterar");
		balterar.setSize(120,50);
		balterar.setBackground(Color.decode("#91b4ed"));
		balterar.addActionListener(this);
		balterar.setLocation(50,400);
		
		
		bsair= new JButton("SAIR");
		bsair.setSize(120,50);
		bsair.setBackground(Color.decode("#91b4ed"));
		bsair.addActionListener(this);
		bsair.setLocation(balterar.getX()+200,balterar.getY());
		
		
		add(ti);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		add(coddisc);
		add(nomedis);
		add(cargah);
		
		add(r1);
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		add(r6);
		
		
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
