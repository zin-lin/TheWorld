package com.napier.world;

import com.napier.world.mongo.MongoIntegration;

public class Application {
    public static  void main (String args []){
        System.out.println("Hello DevOps 13");
        MongoIntegration.integrate(); // Call to Build and View the Database
    }
}