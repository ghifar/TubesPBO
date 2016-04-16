/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;
import view.caripelamar;

/**
 *
 * @author A455LN
 */
public class ControllerCariPelamar implements ActionListener{
 caripelamar cpp;
   Aplikasi app;
    
    
   public ControllerCariPelamar (Aplikasi ap){
       this.cpp= new caripelamar();
       this.cpp.setVisible(true);
       this.app =ap;
       
       this.cpp.getCariButton().addActionListener(this);
       
       
   }
   

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(cpp.getCariButton())){
            String namaPelamar = cpp.getCariField().getText();
            cpp.getTampilField().setText(app.searchPelamar(namaPelamar));
                  //  getTampilField().setText(app.searchPelamar(namaPelamar));
            //System.out.println(namaPerusahaan);
           // app.searchPerusahaan(namaPerusahaan);
            
            
        }
         else if(x.equals(cpp.getKembaliButton())){
            this.cpp.setVisible(false);
            ControllerPelamar cpp = new ControllerPelamar(app);
           
        }
    }
}

