/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CariPerusahaan;
import View.vPerusahaan;
import com.sun.corba.se.spi.orbutil.fsm.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;

/**
 *
 * @author Mendex
 */
public class ControllerCariPerusahaan implements ActionListener {

    CariPerusahaan cp;
    Aplikasi app;

    public ControllerCariPerusahaan(Aplikasi ap) {
        this.cp = new CariPerusahaan();
        this.cp.setVisible(true);
        this.app = ap;

        this.cp.getCariButton().addActionListener(this);
        this.cp.getBackButton().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(cp.getCariButton())) {
            String namaPerusahaan = cp.getCariTextField().getText();
            cp.getHasilTextField().setText(app.searchPerusahaan(namaPerusahaan));
        }
        else if(x.equals(cp.getBackButton())){
            this.cp.setVisible(false);
            ControllerPerusahaan cp = new ControllerPerusahaan(app);
                    
        }
    }
}
