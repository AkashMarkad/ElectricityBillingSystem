package Electricity.Billing.System;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///ElectricityBillingSystem","root","mysql@123");
            s =c.createStatement();
            System.out.println("Connected");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}

