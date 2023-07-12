package br.com.libs.connectionToMySQL;

import java.sql.Connection;
import java.sql.DriverManager;


//colocar o .jar nas libs

public class ConnectionMySQL {
	
	private static final String USERNAME = ""; //nome para login no banco
	private static final String PASSWORD = ""; //senha para login no banco
	
	private static final String DATABASE_URL = ""; //url para acessar o banco
	
	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		// conectando o java ao banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}

	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();
		
		if (con != null) {
			System.out.println("Conexão obetida com sucesso!");
			con.close();
		}
	}
}
