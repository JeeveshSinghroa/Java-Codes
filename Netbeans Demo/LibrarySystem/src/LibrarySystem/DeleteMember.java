/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;
import java.sql.*;
import com.cal.library.helper.ConnectionManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Jeevesh
 */
public class DeleteMember extends javax.swing.JInternalFrame {
    Connection c = null;
    PreparedStatement ps = null;
    /**
     * Creates new form DeleteMember
     */
    public DeleteMember() {
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Delete Member");

        jLabel1.setText("Member ID");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(69, 69, 69)
                .addComponent(jButton1)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int mid = Integer.parseInt(jTextField1.getText());
        int reply = JOptionPane.showConfirmDialog(null,"Are you sure?");
        if(reply == JOptionPane.YES_OPTION)
        {
            String sql = "delete from master_tbl_member where mid=?";
            try
            {
                c = ConnectionManager.getConnection();
                ps = c.prepareStatement(sql);
                ps.setInt(1, mid);
                int n = ps.executeUpdate();
                if(n==1)
                {
                    JOptionPane.showMessageDialog(null, "Member succesfully deleted","Information",1);
                    jTextField1.setText("");
                }else
                {
                    JOptionPane.showMessageDialog(null,"Record does not exists","Error",0);
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Error "+ e.getMessage(),"Error",0);
            }
        }else
        {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}