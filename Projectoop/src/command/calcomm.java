package command;

import java.sql.*;

abstract public class calcomm extends saler implements connectDB {
    public void calcom(){
        String sql;
        float sale;
        try{
            Connection con = getconnection();
            Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=stm.executeQuery(sql);
            rs.first();
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
