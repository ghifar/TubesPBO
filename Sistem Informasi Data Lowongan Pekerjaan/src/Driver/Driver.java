/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.ControllerMainMenu;
import sistem.informasi.data.lowongan.pekerjaan.Aplikasi;

/**
 *
 * @author Mendex
 */
public class Driver {
    public static void main(String[] args) {
        
        
        Aplikasi app= new Aplikasi();
        app.addPerusahaan("Tesla", "Tesla");
        app.addPerusahaan("Bill Gates", "Microsoft");
        app.addPerusahaan("Steve Jobs", "Apple");
        
        app.getPerusahaan("Apple").createLowongan("L001", "konsultan", "20 maret 2018");
        
        app.addPelamar("kaka", "P001");
        app.getPelamar("kaka").createBerkas("B001", "Dokumen", "20 maret 2017");
        
        app.addPelamar("kiki", "P002");
        app.addPelamar("koko", "P003");
        
          ControllerMainMenu cmm = new ControllerMainMenu(app);
    }
  
    
}
