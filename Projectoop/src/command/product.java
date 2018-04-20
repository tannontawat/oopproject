package command;

import java.sql.*;

public class product {
    private String ProID,Name,type; 
    private float  price;

    public product() {
        
    }
    
    public void setProId(String proid){
        this.ProID=proid;
    }
    public  String getProId(){
        return this.ProID;
    }
    
    public void setName(String name){
        this.Name=name;
    }
    public String getName(){
        return this.Name;
    }
    
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    
    public void setPrice(float price){
        this.price=price;
    }
    public float getPrice(){
        return this.price;
    }
    
    public Connection getconnection() {
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