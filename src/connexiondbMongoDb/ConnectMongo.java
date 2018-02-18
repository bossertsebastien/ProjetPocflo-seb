package connexiondbMongoDb;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bson.Document;

import com.dbschema.MongoPreparedStatement;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
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
			mongodb = getmongoClient().getDatabase("BDMongomaster005");
//			MongoCollection<Document> collection = mongodb.getCollection("oeuvres");
////			Document myDoc = collection.find().first();
//			System.out.println(myDoc.toJson());
			

	}
	
	public boolean requeterecherche(DBCursor requetemongo) {
		MongoCollection<Document> collection = getmongodb().getCollection("oeuvres");
		 try {
			 
			 MongoCursor<Document> cursor = collection.find().iterator();
			 while (cursor.hasNext()) {
				 Document obj = cursor.next();
				 System.out.println(obj.toJson());
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
