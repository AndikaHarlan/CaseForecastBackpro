/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripsibackpro;

/**
 *
 * @author ANDIKA
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAlfa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIterasi = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbPanjangData = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnViewLatih = new javax.swing.JButton();
        btnViewUji = new javax.swing.JButton();
        btnHasil = new javax.swing.JButton();
        cmbJenisPenyakit = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbJumlahData = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PERAMALAN BACKPROPAGATION");

        jLabel2.setText("Parameter");

        jLabel3.setText("Alfa");

        txtAlfa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlfaKeyTyped(evt);
            }
        });

        jLabel4.setText("Iterasi");

        txtIterasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIterasiKeyTyped(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setText("Data Latih");

        jLabel6.setText("Panjang Data");

        cmbPanjangData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "12" }));

        jLabel7.setText("Jumlah Data");

        jLabel8.setText("Data Uji");

        btnViewLatih.setText("LIHAT DATA");
        btnViewLatih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLatihActionPerformed(evt);
            }
        });

        btnViewUji.setText("LIHAT DATA");
        btnViewUji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUjiActionPerformed(evt);
            }
        });

        btnHasil.setText("Hasil");
        btnHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHasilActionPerformed(evt);
            }
        });

        cmbJenisPenyakit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Demam Tifoid-Paratifoid", "Nasofaringitis Akut" }));

        jLabel12.setText("Penyakit");

        cmbJumlahData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "12", "24", "36" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbJenisPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbPanjangData, 0, 77, Short.MAX_VALUE)
                                            .addComponent(cmbJumlahData, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnViewUji)
                                            .addComponent(btnViewLatih)))))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAlfa)
                                    .addComponent(txtIterasi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAlfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIterasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbJenisPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPanjangData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbJumlahData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(63, 63, 63))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnViewLatih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(btnViewUji, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewLatihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLatihActionPerformed
        // TODO add your handling code here:
        String panjangData = cmbPanjangData.getSelectedItem().toString();
        String jumlahData = cmbJumlahData.getSelectedItem().toString();
        String jenisPenyakit = cmbJenisPenyakit.getSelectedItem().toString();
        Data data = new Data(jenisPenyakit);
        double[][] dataLatih = data.getDataLatih(Integer.parseInt(panjangData),Integer.parseInt(jumlahData));
        TampilData tampil = new TampilData(dataLatih);
        tampil.setVisible(true);
    }//GEN-LAST:event_btnViewLatihActionPerformed

    private void btnViewUjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUjiActionPerformed
        // TODO add your handling code here:
        String panjangData = cmbPanjangData.getSelectedItem().toString();
        String jenisPenyakit = cmbJenisPenyakit.getSelectedItem().toString();
        Data data = new Data(jenisPenyakit);
        double[][] dataUji = data.getDataUji(Integer.parseInt(panjangData));
        TampilData tampil = new TampilData(dataUji);
        tampil.setVisible(true);
    }//GEN-LAST:event_btnViewUjiActionPerformed

    private void txtAlfaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlfaKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter>='0') &&(karakter<='9') ||
                (karakter==evt.VK_BACK_SPACE) ||
                (karakter==evt.VK_DELETE) ||
                (karakter==evt.VK_PERIOD)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAlfaKeyTyped

    private void txtIterasiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIterasiKeyTyped
        // TODO add your handling code here:
        char karakter = evt.getKeyChar();
        if(!(((karakter>='0') &&(karakter<='9') ||
                (karakter==evt.VK_BACK_SPACE) ||
                (karakter==evt.VK_DELETE)))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIterasiKeyTyped

    private void btnHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHasilActionPerformed
        // TODO add your handling code here:
        String panjangData = cmbPanjangData.getSelectedItem().toString();
        String jumlahData = cmbJumlahData.getSelectedItem().toString();
        String jenisPenyakit = cmbJenisPenyakit.getSelectedItem().toString();
        
        double alfa = Double.parseDouble(txtAlfa.getText());
        int iterasi = Integer.parseInt(txtIterasi.getText());
        
        Data data = new Data(jenisPenyakit);
        
        double[][] latih = data.getDataLatih(Integer.parseInt(panjangData), Integer.parseInt(jumlahData));
        double[][] uji = data.getDataUji(Integer.parseInt(panjangData));
        Backpro backpro = new Backpro(Integer.parseInt(panjangData), alfa);
        double[][] bobotBaru = backpro.backpro(latih, iterasi);
        
        double[][] bobotHidden = new double[bobotBaru.length-1][bobotBaru[0].length-1];
        double[] bobotOutput = new double[bobotBaru.length-1];
        double[] bias = bobotBaru[bobotBaru.length-1];
        double[] denor = new double[uji.length];
                
        for(int i=0;i<bobotHidden.length;i++){
            for(int j=0;j<bobotHidden[0].length;j++){
                bobotHidden[i][j] = bobotBaru[i][j];
            }
        }
        for(int i=0;i<bobotOutput.length;i++){
            bobotOutput[i] = bobotBaru[i][Integer.parseInt(panjangData)];
        }
        
        for(int i=0;i<denor.length;i++){
            denor[i] = backpro.deNormalisasi(backpro.feedForward(uji, i, bobotHidden, bias, bobotOutput), uji);
        }
        double mse = backpro.mse(denor, uji);
        double[] dataAktual = new double[uji.length];
        for(int i=0;i<dataAktual.length;i++){
            dataAktual[i] = uji[i][Integer.parseInt(panjangData)];
        }
        double akurat = backpro.akurat(mse);
        Hasil hasil = new Hasil(dataAktual, denor, bobotBaru, mse, akurat, jenisPenyakit, Integer.parseInt(panjangData), alfa);
        hasil.setVisible(true);
    }//GEN-LAST:event_btnHasilActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHasil;
    private javax.swing.JButton btnViewLatih;
    private javax.swing.JButton btnViewUji;
    private javax.swing.JComboBox<String> cmbJenisPenyakit;
    private javax.swing.JComboBox<String> cmbJumlahData;
    private javax.swing.JComboBox<String> cmbPanjangData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtAlfa;
    private javax.swing.JTextField txtIterasi;
    // End of variables declaration//GEN-END:variables
}