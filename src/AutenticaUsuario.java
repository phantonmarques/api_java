

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		response.getWriter().append(Controller.getArrayJsonAut(usuario, senha));
	}

}
