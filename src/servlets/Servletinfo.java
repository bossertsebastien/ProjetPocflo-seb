package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.connection.Connection;
import com.mysql.jdbc.Statement;

import connexiondbMongoDb.ConnectMongo;

/**
 * Servlet implementation class Servletinfo
 */
@WebServlet("/Servletinfo")
public class Servletinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			ConnectMongo connection = new ConnectMongo();
			ArrayList<String> mesDescription = new ArrayList<String>();
			
			
			MongoCollection<Document> collection = connection.getmongodb().getCollection("urlprofil");
				 
			MongoCursor<Document> cursor = collection.find().iterator();
			while (cursor.hasNext()) {
					 Document obj = cursor.next();
					 System.out.println(obj.getString("profil"));
					 if (obj.getString("profil").equals("nonconnecter"))
						 	mesDescription.add(obj.getString("Description"));
			}
			request.getServletContext().getRequestDispatcher("/html/Info.jsp").forward(request, response);
			request.setAttribute("Description", mesDescription);
			     
			 } catch(Exception e) {
				 System.out.println(e.getMessage());
			 }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		}
	}
