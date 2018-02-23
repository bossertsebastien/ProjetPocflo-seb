package neo4j.base;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.neo4j.jdbc.Connection;



public class BaseNeo4j {

	static {
		try {
			Class.forName("org.neo4j.jdbc.Driver").newInstance();
		} catch (IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		
		}catch(InstantiationException e) {
			e.printStackTrace();	
		}

}
	
	Connection con = null;
	
	public void connection() {
	 try {
		con = (Connection) DriverManager.getConnection("jdbc:neo4j:http://obiwan2.univ-brest.fr:7474/");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   		
	}
	
	public void test() {
		// Querying
		try  {
			Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("MATCH (n:fk_Artist) RETURN n.nom");
		    while (rs.next()) {
		        System.out.println(rs.getString("n.nom"));
		    }
		    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public void get(String ras, String choix ) {
		// Querying
		try  {
			Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("MATCH (etat:MP_Risque)-[:MP_SOUHAITE]->(parcours:MP_PROJET) " + "WHERE etat.nom='"+ras+"' AND parcours.nom='"+choix+"' RETURN parcours.nom");
		    while (rs.next()) {
		    	// rs.getString("");
		        System.out.println(rs.getString("parcours.nom"));
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
	


