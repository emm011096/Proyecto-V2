
package game;

import java.applet.AudioClip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Icons extends javax.swing.JFrame {
    public static int contador=0;
    public static int  temp=0;
   
    public Icons() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTwo = new javax.swing.JLabel();
        What = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtOne = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTwo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtThree = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFour = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFive = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSix = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSeven = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNine = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        SB = new javax.swing.JButton();
        SM = new javax.swing.JButton();
        SD = new javax.swing.JButton();
        SH = new javax.swing.JButton();
        SF = new javax.swing.JButton();
        SC = new javax.swing.JButton();
        SP = new javax.swing.JButton();
        SPL = new javax.swing.JButton();
        SGO = new javax.swing.JButton();
        SBI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/bike.gif"))); // NOI18N

        What.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/those.gif"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/beer2.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/milk.gif"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/diamond.gif"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/hunter.gif"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/firer.gif"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/camera.gif"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/phone.gif"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/plane.gif"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/dog.gif"))); // NOI18N

        txtNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNineActionPerformed(evt);
            }
        });

        jButton1.setText("Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Return to Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Finish Level");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        SB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBActionPerformed(evt);
            }
        });

        SM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SMActionPerformed(evt);
            }
        });

        SD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDActionPerformed(evt);
            }
        });

        SH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHActionPerformed(evt);
            }
        });

        SF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SFActionPerformed(evt);
            }
        });

        SC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCActionPerformed(evt);
            }
        });

        SP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPActionPerformed(evt);
            }
        });

        SPL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPLActionPerformed(evt);
            }
        });

        SGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SGOActionPerformed(evt);
            }
        });

        SBI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/icon.png"))); // NOI18N
        SBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(What, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(103, 103, 103))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(76, 76, 76)))
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(SM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(SD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(100, 100, 100))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(SF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtFive, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(SPL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtEight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(46, 46, 46)
                                                                .addComponent(SGO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtNine, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(0, 9, Short.MAX_VALUE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SH, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtFour, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(252, 252, 252)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSix, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(292, 292, 292)
                                .addComponent(txtThree, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(SBI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(What, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SH, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtFive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSeven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SPL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SGO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SBI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "What Are Thooose\nA mini game where you have to name the game shown\nplease write in minus");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        int temp=0;
        String one,two,three,four,five,six,seven,eight,nine,ten;
        one=txtOne.getText();txtOne.setText("");
        two=txtTwo.getText();txtTwo.setText("");
        three=txtThree.getText();txtThree.setText("");
        four=txtFour.getText();txtFour.setText("");
        five=txtFive.getText();txtFive.setText("");
        six=txtSix.getText();txtSix.setText("");
        seven=txtSeven.getText();txtSeven.setText("");
        eight=txtEight.getText();txtEight.setText("");
        nine=txtNine.getText();txtNine.setText("");
        ten=txtTen.getText();txtTen.setText("");
        if(one.equals("beer")){
            contador=contador+10;
            temp++;
        }
        if(two.equals("milk")){
            contador=contador+10;
            temp++;
        }
        if(three.equals("diamond")){
            contador=contador+10;
            temp++;
        }
        if(four.equals("hunter")){
            contador=contador+10;
            temp++;
        }
        if(five.equals("fire")){
            contador=contador+10;
            temp++;
        }
        if(six.equals("camera")){
            contador=contador+10;
            temp++;
        }
        if(seven.equals("phone")){
            contador=contador+10;
            temp++;
        }
        if(eight.equals("plane")){
            contador=contador+10;
            temp++;
        }
        if(nine.equals("dog")){
            contador=contador+10;
            temp++;
        }
        if(ten.equals("bike")){
            contador=contador+10;
            temp++;
        }
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/Descargar_MP3.wav"));
        sonido.play();
        int des=JOptionPane.showConfirmDialog(null, "Your Score: "+contador+
                "\nResults "+temp+"/10\nWould you like to retry");
        if(des==0){
            Icons obj=new Icons();
            obj.setVisible(true);
            this.setVisible(false);
            sonido.stop();
        }else{
            Icon toca=new ImageIcon(getClass().getResource("/game/0.png"));
            JOptionPane.showMessageDialog(null, "","Next Level",JOptionPane.INFORMATION_MESSAGE,toca);
            Hangman4 XYZ = new Hangman4();
            XYZ.setVisible(true);
            this.setVisible(false);
            sonido.stop();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/beer.wav"));
        sonido.play();
    }//GEN-LAST:event_SBActionPerformed

    private void SMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SMActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/milk.wav"));
        sonido.play();
    }//GEN-LAST:event_SMActionPerformed

    private void SDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/diamond.wav"));
        sonido.play();
    }//GEN-LAST:event_SDActionPerformed

    private void SHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/hunter.wav"));
        sonido.play();
    }//GEN-LAST:event_SHActionPerformed

    private void SFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SFActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/fire.wav"));
        sonido.play();
    }//GEN-LAST:event_SFActionPerformed

    private void SCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/camera.wav"));
        sonido.play();
    }//GEN-LAST:event_SCActionPerformed

    private void SPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/phone.wav"));
        sonido.play();
    }//GEN-LAST:event_SPActionPerformed

    private void SPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPLActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/plane.wav"));
        sonido.play();
    }//GEN-LAST:event_SPLActionPerformed

    private void SGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SGOActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/dog.wav"));
        sonido.play();
    }//GEN-LAST:event_SGOActionPerformed

    private void SBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBIActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonido/bike.wav"));
        sonido.play();
    }//GEN-LAST:event_SBIActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int opc=JOptionPane.showConfirmDialog(null, "Are you Sure!","Alert",JOptionPane.INFORMATION_MESSAGE);
        if(opc==0){
            GameMain game = new GameMain();
            game.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Icons2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Icons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SB;
    private javax.swing.JButton SBI;
    private javax.swing.JButton SC;
    private javax.swing.JButton SD;
    private javax.swing.JButton SF;
    private javax.swing.JButton SGO;
    private javax.swing.JButton SH;
    private javax.swing.JButton SM;
    private javax.swing.JButton SP;
    private javax.swing.JButton SPL;
    private javax.swing.JLabel What;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTwo;
    private javax.swing.JTextField txtEight;
    private javax.swing.JTextField txtFive;
    private javax.swing.JTextField txtFour;
    private javax.swing.JTextField txtNine;
    private javax.swing.JTextField txtOne;
    private javax.swing.JTextField txtSeven;
    private javax.swing.JTextField txtSix;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThree;
    private javax.swing.JTextField txtTwo;
    // End of variables declaration//GEN-END:variables
}
