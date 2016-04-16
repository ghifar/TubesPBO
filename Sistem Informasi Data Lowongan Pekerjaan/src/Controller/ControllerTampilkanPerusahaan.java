/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;
import sistem.informasi.data.lowongan.pekerjaan.Perusahaan;
import View.TampilkanPerusahaan;
import javax.swing.JOptionPane;

/**
 *
 * @author Mendex
 */
public class ControllerTampilkanPerusahaan implements ActionListener {

    //ArrayList<Perusahaan> listPerusahaan = new ArrayList<>();
    TampilkanPerusahaan tp;
    Aplikasi app;
    Perusahaan p;

    public ControllerTampilkanPerusahaan(Aplikasi ap) {
        this.app = ap;
        this.tp = new TampilkanPerusahaan();
        this.tp.setVisible(true);

        this.tp.getBackButton().addActionListener(this);
        this.showDatas();
    }

//    public void setLp(ArrayList<Perusahaan> lp) {
//        this.listPerusahaan = lp;
//    }

    public void showDatas() {
//        for (Perusahaan per : app.getListPerusahaan()) {
//            this.tp.getHasilField().append(per.getNamaPerusahaan());
//        }
            tp.getHasilField().setText(app.displayPerusahaan());
            app.displayPerusahaan();
            
//        for (Perusahaan perusahaan : app.getListPerusahaan()) {
//            this.tp.getHasilField().append(perusahaan.toString());
//        }
//        JOptionPane.showMessageDialog(null, app.getListPerusahaan().size());

// app.displayPerusahaan();
        //this.tp.getHasilField().append(p.getNamaPerusahaan());
//      for(Perusahaan perusahaan : listPerusahaan){
//          this.tp.getHasilField().append(perusahaan.getNamaPerusahaan());
//          
//      }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if (x.equals(tp.getBackButton())) {
            this.tp.setVisible(false);
            ControllerMainMenu cm = new ControllerMainMenu(app);

        }
    }

}
