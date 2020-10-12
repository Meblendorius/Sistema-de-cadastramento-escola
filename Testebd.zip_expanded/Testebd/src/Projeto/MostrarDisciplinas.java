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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class MostrarDisciplinas extends JFrame implements ActionListener {
        Teste bd = new Teste();
    public MostrarDisciplinas() throws SQLException {
		setTitle("Sistema De Professores");
		setResizable(false);
		setSize(1000,600);
		setLocation(800,500);
		getContentPane().setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Diciplinas");
		lblNewLabel.setBounds(465, 22, 120, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
                add(lblNewLabel);
                
                
		
		/*DefaultListModel<String> model = new DefaultListModel<String>();
                JList<String> list= new JList<String>(model);
                list.setLocation(100,80);
                list.setSize(800,400);
                add(list);*/
                 
                Connection c=bd.Teste();
                try {
                    Statement st;
                
                st = c.createStatement();
                
                ResultSet res = st.executeQuery("select * from cadDisciplina; ");
                if(res.next()){
                    JLabel l1= new JLabel("Codigo da Disciplina:");
		l1.setLocation(30,90);
		l1.setSize(800,100);
                add(l1);
                
                l1.setText( res.getString("nome_discip")+" "+res.getString("carg_h")+" "+res.getString("al_s"));
                    }
                } catch (Exception e) {
            
                    }
             
		
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
