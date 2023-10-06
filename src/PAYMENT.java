//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Project.ConncetionProvider;
import static java.lang.String.valueOf;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gagan
 */
public class PAYMENT extends javax.swing.JFrame {

    /**
     * Creates new form PAYMENT
     */
    public PAYMENT() {
        initComponents();
      
        DefaultTableModel model=( DefaultTableModel)jTablePAYMENT.getModel();
        
        try
                {
                     Connection con=ConncetionProvider.getCon();
						String query="select * from PAYMENT";
						PreparedStatement pst1=con.prepareStatement(query);
						ResultSet rs=pst1.executeQuery();
                    
                    while(rs.next())
                    {
                       model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                    }
                    
                }
            catch(Exception e)
                    {
                        
                    }
     DefaultTableModel mode2=( DefaultTableModel)jTableCUSTOMER.getModel();
        
        try
                {
                     Connection con=ConncetionProvider.getCon();
						String query="select CUSTOMER_ID,CUSTOMER_NAME from CUSTOMER";
						PreparedStatement pst1=con.prepareStatement(query);
						ResultSet rs=pst1.executeQuery();
                    
                    while(rs.next())
                    {
                       mode2.addRow(new Object[]{rs.getString(1),rs.getString(2)});
                    }
                    
                }
            catch(Exception e)
                    {
                        
                    }
        
        
        
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPAYMENTID = new javax.swing.JLabel();
        jComboBoxPAYMENTMODE = new javax.swing.JComboBox<>();
        jLabelPAYMENTMODE = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPAYMENTID = new javax.swing.JTextField();
        jTextFieldTOTALPRICE = new javax.swing.JTextField();
        jTextFieldCID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePAYMENT = new javax.swing.JTable();
        jButtonFETCHPRICE = new javax.swing.JButton();
        jButtonVIEW = new javax.swing.JButton();
        jButtonRESET = new javax.swing.JButton();
        jButtonDELETE = new javax.swing.JButton();
        jButtonEXIT = new javax.swing.JButton();
        jButtonADD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCUSTOMER = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPAYMENTID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPAYMENTID.setText("PAYMENT ID");
        getContentPane().add(jLabelPAYMENTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jComboBoxPAYMENTMODE.setBackground(new java.awt.Color(255, 255, 204));
        jComboBoxPAYMENTMODE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", " " }));
        jComboBoxPAYMENTMODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPAYMENTMODEActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxPAYMENTMODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        jLabelPAYMENTMODE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPAYMENTMODE.setText("PAYMENTMODE");
        getContentPane().add(jLabelPAYMENTMODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TOTAL PRICE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 111, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CUSTOMER ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jTextFieldPAYMENTID.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jTextFieldPAYMENTID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, -1));

        jTextFieldTOTALPRICE.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jTextFieldTOTALPRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 200, -1));

        jTextFieldCID.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jTextFieldCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 200, -1));

        jTablePAYMENT.setBackground(new java.awt.Color(255, 255, 204));
        jTablePAYMENT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTablePAYMENT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER_ID", "PAYMENT_ID", "MODE_OF_PAYMENT", "TOTALPRICE"
            }
        ));
        jScrollPane1.setViewportView(jTablePAYMENT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, 320));

        jButtonFETCHPRICE.setBackground(new java.awt.Color(255, 255, 204));
        jButtonFETCHPRICE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFETCHPRICE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fetch.png"))); // NOI18N
        jButtonFETCHPRICE.setText("FETCH PRICE");
        jButtonFETCHPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFETCHPRICEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFETCHPRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        jButtonVIEW.setBackground(new java.awt.Color(255, 255, 204));
        jButtonVIEW.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVIEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.png"))); // NOI18N
        jButtonVIEW.setText("VIEW");
        jButtonVIEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVIEWActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVIEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, -1, -1));

        jButtonRESET.setBackground(new java.awt.Color(255, 255, 204));
        jButtonRESET.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset.png"))); // NOI18N
        jButtonRESET.setText("RESET");
        jButtonRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRESETActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, -1, -1));

        jButtonDELETE.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDELETE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButtonDELETE.setText("DELETE");
        jButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELETEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, -1, -1));

        jButtonEXIT.setBackground(new java.awt.Color(255, 255, 204));
        jButtonEXIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit1.png"))); // NOI18N
        jButtonEXIT.setText("EXIT");
        jButtonEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXITActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 460, -1, -1));

        jButtonADD.setBackground(new java.awt.Color(255, 255, 204));
        jButtonADD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment.png"))); // NOI18N
        jButtonADD.setText("PAY");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, 30));

        jTableCUSTOMER.setBackground(new java.awt.Color(255, 255, 204));
        jTableCUSTOMER.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableCUSTOMER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER_ID", "CUSTOMER_NAME"
            }
        ));
        jScrollPane2.setViewportView(jTableCUSTOMER);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 370, 320));

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel1.setText("PAYMENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel2.setText("CUSTOMER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/123456 - Copy.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRESETActionPerformed
        // TODO add your handling code here:
                        jTextFieldCID.setText(null);
			jTextFieldPAYMENTID.setText(null);
			jTextFieldTOTALPRICE.setText(null);
                        jTextFieldCID.setText(null);
                        
                        
    }//GEN-LAST:event_jButtonRESETActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        // TODO add your handling code here:
                                   String PAYMENTID = jTextFieldPAYMENTID.getText();
				   String PAYMENTMODE = (String)jComboBoxPAYMENTMODE.getSelectedItem();
                                
				   String CID = jTextFieldCID.getText();
                                   String TOTALPRICE=jTextFieldTOTALPRICE.getText();
                                  
				    try {
				        Class.forName("oracle.jdbc.driver.OracleDriver");
				        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","disha","gagan");
				        
				        String sql = "Insert Into payment(PAYMENT_ID,MODE_OF_PAYMENT,TOTALPRICE,CUSTOMER_ID) values('"+PAYMENTID+"','"+PAYMENTMODE+"','"+TOTALPRICE+"','"+CID+"')";
				        PreparedStatement pst=con.prepareStatement(sql);
				        ResultSet rs=pst.executeQuery();
				        JOptionPane.showMessageDialog(null,"Payment Successfully");
				       		       
				    } catch(Exception e) {System.out.println(e);
                                    JOptionPane.showMessageDialog(null,"Payment already done");
				}
    }//GEN-LAST:event_jButtonADDActionPerformed

    
 
        
    
    private void jButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELETEActionPerformed
        // TODO add your handling code here:
                  
                               int row = jTablePAYMENT.getSelectedRow();
				System.out.println(row);
				String cell = jTablePAYMENT.getModel().getValueAt(row, 0).toString();
				String query="delete from PAYMENT where CUSTOMER_ID='"+cell+"'";
				System.out.println(query);
				
				
				try 
				{
                                        Connection con=ConncetionProvider.getCon();
					PreparedStatement pst2=con.prepareStatement(query);
					pst2.executeQuery();
					JOptionPane.showMessageDialog(null,"Row Deleted Successful");
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
    }//GEN-LAST:event_jButtonDELETEActionPerformed

    private void jButtonEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXITActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonEXITActionPerformed

    private void jButtonFETCHPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFETCHPRICEActionPerformed
        // TODO add your handling code here:
        
       String CID= jTextFieldCID.getText();
       String TOTALPRICE=jTextFieldTOTALPRICE.getText();
       
          
       System.out.println(CID);
        try 
					{
                                            
                                                Connection con=ConncetionProvider.getCon();
						String query="SELECT SUM(TOTALPRICE) FROM PURCHASE ,CUSTOMER C WHERE C.CUSTOMER_ID=PURCHASE.CUSTOMER_ID AND PURCHASE.CUSTOMER_ID='"+CID+"'AND C.CUSTOMER_ID='"+CID+"'" ;
						PreparedStatement pst1=con.prepareStatement(query);
						ResultSet rs=pst1.executeQuery();
                                             
                                                 if(rs.next())
                                                {
                                                int price=rs.getInt("SUM(TOTALPRICE)");
                                                
                                                if(price!=0){
                                                jTextFieldTOTALPRICE.setText(valueOf(price)); 
                                                }
                                                 else
                                                 {
                                                        JOptionPane.showMessageDialog(null,"INVALID CUSTOMER ID"); 

                                                 }
                                                } 
					}
					catch (Exception e) 
                                            
					{
                                              JOptionPane.showMessageDialog(null,"INVALID CUSTOMER ID");
						e.printStackTrace();
                                             
                                           
					}
    }//GEN-LAST:event_jButtonFETCHPRICEActionPerformed

    private void jComboBoxPAYMENTMODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPAYMENTMODEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPAYMENTMODEActionPerformed

    private void jButtonVIEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVIEWActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection con=ConncetionProvider.getCon();
            String query="select * from PAYMENT";
            PreparedStatement pst1=con.prepareStatement(query);
            ResultSet rs=pst1.executeQuery();
            jTablePAYMENT.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonVIEWActionPerformed

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
            java.util.logging.Logger.getLogger(PAYMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAYMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAYMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAYMENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAYMENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JButton jButtonEXIT;
    private javax.swing.JButton jButtonFETCHPRICE;
    private javax.swing.JButton jButtonRESET;
    private javax.swing.JButton jButtonVIEW;
    private javax.swing.JComboBox<String> jComboBoxPAYMENTMODE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPAYMENTID;
    private javax.swing.JLabel jLabelPAYMENTMODE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCUSTOMER;
    private javax.swing.JTable jTablePAYMENT;
    private javax.swing.JTextField jTextFieldCID;
    private javax.swing.JTextField jTextFieldPAYMENTID;
    private javax.swing.JTextField jTextFieldTOTALPRICE;
    // End of variables declaration//GEN-END:variables
}
