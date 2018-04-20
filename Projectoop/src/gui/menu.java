package gui;

import command.*;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        lname1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bpayroll = new javax.swing.JButton();
        bsale = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setText("Saler :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(581, 10, 40, 14);

        name1.setText("11111111");
        name1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                name1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(name1);
        name1.setBounds(630, 10, 120, 14);

        lname1.setText("11111111111111");
        lname1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lname1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lname1);
        lname1.setBounds(730, 10, 160, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/menu.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 923, 290);

        bpayroll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/payrollmenu.png"))); // NOI18N
        bpayroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpayrollActionPerformed(evt);
            }
        });
        getContentPane().add(bpayroll);
        bpayroll.setBounds(560, 320, 250, 190);

        bsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/stock.png"))); // NOI18N
        bsale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaleActionPerformed(evt);
            }
        });
        getContentPane().add(bsale);
        bsale.setBounds(120, 320, 250, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/55555.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 280, 930, 300);

        setSize(new java.awt.Dimension(941, 624));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bsaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaleActionPerformed
        salepage sale = new salepage();
        this.setVisible(false);
        sale.setVisible(true);
    }//GEN-LAST:event_bsaleActionPerformed

    private void bpayrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpayrollActionPerformed
        price price = new price();
        this.setVisible(false);
        price.setVisible(true);
        test test=new test();
        test.cal();
        System.out.println("sal="+saler.getSal());
        System.out.println("com="+saler.getComm());
        System.out.println("tsal="+saler.getTsal());
    }//GEN-LAST:event_bpayrollActionPerformed

    private void name1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_name1AncestorAdded
        name1.setText(login.getName());
    }//GEN-LAST:event_name1AncestorAdded

    private void lname1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lname1AncestorAdded
        lname1.setText(login.getlanme());
    }//GEN-LAST:event_lname1AncestorAdded

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bpayroll;
    private javax.swing.JButton bsale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lname1;
    private javax.swing.JLabel name1;
    // End of variables declaration//GEN-END:variables
}
