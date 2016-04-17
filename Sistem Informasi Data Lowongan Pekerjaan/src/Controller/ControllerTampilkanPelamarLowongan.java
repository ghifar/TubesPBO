/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TampilkanPelamarLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;

/**
 *
 * @author Mendex
 */
public class ControllerTampilkanPelamarLowongan implements ActionListener{
    Aplikasi app;
    TampilkanPelamarLowongan p;
    
    public ControllerTampilkanPelamarLowongan(Aplikasi ap){
        this.app= ap;
        
        this.p= new TampilkanPelamarLowongan();
        this.p.setVisible(true);
        
        this.p.getBackButton().addActionListener(this);
       // this.p.getTampilkanButton().addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        
        if(x.equals(p.getBackButton())){
            this.p.setVisible(false);
            ControllerPerusahaan cp = new ControllerPerusahaan(app);
            
        }
        
//        else if(x.equals(p.getTampilkanButton())){
//            String namaPerusahaan = p.getNamaPerusahaanField().getText();
//            String namaLowongan = p.getNamaLowonganField().getText();
//            p.getHasilField().setText(app.);
//            
//        }
       }
    
    
}
