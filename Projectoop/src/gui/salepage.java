
package gui;

import command.*;
import javax.swing.table.*;
public class salepage extends javax.swing.JFrame {
    DefaultTableModel model;
    private int row =0;
    private int orderno=1;
    sale sale;
    public salepage() {
        initComponents();
        String col[]={"Product ID","Product Name","Price","Type"};
        model =new DefaultTableModel(col,0);
        table.setModel(model);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        badd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txt1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        lname2 = new javax.swing.JLabel();
        bcancel = new javax.swing.JButton();
        bsale = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        badd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/666.png"))); // NOI18N
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        getContentPane().add(badd);
        badd.setBounds(710, 50, 151, 73);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 660, 73, 23);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 150, 790, 440);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1);
        txt1.setBounds(260, 50, 390, 70);

        jLabel3.setText("Saler :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(560, 10, 40, 20);

        name2.setText("11111");
        name2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                name2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(name2);
        name2.setBounds(611, 10, 140, 20);

        lname2.setText("1111");
        lname2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lname2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lname2);
        lname2.setBounds(761, 10, 160, 20);

        bcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/ลล.PNG"))); // NOI18N
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });
        getContentPane().add(bcancel);
        bcancel.setBounds(70, 620, 250, 100);

        bsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/sale1.png"))); // NOI18N
        bsale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaleActionPerformed(evt);
            }
        });
        getContentPane().add(bsale);
        bsale.setBounds(620, 620, 250, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("รหัสสินค้า");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 50, 170, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/55555.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 923, 735);

        setSize(new java.awt.Dimension(943, 783));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        sale=new sale(txt1.getText());
        //sale.sale();
        sale.search();
        model.addRow(new Object[0]);
        try{
            model.setValueAt(sale.rs.getString(1),row,0);
            model.setValueAt(sale.rs.getString(2),row,1);
            model.setValueAt(sale.rs.getString(3),row,2);
            model.setValueAt(sale.rs.getString(4),row,3);
            row++;
            txt1.setText(null);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_baddActionPerformed

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tableAncestorAdded

    private void bsaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaleActionPerformed
        String sql;
        for(int i=0;i<table.getRowCount();i++){
            sql="insert into sale(orderNo,ProID,ID) values('"+orderno+"','"+model.getValueAt(i,0)+"','"+login.getID()+"')";
            sale.record(sql);
        }
        orderno++;
        String col[] = {"Pro ID", "Name", "Price", "Type"};
        model = new DefaultTableModel(col, 0);
        table.setModel(model);
        row=0;
    }//GEN-LAST:event_bsaleActionPerformed

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        String col[] = {"Pro ID", "Name", "Price", "Type"};
        model = new DefaultTableModel(col, 0);
        table.setModel(model);
        row=0;
    }//GEN-LAST:event_bcancelActionPerformed

    private void name2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_name2AncestorAdded
        name2.setText(saler.getName());
    }//GEN-LAST:event_name2AncestorAdded

    private void lname2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lname2AncestorAdded
       lname2.setText(login.getlanme());  
    }//GEN-LAST:event_lname2AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu menu = new menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(salepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bsale;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lname2;
    private javax.swing.JLabel name2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
