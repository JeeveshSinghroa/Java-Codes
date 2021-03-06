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
public class DeleteMemberCategory extends javax.swing.JInternalFrame {
    Connection c = null;
    PreparedStatement ps = null;
    /**
     * Creates new form DeleteMemberCategory
     */
    public DeleteMemberCategory() {
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
        setTitle("Delete Member Category");

        jLabel1.setText("Member Category");

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
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cat = jTextField1.getText();
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(reply == JOptionPane.YES_OPTION)
        {
            String sql ="delete from master_tbl_member_cat where cname=?";
            try
            {
                c = ConnectionManager.getConnection();
                ps = c.prepareStatement(sql);
                ps.setString(1,cat);
                int n = ps.executeUpdate();
                if(n==1)
                {
                    JOptionPane.showMessageDialog(null,"Category succesfully deleted","Information",1);
                    jTextField1.setText("");
                }else
                {
                    JOptionPane.showMessageDialog(null,"Record does not exists","Error",0);
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error "+ e.getMessage(),"Error",0);
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
