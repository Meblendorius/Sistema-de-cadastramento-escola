package Projeto;
import java.sql.*;

public class Teste {
    
	public Connection Teste() {
            
            
		String url = "jdbc:mysql://localhost:3306/Projetojava"; //Nome da base de dados
		String user = "root"; //nome do usu�rio do MySQL
		String password = ""; //senha do MySQL
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("Foi");
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Conectou");
			//Statement st=connection.createStatement();
			//st.executeUpdate("insert into cadDisciplina values( 1,'Odeio marcos junior','16','2');");
                        return connection;
		}
		catch(Exception ex) {
			System.out.println(ex);
                        return null;
		}
		
		
	}

}
