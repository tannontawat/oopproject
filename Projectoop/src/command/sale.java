package command;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sale extends product {
    public String proi;
    public ResultSet rs;
    
    public sale() {

    }
    
    public sale(String proid){
        this.proi=proid;
    }

    public void search() {
        try {
            Connection con = super.getconnection();
            String sql = "select * from product where ProID='" +this.proi+ "'";
            Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
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
            e.printStackTrace();
        }
    }
    
    public void record(String sql){ 
        try {
            Connection con = super.getconnection();
            Statement stm=con.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(sale.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}