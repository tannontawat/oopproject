
package command;

import java.sql.*;

abstract public class calcomm  {
   login login = new login();
    public float cal(){
        float com=(float) 0.0;
        try{
           String sql="select s.ProID,p.price,s.ID from sale as s,product as p where ID='"+login.ID+"';";
           Connection con =getconnection(); 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return com;
    }
    public Connection getconnection(){
         String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        try {
            Class.forName(driver);
            String url = "jdbc:sqlserver://sirtanoop.database.windows.net:1433;database=oop;user=admin1@sirtanoop;password=password1*;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            con = DriverManager.getConnection(url);
            System.out.println("Database connected.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
