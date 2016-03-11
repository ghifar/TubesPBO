/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.lowongan.pekerjaan;

/**
 *
 * @author Givanni
 */
public class Pelamar extends Orang {
   private BerkasLamaran berkas;
    private String idPelamar;
 
    
    
    public Pelamar(String nama, String idPelamar){
        super(nama);
        setIdPelamar(idPelamar);
    }
	
    public void createBerkas(String id,String jenisBerkas, String tglMsk){
	BerkasLamaran b = new BerkasLamaran(id,jenisBerkas, tglMsk);
	this.berkas = b;
    }
    
    public void setIdPelamar(String idPelamar){
        this.idPelamar= idPelamar;
    }
    
    public String getIdPelamar(){
        return this.idPelamar;
    }
    
    public BerkasLamaran getBerkas(){
        return this.berkas;
    }
	
   public Perusahaan cariLowongan(String nama){
    for(int i = 0; i <Main.nPerusahaan; i++){
        for (int j= 0; j< Main.listPerusahaan[i].getnLowongan(); j++){
            if(nama.equals(Main.listPerusahaan[i].getDaftarLowongan()[j].getNamaLowongan())){
                return Main.listPerusahaan[i];
            }
        }
    }
        return null;
    }
    
    @Override
    public void display() {
        System.out.println();
        System.out.println("Id Pelamar              : "+getIdPelamar());
        System.out.println("Nama                    : "+super.getNama());
        System.out.println("Id Berkas               : "+berkas.getIdBerkas());
        System.out.println("Jenis Berkas            : "+berkas.getJenisBerkas());
        System.out.println("Tanggal Masuk Berkas    : "+berkas.getTglMasukBerkas());
        System.out.println("=================================================");
        System.out.println();
       
    }
    
    
}
