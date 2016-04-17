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
    private Lowongan lowongan;
    
    
    public Perusahaan(String nm, String nmPerusahaan) {
        super(nm);     
        this.nmPerusahaan= nmPerusahaan;
    }
    
    public Lowongan getLowongan1(){
        return this.lowongan;
    }
    
    
    public Lowongan[] getDaftarLowongan(){
        return daftarLowongan;
    }
    
    public int getnLowongan(){
        return nLowongan;
    }
    
    public String getNamaPerusahaan(){
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
    
  
	
    public Lowongan getLowongan(String nmLowongan){
		for (int i=0; i< nLowongan; i++){
			if(nmLowongan.equalsIgnoreCase(this.daftarLowongan[i].getNamaLowongan())) {
				return daftarLowongan[i];
                        }
                }
                return null;
    }
    
    public void remLowongan(String a){
        int getIndex=-2;
        for(int i = 0; i<nLowongan; i++){
            if(this.daftarLowongan[i].getIdLowongan().equalsIgnoreCase(a)){
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
        System.out.println("Perusahaan "+getNamaPerusahaan());
        System.out.println("Nama Pemilik Perusahaan     : "+super.getNamaOrang());
        for(int i= 0; i<nLowongan;i++){
        System.out.println("Lowongan yang tersedia : "+daftarLowongan[i].getIdLowongan()+"\tLowongan "+daftarLowongan[i].getNamaLowongan()+"\t\t Deadline :"+daftarLowongan[i].getDeadline());
        }
        
    }

    @Override
    public String toString() {
        String s= "nama Lowongan :"+this.getNamaOrang()+"\n";
        String s1 = "perusahaan : "+this.getNamaPerusahaan()+"\n";
        String s2 = "lowongan : \n";
        String lowongan = "";
        for (int i = 0; i < nLowongan; i++) {
            lowongan += (i+1)+" "+this.daftarLowongan[i].getNamaLowongan()+"\n";
        }
        return s+s1+s2+lowongan;
//        return "Perusahaan{" + "daftarLowongan=" + daftarLowongan + ", nLowongan=" + nLowongan + ", nmPerusahaan=" + nmPerusahaan + ", lowongan=" + lowongan + '}';
    }
        
    
}
	
