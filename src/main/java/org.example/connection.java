package org.example;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class connection {

    Connection c;
    Statement s;

    public connection()
    {

        try
        {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "shi@123khu@45");
            s = c.createStatement();
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}

// why did we use try and catch exception handling here
//because mysql is an external entity here and there may be run time errors

// what is try
// this allows you to define a block of code to be tested for errors while it is being executed
//Catch
// allows you to define a block of code to be executed, if an error occurs in the try block

// Steps of creating the JDBC connection...connecting our classes to database so that every entry can be stored in the database
//1. Register the driver
//2. Create connection
//3. Create statement
//4. Execute the query
//5. close connection
