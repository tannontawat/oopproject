package command;
import java.sql.*;
abstract public class saler   {
    private static String ID,Name,lname,Password;
    private static float sal;
    private static float comm,tsal;
    public Connection con=null;
    
    public saler(){
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        try {
            Class.forName(driver);
            String url = "jdbc:sqlserver://sirtanoop.database.windows.net:1433;database=oop;user=admin1@sirtanoop;password=password1*;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            con = DriverManager.getConnection(url);
            System.out.println("Database connected.");
            this.con=con;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setID(String ID){
        saler.ID=ID;
    }
    public static String getID(){
        return saler.ID;
    }
    
    public void setName(String name){
        saler.Name=name;
    }
    public static String getName(){
        return saler.Name;
    }
    
    public void setLname(String lname){
        saler.lname=lname;
    }
    public static String getlanme(){
        return saler.lname;
    }
    
    public void setPassword(String pw){
        saler.Password=pw;
    }
    public static String getPassword(){
        return saler.Password;
    }
    
    public void setSal(float sal){
        saler.sal=sal;
    }
    public static float getSal(){
        return saler.sal;
    }
    
    public void setComm(float comm){
        saler.comm=comm;
    }
    public static float getComm(){
        return saler.comm;
    }
    
    public void setTsal(float tsal){
        saler.tsal=tsal;
    }
    public static float getTsal(){
        return saler.tsal;
    }
}