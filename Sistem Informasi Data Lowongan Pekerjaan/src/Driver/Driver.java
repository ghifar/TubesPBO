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
          ControllerMainMenu cmm = new ControllerMainMenu(app);
    }
  
    
}