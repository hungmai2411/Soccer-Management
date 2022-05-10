/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package soccermanagement;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import soccermanagement.model.Club;

/**
 *
 * @author quochung
 */
public class HomePage extends javax.swing.JFrame {
    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btnClub = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnMatchSchedule = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnPlayer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnResult = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRanking = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        subPannel = new javax.swing.JPanel();
        pannelClub = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNameClub = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNameCaptain = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pannelMatchSchedule = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pannelPlayer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pannelResult = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pannelRanking = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1045, 650));

        bg.setBounds(new java.awt.Rectangle(0, 0, 1045, 650));
        bg.setPreferredSize(new java.awt.Dimension(1045, 650));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(34, 172, 158));
        sidePanel.setBounds(new java.awt.Rectangle(0, 0, 195, 650));
        sidePanel.setMaximumSize(new java.awt.Dimension(195, 650));
        sidePanel.setMinimumSize(new java.awt.Dimension(195, 650));
        sidePanel.setPreferredSize(new java.awt.Dimension(195, 650));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClub.setBackground(new java.awt.Color(37, 197, 181));
        btnClub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClubMouseClicked(evt);
            }
        });
        btnClub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 30, 54));
        jLabel3.setText("Club");
        btnClub.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnClub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 195, 40));

        btnMatchSchedule.setBackground(new java.awt.Color(34, 172, 158));
        btnMatchSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMatchScheduleMouseClicked(evt);
            }
        });
        btnMatchSchedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 30, 54));
        jLabel4.setText("Match Schedule");
        btnMatchSchedule.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleDescription("");

        sidePanel.add(btnMatchSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 195, 40));

        btnPlayer.setBackground(new java.awt.Color(34, 172, 158));
        btnPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayerMouseClicked(evt);
            }
        });
        btnPlayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 30, 54));
        jLabel5.setText("Player");
        btnPlayer.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 195, 40));

        btnResult.setBackground(new java.awt.Color(34, 172, 158));
        btnResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResultMouseClicked(evt);
            }
        });
        btnResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 30, 54));
        jLabel6.setText("Result");
        btnResult.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 195, 40));

        btnRanking.setBackground(new java.awt.Color(34, 172, 158));
        btnRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRankingMouseClicked(evt);
            }
        });
        btnRanking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 30, 54));
        jLabel7.setText("Ranking");
        btnRanking.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sidePanel.add(btnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 195, 40));

        bg.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 195, 650));

        subPannel.setBackground(new java.awt.Color(255, 51, 51));
        subPannel.setBounds(new java.awt.Rectangle(195, 0, 850, 650));
        subPannel.setMaximumSize(new java.awt.Dimension(850, 650));
        subPannel.setPreferredSize(new java.awt.Dimension(850, 650));
        subPannel.setLayout(new java.awt.CardLayout());

        pannelClub.setMaximumSize(new java.awt.Dimension(850, 650));
        pannelClub.setVerifyInputWhenFocusTarget(false);
        pannelClub.setLayout(new javax.swing.BoxLayout(pannelClub, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(850, 49));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 49));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CLUB");
        jLabel12.setAlignmentX(0.5F);
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(404, 404, 404))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pannelClub.add(jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Captain", "Num"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAlignmentX(0.0F);
        jScrollPane1.setViewportView(jTable1);

        pannelClub.add(jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Name :");

        txtNameClub.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel13.setText("Captain :");

        txtNameCaptain.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel14.setText("Number of Player :");

        txtAmount.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N

        btnAdd.setText("Add");
        btnAdd.setMaximumSize(new java.awt.Dimension(118, 39));
        btnAdd.setMinimumSize(new java.awt.Dimension(118, 39));
        btnAdd.setPreferredSize(new java.awt.Dimension(118, 39));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.setMaximumSize(new java.awt.Dimension(118, 39));
        btnClear.setMinimumSize(new java.awt.Dimension(118, 39));
        btnClear.setPreferredSize(new java.awt.Dimension(118, 39));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNameClub, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNameCaptain, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNameClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNameCaptain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pannelClub.add(jPanel2);

        subPannel.add(pannelClub, "card2");

        pannelMatchSchedule.setBackground(new java.awt.Color(255, 255, 102));
        pannelMatchSchedule.setBounds(new java.awt.Rectangle(0, 0, 850, 650));
        pannelMatchSchedule.setMaximumSize(new java.awt.Dimension(850, 650));

        jLabel8.setText("This is pannel match schedule");

        javax.swing.GroupLayout pannelMatchScheduleLayout = new javax.swing.GroupLayout(pannelMatchSchedule);
        pannelMatchSchedule.setLayout(pannelMatchScheduleLayout);
        pannelMatchScheduleLayout.setHorizontalGroup(
            pannelMatchScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelMatchScheduleLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel8)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        pannelMatchScheduleLayout.setVerticalGroup(
            pannelMatchScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelMatchScheduleLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel8)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        subPannel.add(pannelMatchSchedule, "card3");

        pannelPlayer.setBackground(new java.awt.Color(255, 255, 102));
        pannelPlayer.setBounds(new java.awt.Rectangle(195, 0, 850, 650));
        pannelPlayer.setPreferredSize(new java.awt.Dimension(850, 650));

        jLabel9.setText("This is pannel Player");

        javax.swing.GroupLayout pannelPlayerLayout = new javax.swing.GroupLayout(pannelPlayer);
        pannelPlayer.setLayout(pannelPlayerLayout);
        pannelPlayerLayout.setHorizontalGroup(
            pannelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelPlayerLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel9)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        pannelPlayerLayout.setVerticalGroup(
            pannelPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelPlayerLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel9)
                .addContainerGap(371, Short.MAX_VALUE))
        );

        subPannel.add(pannelPlayer, "card4");

        pannelResult.setBackground(new java.awt.Color(255, 255, 102));
        pannelResult.setBounds(new java.awt.Rectangle(195, 0, 850, 650));

        jLabel10.setText("This is pannel Result");

        javax.swing.GroupLayout pannelResultLayout = new javax.swing.GroupLayout(pannelResult);
        pannelResult.setLayout(pannelResultLayout);
        pannelResultLayout.setHorizontalGroup(
            pannelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannelResultLayout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(387, 387, 387))
        );
        pannelResultLayout.setVerticalGroup(
            pannelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelResultLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel10)
                .addContainerGap(393, Short.MAX_VALUE))
        );

        subPannel.add(pannelResult, "card5");

        pannelRanking.setBackground(new java.awt.Color(255, 255, 102));
        pannelRanking.setBounds(new java.awt.Rectangle(195, 0, 850, 650));

        jLabel11.setText("This is pannel Ranking");

        javax.swing.GroupLayout pannelRankingLayout = new javax.swing.GroupLayout(pannelRanking);
        pannelRanking.setLayout(pannelRankingLayout);
        pannelRankingLayout.setHorizontalGroup(
            pannelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelRankingLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel11)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        pannelRankingLayout.setVerticalGroup(
            pannelRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelRankingLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel11)
                .addContainerGap(338, Short.MAX_VALUE))
        );

        subPannel.add(pannelRanking, "card6");

        bg.add(subPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 0, 850, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClubMouseClicked
        setColor(btnClub);
        resetColor(btnMatchSchedule);
        resetColor(btnPlayer);
        resetColor(btnResult);
        resetColor(btnRanking);
        
        removePannel();
        addPannel(pannelClub);
    }//GEN-LAST:event_btnClubMouseClicked

    private void btnMatchScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatchScheduleMouseClicked
        resetColor(btnClub);
        setColor(btnMatchSchedule);
        resetColor(btnPlayer);
        resetColor(btnResult);
        resetColor(btnRanking);
        
        removePannel();
        addPannel(pannelMatchSchedule);
    }//GEN-LAST:event_btnMatchScheduleMouseClicked

    private void btnPlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayerMouseClicked
        resetColor(btnClub);
        resetColor(btnMatchSchedule);
        setColor(btnPlayer);
        resetColor(btnResult);
        resetColor(btnRanking);
        
        removePannel();
        addPannel(pannelPlayer);
    }//GEN-LAST:event_btnPlayerMouseClicked

    private void btnResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultMouseClicked
        resetColor(btnClub);
        resetColor(btnMatchSchedule);
        resetColor(btnPlayer);
        setColor(btnResult);
        resetColor(btnRanking);
        
        removePannel();
        addPannel(pannelResult);
    }//GEN-LAST:event_btnResultMouseClicked

    private void btnRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRankingMouseClicked
        resetColor(btnClub);
        resetColor(btnMatchSchedule);
        resetColor(btnPlayer);
        resetColor(btnResult);
        setColor(btnRanking);
        
        removePannel();
        addPannel(pannelRanking);
    }//GEN-LAST:event_btnRankingMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    void setColor(JPanel jPanel){
       jPanel.setBackground(new Color(37,197,181));
    }
    
    void resetColor(JPanel jPanel){
        jPanel.setBackground(new Color(34,172,158));
    }
    
//    ArrayList<Club> getListClub(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        //Connection con = DriverManager.getConnection("")
//    }
    
    void removePannel(){
        subPannel.removeAll();
        subPannel.repaint();
        subPannel.revalidate();
    }
    
    void addPannel(JPanel jPanel){
        subPannel.add(jPanel);
        subPannel.repaint();
        subPannel.revalidate();
    }
    
    
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JPanel btnClub;
    private javax.swing.JPanel btnMatchSchedule;
    private javax.swing.JPanel btnPlayer;
    private javax.swing.JPanel btnRanking;
    private javax.swing.JPanel btnResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pannelClub;
    private javax.swing.JPanel pannelMatchSchedule;
    private javax.swing.JPanel pannelPlayer;
    private javax.swing.JPanel pannelRanking;
    private javax.swing.JPanel pannelResult;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel subPannel;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtNameCaptain;
    private javax.swing.JTextField txtNameClub;
    // End of variables declaration//GEN-END:variables
}
