package Hotel.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection con;
    Statement statement;
    String a="use HotelMS";
    String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS HotelMS" ;

    
    public  conn() {
        try {   
             con=   DriverManager.getConnection("jdbc:mysql://localhost:3306","root","D2005");
    
       statement=con.createStatement();
       statement.executeUpdate(createDatabaseSQL);
       statement.execute(a);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
