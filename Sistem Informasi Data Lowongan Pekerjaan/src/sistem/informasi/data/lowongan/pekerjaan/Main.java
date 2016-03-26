/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.lowongan.pekerjaan;

/**
 *
 * @author mendexx
 */
public class Main {
    
    static Perusahaan[] listPerusahaan = new Perusahaan[10];
    static int nPerusahaan= 0;
    public static void main(String[] args) {
        Orang o2 = new Perusahaan("Abu","Nike co");
        Perusahaan per1 = (Perusahaan) o2;
        per1.createLowongan("L001","CuciPiring","12 March 2012");
        per1.createLowongan("L002","Ngepel","20 March 2012");
        listPerusahaan[nPerusahaan++]= per1;
        
        per1.display();
        
     
        
        
      // per1.remLowongan("L002");
      // per1.display();
        
        Orang o1 = new Pelamar("Ghiffari","P001");
        
        Pelamar pel1= (Pelamar) o1;
        pel1.createBerkas("B001", "Dokumen", "28 February 2012");
        
        Orang o3 = new Pelamar("Ghiffari","P001");
        
        Pelamar pel2= (Pelamar) o3;
        pel2.createBerkas("B002", "Dokumen", "28 February 2012");
        
        
        
//        pel1.getBerkas().addDataPelamar(pel1);
//        pel2.getBerkas().addDataPelamar(pel2);
//        
//        
//        
//       per1.getLowongan("L001").addBerkas(pel1.getBerkas());//menambahkan data pel1 pada per1
//       per1.getLowongan("L001").addBerkas(pel2.getBerkas());//menambahkan data pel2 pada per1
//        System.out.println(per1.getLowongan("L001").getnBerkas());//total berkas yang masuk
//       per1.getLowongan("L001").terimaBerkas(pel2.getBerkas());//menerima berkas yang diterima
//          System.out.println(per1.getLowongan("L001").getnBMasuk());//total berkas masuk sekarang
//         System.out.println(per1.getLowongan("L001").getnBerkas());//total berkas masuk yang diterima
//        per1.getLowongan("L001").remBerkas("B001");//mengahpus berkas "B001"
//          System.out.println(per1.getLowongan("L001").getnBerkas());//total berkas masuk sekarang
//       
        
        
                
    }  
}
