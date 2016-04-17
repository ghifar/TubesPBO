/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HapusPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;
import sistem.informasi.data.lowongan.pekerjaan.Perusahaan;

/**
 *
 * @author Mendex
 */
public class ControllerHapusPerusahaan implements ActionListener {

    HapusPerusahaan hp;
    Aplikasi app;
    Perusahaan p;

    public ControllerHapusPerusahaan(Aplikasi ap) {
        this.app = ap;
        this.hp = new HapusPerusahaan();
        this.hp.setVisible(true);

        this.hp.getBackButton().addActionListener(this);
        this.hp.getHapusButton().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(hp.getBackButton())) {
            this.hp.setVisible(false);
            ControllerPerusahaan cmm = new ControllerPerusahaan(app);

        } else if (x.equals(hp.getHapusButton())) {
            String namaPerusahaan = hp.getHapusTextField().getText();
            app.hapusPerusahaan(namaPerusahaan);
            JOptionPane.showMessageDialog(null, "Perusahaan Berhasil Dihapus");


        }
    }

}
