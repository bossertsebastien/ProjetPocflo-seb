package connexiondbMongoDb;

import java.sql.SQLException;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;


public class ConnectMongo {
	
	java.sql.Connection co = null;
	MongoDatabase mongodb = null;
	MongoClient mongoClient=null;
	
	

	public ConnectMongo() throws SQLException {
		
//			try {
//				String url = "mongodb://obiwan2.univ-brest.fr:27017/BDMongomaster005";
//				String user = "master005";
//				String passwd = "r35fi4k9";
//				co =  DriverManager.getConnection(url,user,passwd);
//				System.out.println("Connection reussi");
//			} catch (SQLException e) {
//				System.out.println("Fail connection");
//				e.printStackTrace();
//			}
		
			MongoClientURI connectionString = new MongoClientURI("mongodb://obiwan2.univ-brest.fr:27017");
			mongoClient = new MongoClient(connectionString);
			mongodb = getmongoClient().getDatabase("BDServletInfo");
//			MongoCollection<Document> collection = mongodb.getCollection("oeuvres");
////			Document myDoc = collection.find().first();
//			System.out.println(myDoc.toJson());
			

	}
	
	public boolean requeterecherchepages(String profil) {
		DBCollection collection = (DBCollection) getmongodb().getCollection("urlprofil");
		
		 try {
			 
			 BasicDBObject fields = new BasicDBObject();
			 fields.put("profil", profil);

			 DBCursor cursor = collection.find(fields);
			 while (cursor.hasNext()) {
			 	System.out.println(cursor.next());
			 }
			
		     return true;
		     
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
			 return false;
		 }
	     
	        
	}
	
	public MongoDatabase getmongodb() {
		return mongodb;
	}
	public MongoClient getmongoClient() {
		return mongoClient;
	}
}
