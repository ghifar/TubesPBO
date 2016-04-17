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
import javax.swing.JOptionPane;
import View.TambahPelamar;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;
import sistem.informasi.data.lowongan.pekerjaan.Pelamar;

public class ControllerTambahPelamar implements ActionListener {
    TambahPelamar tambahpelamar;
    Aplikasi app;

    public ControllerTambahPelamar(Aplikasi app) {
        this.tambahpelamar = new TambahPelamar();
        this.tambahpelamar.setVisible(true);
        this.tambahpelamar.getButtonAdd().addActionListener(this);
        this.tambahpelamar.getButtonPelamar().addActionListener(this);
        this.app = app;
    }
    
    @Override
    public void actionPerformed (ActionEvent ae){
      Object x = ae.getSource();
      
      if(x.equals(tambahpelamar.getButtonAdd())){
          String idPelamar = tambahpelamar.getIdPelamar().getText();
          String namaPelamar = tambahpelamar.getNamaPelamar().getText();
          String nmrHp = tambahpelamar.getNmrHp().getText();
          String email = tambahpelamar.getEmail().getText();
          app.getListPelamar().add(new Pelamar(namaPelamar, idPelamar));
          JOptionPane.showMessageDialog(null,"Berhasil Ditambahkan");
          
      }
      
        else if (x.equals(tambahpelamar.getButtonPelamar())){
          this.tambahpelamar.setVisible(false);
          
          ControllerPelamar cmm = new ControllerPelamar(app);
          
      }
      
    }
    
    
}
