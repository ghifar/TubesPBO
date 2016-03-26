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
   private BerkasLamaran[] berkas = new BerkasLamaran[10];
    private String idPelamar;
 private int nBerkas= 0;
    
    
    public Pelamar(String nama, String idPelamar){
        super(nama);
        setIdPelamar(idPelamar);
    }
	
    public void createBerkas(String id,String jenisBerkas, String tglMsk){
	BerkasLamaran b = new BerkasLamaran(id,jenisBerkas, tglMsk);
	berkas[nBerkas]= b;
        nBerkas++;
    }
    
    public void setIdPelamar(String idPelamar){
        this.idPelamar= idPelamar;
    }
    
    public String getIdPelamar(){
        return this.idPelamar;
    }
    
    public BerkasLamaran getBerkas(int index){
        return this.berkas[index];
    }
    
    public BerkasLamaran getBerkas(String id){
        for (int i=0; i< nBerkas; i++){
			if(id.equalsIgnoreCase(this.berkas[i].getIdBerkas())) {
				return berkas[i];
                        }
                }
                return null;
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
   
   public int getnBerkas(){
        return nBerkas;
    }
    
    @Override
    public void display() {
        System.out.println();
        System.out.println("Id Pelamar              : "+getIdPelamar());
        System.out.println("Nama                    : "+super.getNamaOrang());
//        System.out.println("Id Berkas               : "+berkas.getIdBerkas());
//        System.out.println("Jenis Berkas            : "+berkas.getJenisBerkas());
//        System.out.println("Tanggal Masuk Berkas    : "+berkas.getTglMasukBerkas());
 //       System.out.println();
       
    }
    
    
}
