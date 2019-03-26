package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import entidade.Pessoa;

public class PessoaDAO {
	
	
	public PessoaDAO() {

	}	
	
	public void criarUsuario(String nomeCompleto, String usuarioLogin, String senhaLogin,
		String email, String cidade, String estado, String dataNascimento, int telefone) {}
	
	public Pessoa autenticarUsuario(Pessoa usuario) {
		Connection conn;
	    ResultSet rs = null;
	    if(usuario != null && usuario.getUsuarioLogin() != null && !usuario.getUsuarioLogin().isEmpty() && usuario.getSenhaLogin() != null 
	    	&& !usuario.getSenhaLogin().isEmpty()){
	        
	    	try {
	    		String querySQL = "SELECT * USUARIO WHERE LOGIN = ? AND SENHA = ?";
	    		conn = ConexaoDAO.conectaSQL();
	    		PreparedStatement ps = conn.prepareStatement(querySQL);
	            ps.setString(1, usuario.getUsuarioLogin());
	            ps.setString(2, usuario.getSenhaLogin());
	            rs = ps.executeQuery();                
	            usuario = null;
	            
	            while (rs.next()) {
	            	usuario = new Pessoa();
	            	// seta os valores aqui
	            }
	            
	            return usuario;
	    	}catch (SQLException ex) {
	    		//erro
	        } catch(Exception ex){
	        	//erro
	        }
	    }
	        return null;
	}
}
