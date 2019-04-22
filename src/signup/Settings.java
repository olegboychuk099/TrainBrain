/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signup;

import keeptoo.Drag;

import java.awt.event.*;

/**
 * @author Олег
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingPanel = new keeptoo.KGradientPanel();
        btn_back = new keeptoo.KButton();
        secLabel = new javax.swing.JLabel();
        countQuest = new javax.swing.JFormattedTextField();
        min = new javax.swing.JFormattedTextField();
        dot = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        headline_2 = new javax.swing.JLabel();
        type_cards = new javax.swing.JComboBox<>();
        headline = new javax.swing.JLabel();
        btn_exit = new keeptoo.KButton();
        minLabel = new javax.swing.JLabel();
        sec = new javax.swing.JFormattedTextField();
        howMuchLabel = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingPanel.setkEndColor(new java.awt.Color(204, 0, 204));
        settingPanel.setkStartColor(new java.awt.Color(0, 204, 204));
        settingPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                settingPanelMouseDragged(evt);
            }
        });
        settingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settingPanelMousePressed(evt);
            }
        });
        settingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-25.png"))); // NOI18N
        btn_back.setToolTipText("");
        btn_back.setBorderPainted(false);
        btn_back.setEnabled(false);
        btn_back.setFocusPainted(false);
        btn_back.setFocusable(false);
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_back.setIconTextGap(0);
        btn_back.setkAllowTab(false);
        btn_back.setkBorderRadius(40);
        btn_back.setkEndColor(new java.awt.Color(0, 204, 204));
        btn_back.setkFillButton(false);
        btn_back.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        btn_back.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        btn_back.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btn_back.setkStartColor(new java.awt.Color(204, 204, 204));
        btn_back.setName(""); // NOI18N
        btn_back.setOpaque(false);
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        settingPanel.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 10, 25, 60));

        secLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        secLabel.setForeground(new java.awt.Color(204, 204, 204));
        secLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        secLabel.setText("  sec");
        settingPanel.add(secLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 130, 20));

        countQuest.setBackground(new java.awt.Color(0, 0, 0, 0));
        countQuest.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        countQuest.setForeground(new java.awt.Color(255, 255, 255));
        try {
            countQuest.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        countQuest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        countQuest.setText("5");
        countQuest.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        countQuest.setOpaque(false);
        countQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countQuestActionPerformed(evt);
            }
        });
        settingPanel.add(countQuest, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 170, 50));

        min.setBackground(new java.awt.Color(0, 0, 0, 0));
        min.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        min.setForeground(new java.awt.Color(255, 255, 255));
        try {
            min.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        min.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        min.setText("30");
        min.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        min.setOpaque(false);
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        settingPanel.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 170, 50));

        dot.setBackground(new java.awt.Color(255, 255, 255));
        dot.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        dot.setForeground(new java.awt.Color(255, 255, 255));
        dot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dot.setText(":");
        dot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        settingPanel.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 50, 40));

        typeLabel.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(204, 204, 204));
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLabel.setText("type words:");
        settingPanel.add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 170, 20));

        headline_2.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        headline_2.setForeground(new java.awt.Color(204, 204, 204));
        headline_2.setText("TrainBrain");
        settingPanel.add(headline_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 40));

        type_cards.setBackground(new java.awt.Color(0, 0, 0, 0));
        type_cards.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        type_cards.setForeground(new java.awt.Color(255, 255, 255));
        type_cards.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"All", "Food", "Drinks", "Animals"}));
        type_cards.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        type_cards.setName(""); // NOI18N
        type_cards.setOpaque(false);
        type_cards.setRequestFocusEnabled(false);
        settingPanel.add(type_cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 170, 50));

        headline.setFont(new java.awt.Font("Candara", 0, 48)); // NOI18N
        headline.setForeground(new java.awt.Color(204, 204, 204));
        headline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headline.setText("Setting");
        settingPanel.add(headline, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 260, 50));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-25.png"))); // NOI18N
        btn_exit.setToolTipText("");
        btn_exit.setDoubleBuffered(true);
        btn_exit.setFocusPainted(false);
        btn_exit.setIconTextGap(0);
        btn_exit.setkAllowTab(false);
        btn_exit.setkBorderRadius(40);
        btn_exit.setkEndColor(new java.awt.Color(0, 204, 204));
        btn_exit.setkHoverEndColor(new java.awt.Color(204, 0, 0));
        btn_exit.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        btn_exit.setkHoverStartColor(new java.awt.Color(204, 0, 0));
        btn_exit.setkPressedColor(new java.awt.Color(255, 51, 51));
        btn_exit.setkStartColor(new java.awt.Color(204, 0, 204));
        btn_exit.setName(""); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        settingPanel.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 25, 60));

        minLabel.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        minLabel.setForeground(new java.awt.Color(204, 204, 204));
        minLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        minLabel.setText("min");
        settingPanel.add(minLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 150, 20));

        sec.setBackground(new java.awt.Color(0, 0, 0, 0));
        sec.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        sec.setForeground(new java.awt.Color(255, 255, 255));
        try {
            sec.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        sec.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sec.setText("00");
        sec.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        sec.setOpaque(false);
        sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });
        settingPanel.add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 170, 50));

        howMuchLabel.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        howMuchLabel.setForeground(new java.awt.Color(204, 204, 204));
        howMuchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        howMuchLabel.setText("how many questions do you want:");
        settingPanel.add(howMuchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 280, 20));

        timerLabel.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(204, 204, 204));
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("the time over which the question will begin to appear:");
        settingPanel.add(timerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 450, 20));

        getContentPane().add(settingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_backMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        this.setVisible(false);
        if (getSec() < 10 && getSec() >= 0)
            mainWindow.getTime().setText(getMin() + ":0" + getSec());
        else
            mainWindow.getTime().setText(getMin() + ":" + getSec());
        mainWindow.getMainWindow().setVisible(true);
    }//GEN-LAST:event_btn_backMouseClicked

    private void settingPanelMouseDragged(MouseEvent evt) {//GEN-FIRST:event_settingPanelMouseDragged
        new Drag(settingPanel).moveWindow(evt);
    }//GEN-LAST:event_settingPanelMouseDragged

    private void settingPanelMousePressed(MouseEvent evt) {//GEN-FIRST:event_settingPanelMousePressed
        new Drag(settingPanel).onPress(evt);
    }//GEN-LAST:event_settingPanelMousePressed

    private void countQuestActionPerformed(ActionEvent evt) {//GEN-FIRST:event_countQuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countQuestActionPerformed

    private void minActionPerformed(ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minActionPerformed

    private void btn_exitMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void secActionPerformed(ActionEvent evt) {//GEN-FIRST:event_secActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secActionPerformed

    MainWindow mainWindow = new MainWindow();

    int getMin() {
        int minute;
        try {
            minute = Integer.parseInt(min.getText());
        } catch (NumberFormatException e) {
            minute = 4;
        }
        return minute;
    }

    int getSec() {
        int secund;
        try {
            secund = Integer.parseInt(sec.getText());
        } catch (NumberFormatException e) {
            secund = 04;
        }
        return secund;
    }

    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Settings().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btn_back;
    private keeptoo.KButton btn_exit;
    private javax.swing.JFormattedTextField countQuest;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel headline;
    private javax.swing.JLabel headline_2;
    private javax.swing.JLabel howMuchLabel;
    private javax.swing.JFormattedTextField min;
    private javax.swing.JLabel minLabel;
    private javax.swing.JFormattedTextField sec;
    private javax.swing.JLabel secLabel;
    private keeptoo.KGradientPanel settingPanel;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JComboBox<String> type_cards;
    // End of variables declaration//GEN-END:variables

}
