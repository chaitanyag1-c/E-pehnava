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
import javax.swing.JOptionPane;
import java.sql.*;
public class paytm2 extends javax.swing.JFrame {

    /**
     * Creates new form paytm2
     */
    public paytm2() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 810));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Dear Customer please do a payment of Rs 3398");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 100, 570, 60);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("By PayTm Gateway");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 180, 210, 60);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("PAYMENT GATEWAY");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 10, 360, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chaitanya\\Desktop\\qr.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 130, 380, 530);

        jButton1.setText("PAYMENT DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 700, 160, 60);

        jButton2.setText("Cancel Payment");
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 700, 150, 60);

        a1.setBackground(new java.awt.Color(0, 0, 0));
        a1.setForeground(new java.awt.Color(0, 255, 255));
        a1.setText("Both Package");
        jPanel1.add(a1);
        a1.setBounds(70, 330, 110, 30);

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jPanel1.add(a2);
        a2.setBounds(39, 510, 190, 70);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Enter Phone Number");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 430, 280, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chaitanya\\Desktop\\bgimage.jpeg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 840, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

try
{
Class.forName("java.sql.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost/chiku","root","1234");
Statement s=c.createStatement();
String p=a1.getText();
String v=a2.getText();
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
            java.util.logging.Logger.getLogger(paytm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paytm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paytm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paytm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paytm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
