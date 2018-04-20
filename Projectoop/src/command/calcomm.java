package command;

import java.sql.*;

abstract public class calcomm extends saler {

    private Connection con = null;

    public calcomm() {

    }

    public void calcom() {
        this.con=getconnection();
        String sql = "select s.orderNO,s.ProID,p.price,s.ID from sale as s left join product as p on s.ProID=p.ProID where s.ID='" + super.getID() + "';";
        String sql2 = "select count(ID) from sale where ID='" + super.getID() + "';";
        float sale = (float) 0.00;
        float com = (float) 0.00;
        int count = 0;

        try {//count data row
            Statement stm = this.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql2);
            rs.first();
            count = rs.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Statement stm = this.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);
            rs.first();
            for (int i = 0; i < count; i++) {
                sale = sale + rs.getFloat(3);
                rs.next();
            }
            com = (float) (sale * 0.03);
            
            super.setComm(com);
            
            super.setTsal((super.getSal() + super.getComm()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private Connection getconnection(){
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
        return con;
    }
}
