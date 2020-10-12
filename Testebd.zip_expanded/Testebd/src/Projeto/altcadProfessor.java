package Projeto;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class altcadProfessor extends JFrame implements ActionListener{
	JLabel ti,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField identprof,nomeprof,rua,numero, bairro, cidade, estado, telfixo, celular, datanasc;
	JRadioButton direito,infor,mat,med, bach,mestrado,dout;
	ButtonGroup btgspec = new  ButtonGroup();
	ButtonGroup btgtit = new  ButtonGroup();
	JButton binc,bsair,balterar,bexcluir;
	Font f = new Font("SansSerif", Font.BOLD, 20);
	
	public altcadProfessor() {
		setTitle("Alterar Professores (alterar pela Identificação");
		setResizable(false);
		setSize(1000,700);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		ti= new JLabel("Alterar Professores (alterar pela Identificação)");
		ti.setLocation(30,30);
		ti.setSize(650,20);
		ti.setFont(f);
		
		l1= new JLabel("Identificação:");
		l1.setLocation(30,90);
		l1.setSize(300,20);
		
		l2= new JLabel("Nome:");
		l2.setLocation(30,l1.getY()+60);
		l2.setSize(300,20);
		
		l3= new JLabel("Rua:");
		l3.setLocation(30,l2.getY()+60);
		l3.setSize(300,20);
		
		
		
		l4= new JLabel("Numero");
		l4.setLocation(30,l3.getY()+60);
		l4.setSize(300,20);
		
		l5=new JLabel("Bairro:");
		l5.setLocation(l4.getX()+300,l4.getY());
		l5.setSize(300,20);
		
		
		
		
		l6= new JLabel("cidade:");
		l6.setLocation(30,l5.getY()+60);
		l6.setSize(300,20);
		
		l7= new JLabel("Estado:");
		l7.setLocation(l6.getX()+300,l6.getY());
		l7.setSize(300,20);
		
		
		l8= new JLabel("Telefone fixo:");
		l8.setLocation(30,l7.getY()+60);
		l8.setSize(300,20);
		
		l9=new JLabel("Celular");
		l9.setLocation(l8.getX()+300,l8.getY());
		l9.setSize(300,20);
		
		
		//lado direito
		l10=new JLabel("Data de Nascimento");
		l10.setLocation(600,l1.getY());
		l10.setSize(300,20);
		
		
		
		
		l11=new JLabel("Especificação");
		l11.setLocation(l10.getX()+50,l2.getY());
		l11.setSize(300,20);
		
		l12=new JLabel("Titulo");
		l12.setLocation(l11.getX()+200,l2.getY());
		l12.setSize(300,20);
		
		
		
		//JTextField identprof,nomeprof,rua,numero, bairro, cidade, estado, telfixo, celular, datanasc;
		identprof= new JTextField("");
		identprof.setLocation(l1.getX()+100, l1.getY());
		identprof.setSize(250,20);
		
		nomeprof= new JTextField("");
		nomeprof.setLocation(l2.getX()+100, l2.getY());
		nomeprof.setSize(250,20);
		
		rua= new JTextField("");
		rua.setLocation(l3.getX()+100, l3.getY());
		rua.setSize(250,20);
		
		numero= new JTextField("");
		numero.setLocation(l4.getX()+100, l4.getY());
		numero.setSize(150,20);
		
		bairro= new JTextField("");
		bairro.setLocation(l5.getX()+100, l5.getY());
		bairro.setSize(150,20);
		
		cidade= new JTextField("");
		cidade.setLocation(l6.getX()+100, l6.getY());
		cidade.setSize(150,20);
		
		estado= new JTextField("");
		estado.setLocation(l7.getX()+100, l7.getY());
		estado.setSize(150,20);
		
		telfixo= new JTextField("");
		telfixo.setLocation(l8.getX()+100, l8.getY());
		telfixo.setSize(150,20);
		
		celular= new JTextField("");
		celular.setLocation(l9.getX()+100, l9.getY());
		celular.setSize(150,20);
		
		datanasc= new JTextField("");
		datanasc.setLocation(l10.getX()+150, l10.getY());
		datanasc.setSize(150,20);
		
		//JCheckBox direito,infor,mat,med, bach,mestrado,dout;
		
		direito= new JRadioButton("Direito");
		direito.setLocation(l11.getX(),l11.getY()+60);
		direito.setSize(150,20);
		
		infor= new JRadioButton("Informatica");
		infor.setLocation(l11.getX(),direito.getY()+60);
		infor.setSize(150,20);
		
		mat= new JRadioButton("Matematica");
		mat.setLocation(l11.getX(),infor.getY()+60);
		mat.setSize(150,20);
		
		med= new JRadioButton("Medicina");
		med.setLocation(l11.getX(),mat.getY()+60);
		med.setSize(150,20);
		
		btgspec.add(direito);
		btgspec.add(infor);
		btgspec.add(mat);
		btgspec.add(med);
		
		// nivel
		bach= new JRadioButton("Bacharelado");
		bach.setLocation(l12.getX(),l12.getY()+60);
		bach.setSize(130,20);
		
		mestrado= new JRadioButton("Mestrado");
		mestrado.setLocation(l12.getX(),bach.getY()+60);
		mestrado.setSize(130,20);
		
		dout= new JRadioButton("Doutorado");
		dout.setLocation(l12.getX(),mestrado.getY()+60);
		dout.setSize(130,20);
		
		btgtit.add(bach);
		btgtit.add(mestrado);
		btgtit.add(dout);
			
		
		
		
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
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		//JTextField identprof,nomeprof,rua,numero, bairro, cidade, estado, telfixo, celular, datanasc;
		add(identprof);
		add(nomeprof);
		add(rua);
		add(numero);
		add(bairro);
		add(cidade);
		add(estado);
		add(telfixo);
		add(celular);
		add(datanasc);
		//JCheckBox direito,infor,mat,med, bach,mestrado,dout;
		add(direito);
		add(infor);
		add(mat);
		add(med);
		add(bach);
		add(mestrado);
		add(dout);
		
		
		
		add(balterar);
		
		add(bsair);	
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==balterar) {
			
		}
		if(e.getSource()==bsair) {
			dispose();
			
		}
		
	}
}
