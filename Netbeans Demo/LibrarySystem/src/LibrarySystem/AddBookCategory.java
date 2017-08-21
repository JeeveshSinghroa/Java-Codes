/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;
import com.cal.library.helper.ConnectionManager;
import java.sql.*;
import javax.swing.JOptionPane;

    // Variables declaration - do not modify                     
/**
 *
 * @author Jeevesh
 */
public class AddBookCategory extends javax.swing.JInternalFrame {
    Connection c = null;
    PreparedStatement ps = null;
    /**
     * Creates new form AddBookCategory
     */
    public AddBookCategory() {
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
        txt_cat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Add Book Category");

        jLabel1.setText("Enter Category");

        jButton1.setText("Add");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton1)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jButton1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String b_cat = txt_cat.getText();
        String sql = "select * from master_tbl_book_cat where cname=?";
        try
        {
            c = ConnectionManager.getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1,b_cat);
            ResultSet rs = ps.executeQuery();
            boolean exist = false;
            while(rs.next())
            {
                exist = true;
            }
            if(exist)
            {
                JOptionPane.showMessageDialog(null, "Record already exists","Error" , 0);
            }else
            {
                String ins_sql = "insert into master_tbl_book_cat values(?)";
                ps = c.prepareStatement(ins_sql);
                ps.setString(1,b_cat);
                int n = ps.executeUpdate();
                if(n==1)
                {
                    JOptionPane.showMessageDialog(null, "Record succesfully inserted","Success", 1);
                    txt_cat.setText("");
                }
               
             }
         }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error " + e.getMessage(),"Error",0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_cat;
    // End of variables declaration//GEN-END:variables
}
