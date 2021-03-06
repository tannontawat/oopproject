package command;

import java.sql.*;
import gui.*;

public class login extends saler implements checkLOgin {

    String id, password;
    private boolean check = false;
    Connection con=null;

    public login() {
        
    }

    public login(String id, String password) {
        super();//super()
        this.id = id;
        this.password = password;
        check();
    }

    public void check() {
        String sql = "select* from saler";
        try {
            this.con = super.con;
            Statement stm = this.con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
                super.con.close();
                this.con=null;
            } else {
                System.out.println("Incorrect");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setopen(boolean c) {
        this.check = c;
    }

    public boolean getopen() {
        return this.check;
    }
    
    public void ClearData(){
        super.setID(null);
        super.setPassword(null);
        super.setName(null);
        super.setLname(null);
        super.setSal(0);
        super.setComm(0);
        super.setTsal(0);
    }

}
