package employee.payroll.management1;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;  // Declare the Statement object

    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Fix the JDBC URL (removed the extra slash after the port number)
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem", "root", "2004");
            s = c.createStatement();  // Initialize the Statement object
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

