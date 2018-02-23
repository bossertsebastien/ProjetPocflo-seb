package neo4j.base;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.neo4j.jdbc.Connection;



public class BaseNeo4j {

	
	Connection con = null;
	
	public void connection() throws SQLException {
	// Connect
	 con = (Connection) DriverManager.getConnection("jdbc:neo4j:http://obiwan2.univ-brest.fr:7474/");   		
	}
	
	
	public void get(String ras ) {
		// Querying
		try  {
			Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("MATCH (etat:MP_Risque) RETURN n.nom");
		    while (rs.next()) {
		    	// rs.getString("");
		        System.out.println(rs.getString("n.nom"));
		    }
		    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
	public void fermer() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//fonction create
//	try (Statement stmt = con.
//			  stmt.execute("CREATE (baeldung:Company {name:\"Baeldung\"}) "
//			  + "-[:owns]-> (tesla:Car {make: 'tesla', model: 'modelX'})"
//			  + "RETURN baeldung, tesla")
//			 
	
	//fonction match
//			    ResultSet rs = stmt.executeQuery(
//			      "MATCH (company:Company)-[:owns]-> (car:Car)" +
//			      "WHERE car.make='tesla' and car.model='modelX'" +
//			      "RETURN company.name");
//			 
//			    while (rs.next()) {
//			        rs.getString("company.name");
//			    }
//			}
	
	

}
	


