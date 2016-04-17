/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Givanni
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;
import sistem.informasi.data.lowongan.pekerjaan.Pelamar;
import View.HalAwalPelamar;

public class ControllerPelamar implements ActionListener {
    
    HalAwalPelamar pelamar;
    Aplikasi app;


    ControllerPelamar(Aplikasi app) {
                   this.app = app;
        this.pelamar = new HalAwalPelamar();
        this.pelamar.setVisible(true);
        
        this.pelamar.getTambahPelamar().addActionListener(this);
        this.pelamar.getDataPelamar().addActionListener(this);
        this.pelamar.getHapusPelamar().addActionListener(this);
        this.pelamar.getBuatBerkas().addActionListener(this);
        this.pelamar.getCariPelamar().addActionListener(this);
        this.pelamar.getMinatLowongan().addActionListener(this);
        this.pelamar.getButtonBack().addActionListener(this);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        Object x = ae.getSource();
        if(x.equals(pelamar.getTambahPelamar())){
            this.pelamar.setVisible(false);
            ControllerTambahPelamar ctp = new ControllerTambahPelamar(app);
        }
        else if(x.equals(pelamar.getDataPelamar())){
            this.pelamar.setVisible(false);
            ControllerTampilPelamar cdp = new ControllerTampilPelamar(app);
            
        }
        else if(x.equals(pelamar.getHapusPelamar())){
            this.pelamar.setVisible(false);
            ControllerHapusPelamar chp = new ControllerHapusPelamar(app);      
        }
        else if(x.equals(pelamar.getBuatBerkas())){
            this.pelamar.setVisible(false);
            ControllerBuatBerkas cbb = new ControllerBuatBerkas(app);
        }
        
        else if(x.equals(pelamar.getCariPelamar())){
            this.pelamar.setVisible(false);
            ControllerCariPelamar ccp= new ControllerCariPelamar(app);
        }
        else if(x.equals(pelamar.getMinatLowongan())){
            this.pelamar.setVisible(false);
            ControllerMinatLowongan cml = new ControllerMinatLowongan(app);
        }
        else if(x.equals(pelamar.getButtonBack())){
            this.pelamar.setVisible(false);
            ControllerMainMenu cmm = new ControllerMainMenu(app);
        }
   }
    
    
}
