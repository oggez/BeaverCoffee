package beaver;
import java.awt.List;
import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;


public class Main {
	
	public static void main(String [] args) {
		//T3ST!
//		MongoClientURI uri = new MongoClientURI(
//				"mongodb+srv://Kristofer:T3ST!@cluster-ffxml.mongodb.net/test");
//
//		MongoClient mongoClient = new MongoClient(uri);
//		MongoDatabase database = mongoClient.getDatabase("test");
////		database.createCollection("BEAVERTEST");
//		MongoCollection<Document> collection = database.getCollection("BEAVERTEST");
////		MongoClientURI uri = new MongoClientURI(
////				"mongodb+srv://Kristofer:T3ST!@cluster-ffxml.mongodb.net/test");
////
////		MongoClient mongoClient = new MongoClient(uri);
////		MongoDatabase database = mongoClient.getDatabase("test");
//////		database.createCollection("BEAVERTEST");
////		MongoCollection<Document> collection = database.getCollection("BEAVERTEST");
////		Document document = new Document();
////		document.put("name", "Oskar");
////		document.put("company", "Test");
////		collection.insertOne(document);
//		
//		//Find document
//		BasicDBObject searchQuery = new BasicDBObject();
//		searchQuery.put("name", "Oskar");
//		MongoIterable<Document> list = collection.find(searchQuery);
//		for(Document i:list) {
//			System.out.println(i);
//		}
//
////		BasicDBObject searchQuery = new BasicDBObject();
////		searchQuery.put("name", "Oskar");
////		MongoIterable<Document> list = collection.find(searchQuery);
////		for(Document i:list) {
////			System.out.println(i);
////		}
////		database.drop();
//		mongoClient.close();
////		mongoClient.close();
		
		Main main = new Main();
		GUI gui = new GUI(main);
		
	}

}

