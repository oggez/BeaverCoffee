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


/**
 * Mongo document database application
 * @author oskar, amar, kristofer, sara
 *
 */
public class Main {
	private MongoDatabase database;
	
	public Main() {
		MongoClientURI uri = new MongoClientURI("mongodb+srv://Kristofer:T3ST!@cluster-ffxml.mongodb.net/test");
		MongoClient mongoClient = new MongoClient(uri);
		database = mongoClient.getDatabase("BeaverCoffee");
	}
	
	/**
	 * Adds an order to the database
	 * @param brewedCoffee
	 * @param espresso
	 * @param latte
	 * @param cappuccino
	 * @param chocolate
	 * @param vanilla
	 * @param caramel
	 * @param irishCoffee
	 */
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
	
	/**
	 * Gets the orders from the database
	 * @return orders
	 */
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
	
	public void deleteOrder(Object id) {
		MongoCollection<Document> collection = database.getCollection("Orders");
		collection.deleteOne(new Document("_id", id));
	}
	
	/**
	 * Updates an order in the database
	 * @param id
	 * @param brewedCoffee
	 * @param espresso
	 * @param latte
	 * @param cappuccino
	 * @param chocolate
	 * @param vanilla
	 * @param caramel
	 * @param irishCoffee
	 */
	public void updateOrder(Object id, int brewedCoffee, int espresso, int latte, int cappuccino,
			int chocolate, int vanilla, int caramel, int irishCoffee) {
		
		MongoCollection<Document> collection = database.getCollection("Orders");
		Bson filter = new Document().append("_id", id);
		
		Document newValue = new Document();
		
		if(brewedCoffee != 0) {
			newValue.append("brewedCoffee", brewedCoffee);
		}
		if(espresso != 0) {
			newValue.put("espresso", espresso);
		}
		if(latte != 0) {
			newValue.put("latte", latte);
		}
		if(cappuccino != 0) {
			newValue.put("cappuccino", cappuccino);
		}
		if(chocolate != 0) {
			newValue.put("chocolate", chocolate);
		}
		if(vanilla != 0) {
			newValue.put("vanilla", vanilla);
		}
		if(caramel != 0) {
			newValue.put("caramel", caramel);
		}
		if(irishCoffee != 0) {
			newValue.put("irishCoffee", irishCoffee);
		}
		
		Bson updateOperationDocument = new Document("$set", newValue);
		collection.updateOne(filter, updateOperationDocument);
	}
	
	public void addEmployee(String name, String personnummer, String position, String start, String endDates, String fulltime) {
		MongoCollection<Document> collection = database.getCollection("Employees");
		Document document = new Document();
		if(!name.equals("")) {
			document.put("name", name);
		}
		if(!personnummer.equals("")) {
			document.put("personnummer", personnummer);
		}
		if(!position.equals("")) {
			document.put("position", position);
		}
		if(!start.equals("")) {
			document.put("start", start);
		}
		if(!endDates.equals("")) {
			document.put("endDates", endDates);
		}
		if(!fulltime.equals("")) {
			document.put("fulltime", fulltime);
		}

		collection.insertOne(document);
	}
	
	public ArrayList<Object[]> getEmployees(){
		MongoCollection<Document> collection = database.getCollection("Employees");
		MongoIterable<Document> list = collection.find();
		ArrayList<Object[]> arrayList = new ArrayList<Object[]>();
		for(Document i:list) {
			Object[] object = {i.get("_id"),i.get("name"),i.get("personnummer"),i.get("position"),
					i.get("start"),i.get("endDates"),i.get("fulltime")};
			arrayList.add(object);
		}
		
		return arrayList;
		
	}
	
	public void deleteEmployee(Object id) {
		MongoCollection<Document> collection = database.getCollection("Employees");
		collection.deleteOne(new Document("_id", id));
	}
	
	public void updateEmployee(Object id, String name, String personnummer, String position, String start, String endDates, String fulltime) {
		MongoCollection<Document> collection = database.getCollection("Employees");
		Bson filter = new Document().append("_id", id);
		
		Document newValue = new Document();
		
		if(!name.equals("")) {
			newValue.put("name", name);
		}
		if(!personnummer.equals("")) {
			newValue.put("personnummer", personnummer);
		}
		if(!position.equals("")) {
			newValue.put("position", position);
		}
		if(!start.equals("")) {
			newValue.put("start", start);
		}
		if(!endDates.equals("")) {
			newValue.put("endDates", endDates);
		}
		if(!fulltime.equals("")) {
			newValue.put("fulltime", fulltime);
		}
		
		Bson updateOperationDocument = new Document("$set", newValue);
		collection.updateOne(filter, updateOperationDocument);
	}
	
	
	
	
	public static void main(String [] args) {

		Main main = new Main();
		GUI gui = new GUI(main);
		
	}

}

