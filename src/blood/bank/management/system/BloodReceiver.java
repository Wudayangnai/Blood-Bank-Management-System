/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood.bank.management.system;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;

/**
 *
 * @author ACER
 */
public class BloodReceiver extends javax.swing.JFrame {

    /**
     * Creates new form BloodReceiver
     */
    public BloodReceiver() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_PAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_patientid = new javax.swing.JTextField();
        txt_PName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_Pgender = new javax.swing.JComboBox<>();
        cmb_Pgroup = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Phospital = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Pdatechooser = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txt_Pbunit = new javax.swing.JTextField();
        btn_adddonor = new javax.swing.JButton();
        btn_exitReceiver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("        Blood  Receiver DEtails");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 590, 70));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Patient  ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, 30));

        txt_PAge.setBackground(new java.awt.Color(204, 204, 204));
        txt_PAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_PAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PAgeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_PAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 60, 30));

        txt_patientid.setBackground(new java.awt.Color(204, 204, 204));
        txt_patientid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_patientid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_patientidActionPerformed(evt);
            }
        });
        getContentPane().add(txt_patientid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, 30));

        txt_PName.setBackground(new java.awt.Color(204, 204, 204));
        txt_PName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_PName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PNameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_PName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 60, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 30));

        cmb_Pgender.setBackground(new java.awt.Color(204, 204, 204));
        cmb_Pgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_Pgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        cmb_Pgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_PgenderActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_Pgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 160, -1));

        cmb_Pgroup.setBackground(new java.awt.Color(204, 204, 204));
        cmb_Pgroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_Pgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        cmb_Pgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_PgroupActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_Pgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 160, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Requested Blood Group");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 220, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Hospital Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 200, 40));

        txt_Phospital.setBackground(new java.awt.Color(204, 204, 204));
        txt_Phospital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Phospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PhospitalActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Phospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 160, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 90, 30));

        txt_Pdatechooser.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(txt_Pdatechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 160, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Requested Blood unit");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 200, 40));

        txt_Pbunit.setBackground(new java.awt.Color(204, 204, 204));
        txt_Pbunit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_Pbunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PbunitActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Pbunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 160, 40));

        btn_adddonor.setBackground(new java.awt.Color(102, 102, 102));
        btn_adddonor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_adddonor.setText("Submit");
        btn_adddonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adddonorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_adddonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 160, 40));

        btn_exitReceiver.setBackground(new java.awt.Color(102, 102, 102));
        btn_exitReceiver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exitReceiver.setText("Exit");
        btn_exitReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitReceiverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exitReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 440, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\My Java\\BloodBankLogos\\receiver.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PAgeActionPerformed

    private void txt_patientidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_patientidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_patientidActionPerformed

    private void txt_PNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PNameActionPerformed

    private void cmb_PgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_PgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_PgenderActionPerformed

    private void cmb_PgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_PgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_PgroupActionPerformed

    private void txt_PhospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PhospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PhospitalActionPerformed

    private void txt_PbunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PbunitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PbunitActionPerformed

    private void btn_adddonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adddonorActionPerformed
        // TODO add your handling code here:
        String dbloc = "jdbc:mysql://localhost/bloodbank";
        String dbUname = "root";
        String dbpw = "";
        String patientid =txt_patientid.getText();
        String  pname=txt_PName.getText();
        int page= Integer.parseInt(txt_PAge.getText());
        String pgender=(String)cmb_Pgender.getSelectedItem();
        String pbloodgroup=(String)cmb_Pgroup.getSelectedItem();
        int  pbloodunit= Integer.parseInt(txt_Pbunit.getText());
        String phospital=txt_Phospital.getText();
        SimpleDateFormat dateformat= new SimpleDateFormat("dd-MM-yyyy");
        String Pdate=dateformat.format(txt_Pdatechooser.getDate());

        String sql = ("INSERT INTO donor Values('"+patientid+"','"+pname+"','"+page+"','"+pgender+"','"+pbloodgroup+"','"+pbloodunit+"','"+phospital+"','"+Pdate+"')");

        try
        { Connection conn = DriverManager.getConnection(dbloc ,dbUname , dbpw);
            Statement st = conn.createStatement();
            int rowsUpdated = st.executeUpdate(sql);
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this," A New Blood Receiver Added successfully!");
                setVisible(false);

            }
        }
        catch(HeadlessException | SQLException ex)
        {
            System.out.println("Error! Try Again"+ex.getMessage());

        }
    }//GEN-LAST:event_btn_adddonorActionPerformed

    private void btn_exitReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitReceiverActionPerformed
        // TODO add your handling code here
        try
        {
            int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", javax.swing.JOptionPane.YES_NO_OPTION);
            if (confirm == javax.swing.JOptionPane.YES_OPTION)
            {
                Homepage hp=new Homepage();
                hp.setVisible(true);
                dispose();

            }
            if (confirm == javax.swing.JOptionPane.NO_OPTION)
            {
                new BloodReceiver().setVisible(true);
            }

        }
        catch(Exception e)
        {
            System.out.println("Error! Try Again" + e.getMessage());
        }

    }//GEN-LAST:event_btn_exitReceiverActionPerformed

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
            java.util.logging.Logger.getLogger(BloodReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodReceiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodReceiver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adddonor;
    private javax.swing.JButton btn_exitReceiver;
    private javax.swing.JComboBox<String> cmb_Pgender;
    private javax.swing.JComboBox<String> cmb_Pgroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_PAge;
    private javax.swing.JTextField txt_PName;
    private javax.swing.JTextField txt_Pbunit;
    private com.toedter.calendar.JDateChooser txt_Pdatechooser;
    private javax.swing.JTextField txt_Phospital;
    private javax.swing.JTextField txt_patientid;
    // End of variables declaration//GEN-END:variables
}
