

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import controller.Controller;

@WebServlet("/AutenticaUsuario")
public class AutenticaUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AutenticaUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("user");
		String senha = request.getParameter("pass");
		boolean validaAutenticacao = Controller.autenticacaoUsuario(usuario, senha);
		
		Gson gson = new GsonBuilder().create();
		//return gson.toJson(p);
		
		if (validaAutenticacao) {
			JsonObject autentica = new JsonObject();
			autentica.addProperty("mensagem", "Usuário autenticado, será redirecionado em breve!");
			autentica.addProperty("status", "true"); 
			response.getWriter().append(gson.toJson(autentica));
		}else {
			JsonObject autentica = new JsonObject();
			autentica.addProperty("mensagem", "Senha ou usuário incorretos, tente novamente!");
			autentica.addProperty("status", "false"); 
			response.getWriter().append(gson.toJson(autentica));
		}
	}

}
