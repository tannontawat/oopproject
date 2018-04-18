package command;
import java.sql.*;
abstract public class saler implements connectDB   {
    private static String ID,Name,lname,Password;
    private static float sal;
    private static float comm,tsal;
    
    public Connection getConnection(){
        
    }
    
    public saler(){
        
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