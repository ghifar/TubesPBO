/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.lowongan.pekerjaan;

/**
 *
 * @author A455LN
 */
public class BerkasLamaran {
    private String jenisBerkas;
    private String tglMasukBerkas;
    private String id;
   
    public BerkasLamaran(String jenisBerkas, String tgl){
        this.jenisBerkas = jenisBerkas;
        this.tglMasukBerkas = tgl;
    }
    
    public String getJenisBerkas(){
        return jenisBerkas;
    }
    
    public String getTglMasuk(){
        return tglMasukBerkas;
    }
    
}
