package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mySQL.base.*;
import personne.base.*;

/**
 * Servlet implementation class ServletInscription
 */
@WebServlet("/ServletInscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInscription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getServletContext().getRequestDispatcher("/html/PageCreationCompte.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BaseSQL bd = new BaseSQL();
		String email = null;
		String nom = null;
		String prenom = null;
		boolean RAS = false; 
		request.getSession().setAttribute("email", email);
		request.getSession().setAttribute("nom", nom);
		request.getSession().setAttribute("prenom", prenom);
		request.getSession().setAttribute("RAS", RAS);
		System.out.println(nom +prenom+ email+ RAS);
		Personne p2 = new Personne(nom, prenom, email, RAS);
		
	}

}
