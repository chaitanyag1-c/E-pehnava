/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_pehnava;

/**
 *
 * @author Chaitanya
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class paytm1 extends javax.swing.JFrame {

    /**
     * Creates new form paytm1
     */
    public paytm1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        l2 = new javax.swing.JTextField();
        l1 = new javax.swing.JTextField();
        t1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(812, 780));
        jPanel1.setPreferredSize(new java.awt.Dimension(812, 780));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("PAYMENT GATEWAY");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 20, 410, 40);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel4.setText(" By PayTm Gateway");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 150, 300, 40);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel5.setText("Dear customer please do a payment of Rs 1999");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 90, 540, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chaitanya\\Desktop\\qr.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 200, 360, 460);

        jButton1.setText("Cancel payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(350, 690, 170, 60);

        jButton2.setText("Payment Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(600, 690, 160, 60);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("Enter your phone Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 360, 240, 70);
        jPanel1.add(l2);
        l2.setBounds(10, 440, 200, 50);

        l1.setBackground(new java.awt.Color(0, 0, 0));
        l1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 102));
        l1.setText("Special Package");
        l1.setBorder(new javax.swing.border.MatteBorder(null));
        l1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1ActionPerformed(evt);
            }
        });
        jPanel1.add(l1);
        l1.setBounds(20, 300, 160, 40);

        t1.setFont(new java.awt.Font("Utsaah", 3, 18)); // NOI18N
        t1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chaitanya\\Desktop\\bgimage.jpeg")); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(0, 0, 820, 920);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

try
{
Class.forName("java.sql.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost/chiku","root","1234");
Statement s=c.createStatement();
String p=l1.getText();
String v=l2.getText();
int b=Integer.parseInt(v);

int d=s.executeUpdate("insert into e values('  "+p+"  ',"+b+ ")  ");
c.close();
    }                                        
catch(Exception e)
{
    e.printStackTrace();
    
}
JOptionPane.showMessageDialog(null,"Thank you for shopping with us");
int a=JOptionPane.showConfirmDialog(null,"Do you want to continue shopping with us");
if(a==0)
{
new home_page().setVisible(true);
dispose();
}
else
{
dispose();
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int a1=JOptionPane.showConfirmDialog(null,"Cancel transaction");
if(a1==0)
{
new home_page().setVisible(true);
dispose();
}
else
{
new paytm1().setVisible(true);
dispose();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void l1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l1ActionPerformed

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
            java.util.logging.Logger.getLogger(paytm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paytm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paytm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paytm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paytm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField l1;
    private javax.swing.JTextField l2;
    private javax.swing.JLabel t1;
    // End of variables declaration//GEN-END:variables
}
