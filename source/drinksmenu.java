import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class drinksmenu extends javax.swing.JFrame {
Connection c = null;
Statement s = null;
ResultSet r = null;
    /**
     * Creates new form drinksmenu
     */
    public drinksmenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 500));
        getContentPane().setLayout(null);

        cb1.setBackground(new java.awt.Color(0, 0, 0));
        cb1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cb1.setForeground(new java.awt.Color(255, 255, 255));
        cb1.setText("Pepsi(250ml)");
        getContentPane().add(cb1);
        cb1.setBounds(50, 380, 130, 30);

        cb2.setBackground(new java.awt.Color(0, 0, 0));
        cb2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cb2.setForeground(new java.awt.Color(255, 255, 255));
        cb2.setText("Water (500 ml)");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2);
        cb2.setBounds(190, 380, 150, 30);

        cb3.setBackground(new java.awt.Color(0, 0, 0));
        cb3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cb3.setForeground(new java.awt.Color(255, 255, 255));
        cb3.setText("Cola(250 ml)");
        getContentPane().add(cb3);
        cb3.setBounds(360, 380, 130, 30);

        cb4.setBackground(new java.awt.Color(0, 0, 0));
        cb4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cb4.setForeground(new java.awt.Color(255, 255, 255));
        cb4.setText("Mirinda(250 ml)");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        getContentPane().add(cb4);
        cb4.setBounds(500, 380, 150, 30);

        cb5.setBackground(new java.awt.Color(0, 0, 0));
        cb5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cb5.setForeground(new java.awt.Color(255, 255, 255));
        cb5.setText("Iced Tea(250 ml)");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });
        getContentPane().add(cb5);
        cb5.setBounds(660, 380, 160, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(740, 10, 80, 31);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 80, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("drinks.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 840, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
        Class.forName("java.sql.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost/pizza_paradise", "root", "12345");
        s = c.createStatement();
       String query = "Select*from order_details;";
        r = s.executeQuery(query);
        r.last();
        String i;
        i = r.getString("order_no");
        int num=Integer.parseInt(i);
        int drinks_amt = 0;
        if(cb1.isSelected())
            drinks_amt=drinks_amt+40;
        if(cb2.isSelected())
            drinks_amt=drinks_amt+40;
        if(cb3.isSelected())
            drinks_amt=drinks_amt+40;
        if(cb4.isSelected())
            drinks_amt=drinks_amt+40;
        if(cb5.isSelected())
            drinks_amt=drinks_amt+40;
        
        String query1 = "update order_details set drinks_amt="+drinks_amt+" where order_no="+num+";";
        s.executeUpdate(query1);
       
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
        this.setVisible(false);
new snacksmenu().setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
new pizzamenu2().setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(drinksmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drinksmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drinksmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drinksmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drinksmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}