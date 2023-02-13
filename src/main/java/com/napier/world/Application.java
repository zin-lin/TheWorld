package com.napier.world;

public class Application {
    public static  void main (String []args ){
        System.out.println("Hello DevOps 13");
        SqlConnection sqlConnection = new SqlConnection(); // Call to Build and View the Database
        sqlConnection.connect();
        Employee emp = sqlConnection.getEmployee(255530);
        // Display results
        sqlConnection.displayEmployee(emp);

        // Disconnect from database
        sqlConnection.disconnect();
    }
}