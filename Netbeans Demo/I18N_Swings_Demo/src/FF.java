
import common.Constant;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FF.java
 *
 * Created on Mar 8, 2012, 9:24:07 PM
 */

/**
 *
 * @author ITS-KKR
 */
public class FF extends javax.swing.JFrame {

    /** Creates new form FF */
    public FF() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Select Language---", "EN", "VI", "FR" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here
        String language ="";
        String locale = (String) jComboBox1.getSelectedItem();

        if(locale.equals("EN")) 
        {
            language = "English";
            Constant.LANGUAGE=0;
             JOptionPane.showMessageDialog(this,"You Selected "+language+"Language");
        } else if (locale.equals("VI")) {
            language = "Vietman";
            
            Constant.LANGUAGE=1;
             JOptionPane.showMessageDialog(this,"You Selected "+language+"Language");
        } else if(locale.equals("FR")) {
            language = "France";
            Constant.LANGUAGE=2;
             JOptionPane.showMessageDialog(this,"You Selected "+language+"Language");
        }
        
       
        new I18NLoginForm().setVisible(true);
        dispose();
        //        if(Constant.LANGUAGE==0)
        //        {
        //            Constant.LANGUAGE=1;
        //        }
        //        else if(Constant.LANGUAGE==1)
        //        {
        //            Constant.LANGUAGE=0;
        //        }

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables

}
