package servicos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Principal
 */
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Principal() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//carrega a Tela principal do sistema
		if(session.getAttribute("usuario")!=null){
			request.setAttribute("nome", session.getAttribute("nome"));
			System.out.println(session.getAttribute("nome"));
			request.getRequestDispatcher("tela_principal.jsp").forward(request, response);
		}else{
			response.sendRedirect("login");
		}
	}

}