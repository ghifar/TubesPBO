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
public class Lowongan {
    private BerkasLamaran[] berkasMasuk;
    private BerkasLamaran[] berkasDiterima;
    private String idLowongan;
    private String deadline;
    private int nBerkas= 0;
    private int bmasuk;
    private String nmLowongan;
 

    Lowongan(String idLowongan,String nm,String deadline) {
         this.idLowongan= idLowongan;
         this.deadline= deadline;
         this.nmLowongan= nm;
    }
    
    public String getNamaLowongan(){
        return this.nmLowongan;
    }
    
    public String getDeadline(){
        return this.deadline;
    }
    
    public String getIdLowongan(){
        return this.idLowongan;
    }
    
    public void addBerkas(BerkasLamaran b){
       this.berkasMasuk[nBerkas] = b;
       nBerkas++;
    }
    
    public void terimaBerkas(BerkasLamaran b){
        if(nBerkas> bmasuk){
        this.berkasDiterima[bmasuk]= b;
        bmasuk++;
        nBerkas--;
        }
    }
    
    public BerkasLamaran getBerkasDiterima(int index){
        return berkasDiterima[index];
    }
    
    public BerkasLamaran getBerkasMasuk(int index){
        return berkasMasuk[index];
    }
    
    public BerkasLamaran getBerkasMasuk(String id){
        for (int i=0; i<berkasMasuk.length; i++){
			if(id.equals(this.berkasMasuk[i].getIdBerkas())) {
				return berkasMasuk[i];
                        }
                        else
                        return null;
                        
                }
                return null;
    }
    
    public String remBerkas(String index){
        for(int i= 0; i<berkasMasuk.length; i++){
            if(index.equals(this.berkasMasuk[i].getIdBerkas())){
                berkasMasuk[i]= berkasMasuk[berkasMasuk.length-1];
                return "Berkas "+index+" terhapus";
                
            }
            else{
                return "tidak ada berkas";
            }
            
        }
        return null;
    }

    
}
    
    
