package Projeto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class altcadCurso extends JFrame implements ActionListener{
	JLabel ti,l1,l2,l3,l4,l5;
	JTextField cod,carg,codi;
	JList lcursos;
	JRadioButton bach,ges,outros;
	ButtonGroup btgRadios = new  ButtonGroup();
	JButton binc,bsair,balterar,bexcluir;
	Font f = new Font("SansSerif", Font.BOLD, 20);
	
	public altcadCurso() {
		
		String cursos []= {"Administração de Empresas", "Bio Medicina", "Ciências Biológicas", "Ciencias da Computação", "Direito", "Educação Física"," Farmacologia"," Rede de Computadores", "Sistemas de Informações"};
		
		setTitle("Alterar Cursos(alterar pelo Código do Curso)");
		setResizable(false);
		setSize(900,700);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		ti= new JLabel("Alterar Cursos(alterar pelo Código do Curso)");
		ti.setLocation(30,30);
		ti.setSize(600,20);
		ti.setFont(f);
		
		l1= new JLabel("Código do curso: ");
		l1.setLocation(30,90);
		l1.setSize(300,20);
		
		l2= new JLabel("Carga horaria:");
		l2.setLocation(30,l1.getY()+60);
		l2.setSize(300,20);
		
		l3= new JLabel("Código do Instituto:");
		l3.setLocation(30,l2.getY()+60);
		l3.setSize(300,20);
		
		l4= new JLabel("Tipo do Curso:");
		l4.setLocation(30,l3.getY()+60);
		l4.setSize(300,20);
		
		l5=new JLabel("Nome do Curso:");
		l5.setLocation(550,l1.getY());
		l5.setSize(300,20);
		
		lcursos= new JList(cursos);
		lcursos.setLocation(l5.getX(),l5.getY()+50);
		lcursos.setSize(200,400);
		
		cod= new JTextField("");
		cod.setLocation(l1.getX()+200, l1.getY());
		cod.setSize(150,20);
		
		carg= new JTextField("");
		carg.setLocation(l2.getX()+200, l2.getY());
		carg.setSize(150,20);
		
		codi= new JTextField("");
		codi.setLocation(l3.getX()+200, l3.getY());
		codi.setSize(150,20);
		
		bach= new JRadioButton("Bacharel");
		bach.setLocation(l4.getX(),l4.getY()+60);
		bach.setSize(150,40);
		
		ges= new JRadioButton("Gestão");
		ges.setLocation(bach.getX(),bach.getY()+60);
		ges.setSize(150,40);
		
		outros= new JRadioButton("Outros");
		outros.setLocation(ges.getX(),ges.getY()+60);
		outros.setSize(150,40);
		
		btgRadios.add(bach);
		btgRadios.add(ges);
		btgRadios.add(outros);
		
		balterar= new JButton("Alterar");
		balterar.setSize(120,50);
		balterar.setBackground(Color.decode("#91b4ed"));
		balterar.addActionListener(this);
		balterar.setLocation(50,600);
		
		
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
		add(l5);
		add(cod);
		add(carg);
		add(codi);
		add(bach);
		add(ges);
		add(outros);
		add(lcursos);
		
		
		
		
		
		
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
