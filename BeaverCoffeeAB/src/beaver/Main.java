package beaver;
import java.awt.List;
import java.util.ArrayList;

import org.bson.Document;
import org.bson.conversions.Bson;

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
	private MongoDatabase database;
	public Main() {
		MongoClientURI uri = new MongoClientURI("mongodb+srv://Kristofer:T3ST!@cluster-ffxml.mongodb.net/test");
		MongoClient mongoClient = new MongoClient(uri);
		database = mongoClient.getDatabase("BeaverCoffee");
		
	}
	
	public void addOrder(int brewedCoffee, int espresso, int latte, int cappuccino,
			int chocolate, int vanilla, int caramel, int irishCoffee) {
		MongoCollection<Document> collection = database.getCollection("Orders");
		Document document = new Document();
		if(brewedCoffee != 0) {
			document.put("brewedCoffee", brewedCoffee);
		}
		if(espresso != 0) {
		document.put("espresso", espresso);
		}
		if(latte != 0) {
		document.put("latte", latte);
		}
		if(cappuccino != 0) {
		document.put("cappuccino", cappuccino);
		}
		if(chocolate != 0) {
		document.put("chocolate", chocolate);
		}
		if(vanilla != 0) {
		document.put("vanilla", vanilla);
		}
		if(caramel != 0) {
		document.put("caramel", caramel);
		}
		if(irishCoffee != 0) {
		document.put("irishCoffee", irishCoffee);
		}
		
		collection.insertOne(document);
	}
	
	public ArrayList<Object[]> getOrders(){
		MongoCollection<Document> collection = database.getCollection("Orders");
		MongoIterable<Document> list = collection.find();
		ArrayList<Object[]> arrayList = new ArrayList<Object[]>();
		for(Document i:list) {
			Object[] object = {i.get("_id"),i.get("brewedCoffee"),i.get("espresso"),i.get("latte"),
					i.get("cappuccino"),i.get("chocolate"),i.get("vanilla"),
					i.get("caramel"),i.get("irishCoffee")};
			arrayList.add(object);
		}
		
		return arrayList;
		
	}
	
	public void updateOrder(Object id, int brewedCoffee, int espresso, int latte, int cappuccino,
			int chocolate, int vanilla, int caramel, int irishCoffee) {
		
		MongoCollection<Document> collection = database.getCollection("Orders");
		Bson filter = new Document().append("_id", id);
		Bson newValue = new Document().append("brewedCoffee", brewedCoffee).append("espresso", espresso).append("latte", latte)
				.append("cappuccino", cappuccino).append("chocolate", chocolate).append("vanilla", vanilla).append("caramel", caramel)
				.append("irishCoffee", irishCoffee);
		Bson updateOperationDocument = new Document("$set", newValue);
		collection.updateOne(filter, updateOperationDocument);
	}
	
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

