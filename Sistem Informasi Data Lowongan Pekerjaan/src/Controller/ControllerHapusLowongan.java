/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HapusLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;

/**
 *
 * @author Mendex
 */
public class ControllerHapusLowongan implements ActionListener{
    Aplikasi app ;
    HapusLowongan hl;
    public ControllerHapusLowongan(Aplikasi app){
        this.app = app;
        this.hl= new HapusLowongan();
        this.hl.setVisible(true);
        
        this.hl.getBackButton().addActionListener(this);
        this.hl.getHapusButton().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(hl.getHapusButton())){
            String namaPerusahaan = hl.getNamaPerusahaan().getText();
            String IdLowongan = hl.getIdLowongan().getText();
            
            app.getPerusahaan(namaPerusahaan).remLowongan(IdLowongan);
            JOptionPane.showMessageDialog(null, "terhapus");
        }
        
        else if(x.equals(hl.getBackButton())){
            this.hl.setVisible(false);
           ControllerPerusahaan cp = new ControllerPerusahaan(app);
        }
    }
    
}
