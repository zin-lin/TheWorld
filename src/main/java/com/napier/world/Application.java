package com.napier.world;

import java.util.ArrayList;

public class Application {
    public static  void main (String []args ){
        System.out.println("Hello DevOps 13");
        SqlConnection sqlConnection = new SqlConnection(); // Call to Build and View the Database
        sqlConnection.connect();
        ArrayList<Employee> emp = sqlConnection.getAllSalaries();
        // Display results
        for (Employee employee: emp)
            System.out.println(employee);
        // Disconnect from database

        sqlConnection.disconnect();

    }
}