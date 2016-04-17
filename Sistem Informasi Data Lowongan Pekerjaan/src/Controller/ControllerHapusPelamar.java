/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Givanni
 */
import View.HapusPelamar;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;
import sistem.informasi.data.lowongan.pekerjaan.Pelamar;
public class ControllerHapusPelamar implements ActionListener{
    HapusPelamar hpel;
    Aplikasi app;
    Pelamar pel;

    public ControllerHapusPelamar(Aplikasi app) {
        this.app = app;
        this.hpel = new HapusPelamar();
        this.hpel.setVisible(true);
        
        this.hpel.getButtonDelete().addActionListener(this);
        this.hpel.getButtonPelamar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed (ActionEvent ae){
        Object x = ae.getSource();
        
        if (x.equals(hpel.getButtonDelete())){
            String namaPelamar = hpel.getNamaPelamar().getText();
            app.hapusPelamar(namaPelamar);
            JOptionPane.showMessageDialog(null, "Pelamar Berhasil Dihapus");

        } else if(x.equals(hpel.getButtonPelamar())){
            this.hpel.setVisible(false);
            ControllerPelamar cp = new ControllerPelamar(app);
        
    }
    
}
}
