/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TambahLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;

/**
 *
 * @author Mendex
 */
public class ControllerTambahLowongan implements ActionListener {

    TambahLowongan tl;
    Aplikasi app;

    public ControllerTambahLowongan(Aplikasi ap) {
        this.app = ap;
        this.tl = new TambahLowongan();
        this.tl.setVisible(true);

        this.tl.getBackButton().addActionListener(this);
        this.tl.getTambahButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(tl.getTambahButton())) {
            String namaPerusahaan = tl.getNamaPerusahaanField().getText();
            String namaLowongan = tl.getNamaLowonganField().getText();
            String idLowongan = tl.getIdLowonganField().getText();
            String deadline = tl.getDeadlineFieldText().getText();

            app.getPerusahaan(namaPerusahaan).createLowongan(idLowongan, namaLowongan, deadline);
            JOptionPane.showMessageDialog(null, "Lowongan Berhasil Ditambahkan");
        } else if (x.equals(tl.getBackButton())) {
            ControllerPerusahaan cp = new ControllerPerusahaan(app);
        }
    }

}
