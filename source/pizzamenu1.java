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
public class pizzamenu1 extends javax.swing.JFrame {
Connection c = null;
Statement s = null;
ResultSet r = null;
    /**
     * Creates new form pizzamenu1
     */
    public pizzamenu1() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 450));
        getContentPane().setLayout(null);

        cb1.setBackground(new java.awt.Color(0, 0, 0));
        cb1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        cb1.setForeground(new java.awt.Color(255, 255, 255));
        cb1.setText("Deluxe Paneer");
        getContentPane().add(cb1);
        cb1.setBounds(60, 350, 180, 31);

        cb2.setBackground(new java.awt.Color(0, 0, 0));
        cb2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        cb2.setForeground(new java.awt.Color(255, 255, 255));
        cb2.setText("Mexican Wave");
        getContentPane().add(cb2);
        cb2.setBounds(330, 350, 180, 37);

        cb3.setBackground(new java.awt.Color(0, 0, 0));
        cb3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        cb3.setForeground(new java.awt.Color(255, 255, 255));
        cb3.setText("Paneer Capsicum");
        getContentPane().add(cb3);
        cb3.setBounds(590, 350, 220, 37);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("More Options");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(660, 20, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("pizza1.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
        Class.forName("java.sql.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost/pizza_paradise", "root", "12345");
        s = c.createStatement();
       String query = "Select*from customer;";
        r = s.executeQuery(query);
        r.last();
        String i;
        i = r.getString("order_no");
       
        int num=Integer.parseInt(i);
        num=num+1;
        int pizza_amt=0;
        if(cb1.isSelected())
            pizza_amt=pizza_amt+300;
        if(cb2.isSelected())
            pizza_amt=pizza_amt+500;
        if(cb3.isSelected())
            pizza_amt=pizza_amt+400;
        
        String query1 = "insert into order_details values("+num+","+pizza_amt+",null,null,null);";
        s.executeUpdate(query1);
    
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
        this.setVisible(false);
new pizzamenu2().setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pizzamenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pizzamenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pizzamenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pizzamenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizzamenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}