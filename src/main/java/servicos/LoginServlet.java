package servicos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dados.*;
import controles.*;
/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
	private rep_lista repositorio;
	private controle controle1;
    public LoginServlet() {
        super();
        repositorio = new rep_lista();
        repositorio.varios_Usuarios();
        controle1 = new controle(repositorio);  
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//carrega o formulário de login
		HttpSession session = request.getSession();
		if(session.getAttribute("usuario")!= null){
			response.sendRedirect("");
		}
		else {
			response.sendRedirect("login.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recebe os dados de login e checa se existe, se existir envia para a tela principal do sistema se não envia para o formulário de login
		String login;
		String senha;
		
		senha = request.getParameter("senha");
		login = request.getParameter("login");
		Usuario usuario1 = controle1.buscar(login,senha);
		System.out.println(usuario1.getNome());
		if (usuario1 != null) {
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario1);
			session.setAttribute("nome", login);
			response.sendRedirect("");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}