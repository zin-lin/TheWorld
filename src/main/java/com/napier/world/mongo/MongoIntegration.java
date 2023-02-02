package com.napier.world.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoIntegration {
    public static void integrate(){
        MongoClient mongoClient = new MongoClient("localhost", 27000); //Get the Client read, exposed at 270000 Mongo-reserved
        // Get a database - will create when we use it
        MongoDatabase database = mongoClient.getDatabase("mydb");
        // Get a collection from the database, will set up not exists/#ifndef->define
        MongoCollection<Document> collection = database.getCollection("test");
        // Create a document to store
        Document doc = new Document("name", "Kevin Sim")
                .append("class", "Software Engineering Methods")
                .append("year", "2021")
                .append("result", new Document("CW", 95).append("EX", 85));
        // Add document to collection
        collection.insertOne(doc);

        // Check document in collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}
