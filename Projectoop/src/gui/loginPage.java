package gui;

import command.*;
import javax.swing.JOptionPane;

public class loginPage extends javax.swing.JFrame {

    public loginPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        bcancel = new javax.swing.JButton();
        blogin = new javax.swing.JButton();
        txtpw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/ตรา.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 20, 200, 150);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 200, 41, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 260, 150, 30);
        getContentPane().add(txtid);
        txtid.setBounds(290, 190, 210, 40);

        bcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/ยกเลิก.PNG"))); // NOI18N
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });
        getContentPane().add(bcancel);
        bcancel.setBounds(130, 330, 130, 50);

        blogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/login.PNG"))); // NOI18N
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        getContentPane().add(blogin);
        blogin.setBounds(310, 330, 130, 50);
        getContentPane().add(txtpw);
        txtpw.setBounds(290, 250, 210, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/tttt.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 580, 400);

        setSize(new java.awt.Dimension(599, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bcancelActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        boolean a = true, c;
        do {
            login login = new login(txtid.getText(), txtpw.getText());
            c = login.getopen();
            if (c == true) {
                this.setVisible(false);
                menu menu = new menu();
                menu.setVisible(true);
                a = false;
            } else {
                JOptionPane.showMessageDialog(null,"Incorrect username or password.Please login again","Inane error",JOptionPane.ERROR_MESSAGE);
                txtid.setText(null);
                txtpw.setText(null);
            }
        } while (a = false);
    }//GEN-LAST:event_bloginActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancel;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtpw;
    // End of variables declaration//GEN-END:variables
}
