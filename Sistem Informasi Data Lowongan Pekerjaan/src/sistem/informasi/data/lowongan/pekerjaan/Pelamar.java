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
    private String idPelamar
        
            
    @Override
    public void display() {
    
    }
    
    public Pelamar(String nama, String idPelamar){
        super(nama);
        this.idPelamar=idPelamar;
    }
    
    public void createBerkas(String jenisBerkas, date tgl){
       
    }
    
    public String getIdPelamar(){
        return idPelamar;
    }
    
    public void cariLowongan(String nama){
        
    }
}
