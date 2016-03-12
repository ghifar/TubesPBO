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
    private String idBerkas;
    public Pelamar[] p= new Pelamar[10];
    public int nPelamar= 0;

    BerkasLamaran(String id, String jenisBerkas, String tglMsk) {
         this.idBerkas= id;
       this.tglMasukBerkas= tglMsk;
        this.jenisBerkas= jenisBerkas;
    }
    
    public void setIdBerkas(String id){
        this.idBerkas= id;
    }

    public void setTglMasukBerkas(String tgl){
        this.tglMasukBerkas= tgl;
    }
    public void setJenisBerkas(String jb){
        this.jenisBerkas= jb;
    }
    
    public String getJenisBerkas(){
      return jenisBerkas;  
    }
    
    public String getIdBerkas(){
        return this.idBerkas;
    }
    
    public String getTglMasukBerkas(){
        return tglMasukBerkas;
    }
    
    public int getnPelamar(){
        return this.nPelamar;
    }
   
    
    public void addDataPelamar(Pelamar p){
        if (nPelamar < this.p.length){
			this.p[nPelamar]=p;
			nPelamar++;
		}
    }
}
    