package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexaoDAO {

	public static Connection conectaSQL() {
		String usuario = "sql";
		String senha = "senha@123";
		String url = "jdbc:sqlserver://sql.locadados.com.br:1433;databaseName=hsegura_tutorial" +
		                       ";user=" + usuario + ";password=" + senha + ";";
		try {
		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    Connection conexao = DriverManager.getConnection(url);
		    return conexao;

		} catch (ClassNotFoundException f) {
		    // Erro caso o driver JDBC não foi instalado
		    f.printStackTrace();
		} catch (SQLException e) {
		    // Erro caso haja problemas para se conectar ao banco de dados
		    e.printStackTrace();
		}
		return null;

	}

}
