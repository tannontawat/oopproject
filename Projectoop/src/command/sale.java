package command;

import java.sql.*;
import javax.swing.JOptionPane;

public class sale extends product implements search {

    public String proi;
    public ResultSet rs;
    public Connection con;

    public sale() {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Connection con = null;
        try {
            Class.forName(driver);
            String url = "jdbc:sqlserver://sirtanoop.database.windows.net:1433;database=oop;user=admin1@sirtanoop;password=password1*;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            con = DriverManager.getConnection(url);
            System.out.println("Database connected.");
            this.con = con;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public sale(String proid) {
        this(); //this()
        super.setProId(proid);
    }

    public void search() {
        try {
            String sql = "select * from product where ProID='" + super.getProId() + "'";
            Statement stm = this.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            rs.first();
            do {
                if (!this.proi.equals(rs.getString(1))) {
                    rs.next();
                } else {
                    super.setProId(rs.getString(1));
                    super.setName(rs.getString(2));
                    super.setPrice(rs.getFloat(3));
                    super.setType(rs.getString(4));
                    break;
                }
            } while (!this.proi.equals(rs.getString(1)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Cannot fidn product. Please find again.","Inane error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void record(String sql) {
        try {
            Statement stm = this.con.createStatement();
            stm.executeUpdate(sql);
            test t = new test();
            t.cal(); // to test for cal commission
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
