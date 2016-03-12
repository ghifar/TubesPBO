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
    private Lowongan[] daftarLowongan = new Lowongan[10];
    private int nLowongan = 0;
    private String nmPerusahaan;
    
    
    public Perusahaan(String nm, String nmPerusahaan) {
        super(nm);     
        this.nmPerusahaan= nmPerusahaan;
    }
    
    public Lowongan[] getDaftarLowongan(){
        return daftarLowongan;
    }
    
    public int getnLowongan(){
        return nLowongan;
    }
    
    public String getName(){
        return this.nmPerusahaan;
    }
    
    public void createLowongan(String idLowongan,String nmLowongan,String deadline){
        
		Lowongan lo = new Lowongan(idLowongan,nmLowongan, deadline);
		daftarLowongan[nLowongan]  = lo;
                nLowongan++;
    }
    
	
    public Lowongan getLowongan(int index){
	return daftarLowongan[index];
    }
	
    public Lowongan getLowongan(String id){
		for (int i=0; i< nLowongan; i++){
			if(id.equals(this.daftarLowongan[i].getIdLowongan())) {
				return daftarLowongan[i];
                        }
                }
                return null;
    }
    
    public void remLowongan(String a){
        int getIndex=-2;
        for(int i = 0; i<nLowongan; i++){
            if(a.equals(this.daftarLowongan[i].getIdLowongan())){
                getIndex=i;
                break;
            }
        }
        for(int i=getIndex+1; i< nLowongan;i++){
            daftarLowongan[i-1]=daftarLowongan[i];
        }
        nLowongan--;
    }
  
    @Override
    public void display() {
        System.out.println("Perusahaan "+getName());
        System.out.println("Nama Pemilik Perusahaan     : "+super.getNama());
        for(int i= 0; i<nLowongan;i++){
        System.out.println("Lowongan yang tersedia : "+daftarLowongan[i].getIdLowongan()+"\tLowongan "+daftarLowongan[i].getNamaLowongan()+"\t\t Deadline :"+daftarLowongan[i].getDeadline());
        }
        
    }
        
}
	
