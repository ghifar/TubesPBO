/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;

/**
 *
 * @author Mendex
 */
public class vPerusahaan extends javax.swing.JFrame {

    /**
     * Creates new form Perusahaan
     */
    public vPerusahaan() {
        initComponents();
    }

    public JButton getCariLowongan() {
        return cariLowongan;
    }

    public JButton getCariPerusahaan() {
        return cariPerusahaan;
    }

    public JButton getHapusLowongan() {
        return hapusLowongan;
    }

    public JButton getHapusPerusahaan() {
        return hapusPerusahaan;
    }

    public JButton getTambahLowongan() {
        return tambahLowongan;
    }

    public JButton getTambahPerusahaan() {
        return tambahPerusahaan;
    }

    public JButton getTampilkanBerkasDiterima() {
        return tampilkanBerkasDiterima;
    }

    public JButton getTampilkanPelamarLowongan() {
        return tampilkanPelamarLowongan;
    }

    public JButton getTampilkanPerusahaan() {
        return tampilkanPerusahaan;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tambahPerusahaan = new javax.swing.JButton();
        tampilkanPerusahaan = new javax.swing.JButton();
        hapusPerusahaan = new javax.swing.JButton();
        cariPerusahaan = new javax.swing.JButton();
        tambahLowongan = new javax.swing.JButton();
        hapusLowongan = new javax.swing.JButton();
        cariLowongan = new javax.swing.JButton();
        tampilkanPelamarLowongan = new javax.swing.JButton();
        tampilkanBerkasDiterima = new javax.swing.JButton();
        perusahaan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tambahPerusahaan.setText("Tambah Perusahaan");
        tambahPerusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahPerusahaanActionPerformed(evt);
            }
        });

        tampilkanPerusahaan.setText("Tampilkan Perusahaan");

        hapusPerusahaan.setText("Hapus Perusahaan");
        hapusPerusahaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusPerusahaanActionPerformed(evt);
            }
        });

        cariPerusahaan.setText("Cari Perusahaan");

        tambahLowongan.setText("Tambah Lowongan");
        tambahLowongan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahLowonganActionPerformed(evt);
            }
        });

        hapusLowongan.setText("Hapus Lowongan");

        cariLowongan.setText("Cari Lowongan");

        tampilkanPelamarLowongan.setText("Tampilkan Pelamar Lowongan");

        tampilkanBerkasDiterima.setText("Tampilkan Berkas Diterima");

        perusahaan.setText("PERUSAHAAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hapusLowongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tambahLowongan, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tampilkanPelamarLowongan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tampilkanBerkasDiterima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tampilkanPerusahaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambahPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perusahaan)
                            .addComponent(hapusPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(cariPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cariLowongan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perusahaan)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahPerusahaan)
                    .addComponent(tambahLowongan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusLowongan)
                    .addComponent(hapusPerusahaan))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariPerusahaan)
                    .addComponent(cariLowongan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(tampilkanPerusahaan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tampilkanPelamarLowongan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tampilkanBerkasDiterima)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahPerusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahPerusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahPerusahaanActionPerformed

    private void hapusPerusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusPerusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusPerusahaanActionPerformed

    private void tambahLowonganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahLowonganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahLowonganActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(vPerusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(vPerusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(vPerusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(vPerusahaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vPerusahaan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cariLowongan;
    private javax.swing.JButton cariPerusahaan;
    private javax.swing.JButton hapusLowongan;
    private javax.swing.JButton hapusPerusahaan;
    private javax.swing.JLabel perusahaan;
    private javax.swing.JButton tambahLowongan;
    private javax.swing.JButton tambahPerusahaan;
    private javax.swing.JButton tampilkanBerkasDiterima;
    private javax.swing.JButton tampilkanPelamarLowongan;
    private javax.swing.JButton tampilkanPerusahaan;
    // End of variables declaration//GEN-END:variables
}
