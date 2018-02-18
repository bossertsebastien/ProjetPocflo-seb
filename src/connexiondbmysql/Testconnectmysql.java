package connexiondbmysql;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Testconnectmysql {

	public static void main (String[] args) throws SQLException{ 
		
		 Connect maClasseConnect = new Connect();
		 Connection maConnexion = maClasseConnect.getConnection();
		 
		 if (maConnexion!=null) {
		
			 Statement stmt = (Statement) maConnexion.createStatement();
		     ResultSet rset = stmt.executeQuery("SELECT * FROM `t_livre`");
		        
		     
		     while (rset.next()) {
		    	 
		    	Integer idLivre = rset.getInt("idLivre");
		    	String titre = rset.getString("titre");
		    	String auteur = rset.getString("auteur");
		    	
		    	System.out.println("idLivre: "+idLivre + " titre: " + titre + " auteur: " + auteur);
		    	
	         }
		     
		        
		     stmt.close();
		     rset.close();
	     
		 }
	}
}
