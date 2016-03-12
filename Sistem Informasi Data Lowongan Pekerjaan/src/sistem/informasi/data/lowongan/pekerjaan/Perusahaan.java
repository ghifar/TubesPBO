/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.lowongan.pekerjaan;

/**
 *
 * 
 * @author mendexx
 */
public class Perusahaan extends Orang {
    private Lowongan[] daftarLowongan;
    private String idPerusahaan;
    private String nmPerusahaan;
    
    
   @Override
    public void display(){
        
    }
    
    public Perusahaan (String nama, String nmPerusahaan){
        super(nama);
        this.nmPerusahaan=nmPerusahaan;
    }
    
   public void createLowongan(){
       
   }
   
   public void removeLowongan(){
       
   }
    
   public Lowongan getLowonganbyIndex(){
       return daftarLowongan[index];
   } 
   
   public Lowongan getLowonganbyId(){
       return getLowongan;//??
   }

}
