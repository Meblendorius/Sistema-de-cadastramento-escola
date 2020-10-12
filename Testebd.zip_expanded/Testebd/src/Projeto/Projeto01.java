package Projeto;
import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Projeto01 extends JFrame implements ActionListener{
	JMenuBar bMenu;
	JMenu menu1, menu2, menu3,alt,del;
	JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,alt1,alt2,alt3,alt4,del1,del2,del3,del4;
	
      
	public Projeto01() {
             Teste bd = new Teste();
            bd.Teste();
            
		setTitle("Sistema Atendimento aos Hospedes");
		setResizable(false);
		setSize(500,500);
		setLocation(200,150);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		menu1=new JMenu("Cadastrar");
		m1=new JMenuItem("curso");
		m1.addActionListener(this);
		
		
		m2=new JMenuItem("Disciplina");
		m2.addActionListener(this);
		
		
		m3=new JMenuItem("aluno");
		m3.addActionListener(this);
		
		
		m4=new JMenuItem("Professor");
		m4.addActionListener(this);
		
		menu1.add(m1);
		menu1.add(m2);
		menu1.add(m3);
		menu1.add(m4);
		
		
		menu2= new JMenu("Mostrar");
		m5= new JMenuItem("Cursos");
		m5.addActionListener(this);
		
		m6= new JMenuItem("Disciplinas");
		m6.addActionListener(this);
	
		
		m7= new JMenuItem("Aluno");
		m7.addActionListener(this);
	
		
		m8= new JMenuItem("Professores");
		m8.addActionListener(this);
	
		m9= new JMenuItem("Cursos/Professores");
		m9.addActionListener(this);
		
		m10= new JMenuItem("Cursos/Disciplinas");
		m10.addActionListener(this);
		
		m11= new JMenuItem("Professores/disciplinas");
		m11.addActionListener(this);
		
		menu2.add(m5);
		menu2.add(m6);
		menu2.add(m7);
		menu2.add(m8);
		menu2.addSeparator();
		menu2.add(m9);
		menu2.add(m10);
		menu2.add(m11);
		
		alt=new JMenu("Alterar");
		alt1=new JMenuItem("Alterar curso");
		alt1.addActionListener(this);
		
		
		alt2=new JMenuItem("Alterar Disciplina");
		alt2.addActionListener(this);
		
		
		alt3=new JMenuItem("Alterar aluno");
		alt3.addActionListener(this);
		
		
		alt4=new JMenuItem("Alterar Professor");
		alt4.addActionListener(this);
		
		alt.add(alt1);
		alt.add(alt2);
		alt.add(alt3);
		alt.add(alt4);
		
		del=new JMenu("Deletar");
		del1=new JMenuItem("Deletar curso");
		del1.addActionListener(this);
		
		
		del2=new JMenuItem("Deletar Disciplina");
		del2.addActionListener(this);
		
		
		del3=new JMenuItem("Deletar aluno");
		del3.addActionListener(this);
		
		
		del4=new JMenuItem("Deletar Professor");
		del4.addActionListener(this);
		
		del.add(del1);
		del.add(del2);
		del.add(del3);
		del.add(del4);
		
		menu3=new JMenu("Sair");
		m12= new JMenuItem("Sair");
		m12.addActionListener(this);
		
		menu3.add(m12);
		
		bMenu= new JMenuBar();
		bMenu.add(menu1);
		bMenu.add(menu2);
		bMenu.add(alt);
		bMenu.add(del);
		bMenu.add(menu3);
		
		
		setJMenuBar(bMenu);
	}
		
	public static void main(String args[]) {
		new Projeto01().setVisible(true);			
		}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==m12) {
			System.exit(0);
		}
		else {
			if(e.getSource()==m1) {
				cadCursos n= new cadCursos();
				n.setVisible(true);
			}
			else if(e.getSource()==m2){
				cadDisciplina n= new cadDisciplina();
				n.setVisible(true);
			}
			else if(e.getSource()==m3){
				cadAluno n= new cadAluno();
				n.setVisible(true);
			}
			else if(e.getSource()==m4){
				cadProfessor n= new cadProfessor();
				n.setVisible(true);
			}
			else if(e.getSource()==m5){
				MostrarCursos n= new MostrarCursos();
				n.setVisible(true);
			}
			else if(e.getSource()==m6){
				MostrarDisciplinas n;
                                
                            try {
                                n = new MostrarDisciplinas();
                                n.setVisible(true);
                            } catch (SQLException ex) {
                                Logger.getLogger(Projeto01.class.getName()).log(Level.SEVERE, null, ex);
                            }
				
			}
			else if(e.getSource()==m7){
				MostrarAluno n= new MostrarAluno();
				n.setVisible(true);
			}
			else if(e.getSource()==m8){
				MostrarProfessores n;
                            
                                n = new MostrarProfessores();
                                n.setVisible(true);
                            
                                
                            
				
			}
			else if(e.getSource()==m9){
				MostrarCursoProfessores n= new MostrarCursoProfessores();
				n.setVisible(true);
			}
			else if(e.getSource()==m10){
				MostrarCursoDisciplina n= new MostrarCursoDisciplina();
				n.setVisible(true);
			}
			else if(e.getSource()==m11){
				MostrasProfessoresDisciplinas n= new MostrasProfessoresDisciplinas();
				n.setVisible(true);
			}
			
			else if(e.getSource()==alt1){
				altcadCurso n= new altcadCurso();
				n.setVisible(true);
			}
			else if(e.getSource()==alt2){
				altcadDisciplina n= new altcadDisciplina();
				n.setVisible(true);
			}
			else if(e.getSource()==alt3){
				altcadAluno n= new altcadAluno();
				n.setVisible(true);
			}
			else if(e.getSource()==alt4){
				altcadProfessor n= new altcadProfessor();
				n.setVisible(true);
			}
			else if(e.getSource()==del1){
				excluirCursos n= new excluirCursos();
				n.setVisible(true);
			}
			else if(e.getSource()==del2){
				excluirDisciplina n= new excluirDisciplina();
				n.setVisible(true);
			}
			else if(e.getSource()==del3){
				excluirAluno n= new excluirAluno();
				n.setVisible(true);
			}
			else if(e.getSource()==del4){
				excluirProfessor n= new excluirProfessor();
				n.setVisible(true);
			}
		}
	}
	
	
	
	
		
		
	}


