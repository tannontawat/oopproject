package command;

import java.sql.*;
import gui.*;

public class login extends saler implements CheckLogin, connectDB {

    String id, password;
    private boolean check = false;
    Connection con;

    public login() {

    }

    public login(String id, String password) {
        this.id = id;
        this.password = password;
        check();
    }

    public void check() {
        String sql = "select* from saler";
        try {
            con = getconnection();
            Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);
            rs.first();
            checklogin(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void checklogin(ResultSet rs) {
        boolean c = false;
        try {
            do {
                if (!this.id.equals(rs.getString(1))) {
                    rs.next();
                } else {
                    break;
                }
            } while (!this.id.equals(rs.getString(1)));
            if (this.password.equals(rs.getString(2))) {
                System.out.println("Welcome");
                super.setID(this.id);
                super.setPassword(this.password);;
                super.setName(rs.getString(3));
                super.setLname(rs.getString(4));
                super.setSal(rs.getFloat(5));
                super.setComm(rs.getFloat(6));
                super.setTsal(rs.getFloat(7));
                c = true;
                setopen(c);
                con.close();
            } else {
                System.out.println("Incorrect");
            }
        } catch (Exception e) {
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

    private void setopen(boolean c) {
        this.check = c;
    }

    public boolean getopen() {
        return this.check;
    }

}
