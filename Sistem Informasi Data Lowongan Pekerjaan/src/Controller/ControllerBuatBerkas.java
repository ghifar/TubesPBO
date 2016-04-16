/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;
import view.buatberkas;
import view.minatlowongan;

/**
 *
 * @author A455LN
 */
public class ControllerBuatBerkas implements ActionListener{
     Aplikasi app;
    buatberkas bb;
    
    public ControllerBuatBerkas(Aplikasi ap){
        this.app = ap;
        this.bb = new buatberkas();
        this.bb.setVisible(true);
        
        this.bb.getKembaliButton().addActionListener(this);
        this.bb.getBuatBerkas().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
  Object x = ae.getSource();
        if(x.equals(bb.getBuatBerkas())){
            String namaPelamar = bb.getNamaPelamar().getText();
            String idBerkas = bb.getIdBekas().getText();
            String jenisBerkas = bb.getJenisBerkasPilihan().getSelectedItem().toString();
            String tanggalMasuk = bb.getTanggalMasuk().getText();
           
            app.getPelamar(namaPelamar).createBerkas(idBerkas, jenisBerkas, tanggalMasuk);
            //addBerkas(getPelamar(namaPelamar).getBerkas(idBerkas));
            JOptionPane.showMessageDialog(null, "BERHASIL!");
        }
        else if(x.equals(bb.getKembaliButton())){
            ControllerPelamar cp = new ControllerPelamar(app);
        }
    }
    
}
