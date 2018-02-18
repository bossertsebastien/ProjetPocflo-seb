package connexiondbMongoDb;

import java.sql.SQLException;

import com.mongodb.DBCursor;


public class TestMongoDB {

	public static void main(String[] args) throws SQLException {
		ConnectMongo monMongo = new ConnectMongo();
		
		boolean verif = monMongo.requeterecherche(null);
		if (verif == false) {
				System.out.println("echec requete");
			}else {
				System.out.println("reussite");
		}

		
		

	}

}
