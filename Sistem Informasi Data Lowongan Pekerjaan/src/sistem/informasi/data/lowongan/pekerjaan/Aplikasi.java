/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.lowongan.pekerjaan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Givanni
 */
public class Aplikasi {
    ArrayList<Perusahaan> listPerusahaan = new ArrayList<>();
    ArrayList<Pelamar> listPelamar = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    public void addPerusahaan(String nama, String namaPerusahaan){
        Perusahaan p = new Perusahaan(nama, namaPerusahaan);
        
        listPerusahaan.add(p);
    }
    
    public void addPelamar(Pelamar pe){
        listPelamar.add(pe);
    }
    
    public Pelamar getPelamar(int index){
        return listPelamar.get(index);
    }
    
    public Perusahaan getPerusahaan(int index){
    
        return listPerusahaan.get(index);
    }
    
    public void hapusPerusahaan(int index){
        this.listPerusahaan.remove(index);
    }
    
    public void upddatePerusahan(int indexYgMauDiupdate, Perusahaan dataYgBaru){
        listPerusahaan.set(indexYgMauDiupdate, dataYgBaru);
    }
    
    public void displayPerusahaan(){
//        for(Perusahaan p: listPerusahaan){
//            System.out.println(p.getAlamat());
//            System.out.println(p.getName());
//        }
        
        for (int i = 0; i < listPerusahaan.size(); i++) {
            System.out.println(listPerusahaan.get(i).getNama());
            System.out.println(listPerusahaan.get(i).getName());
            
        }
    }
    
    public void menu(){
        try {
            while (true) {                
                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("1. input data merusahan");
                System.out.println("2. lihat data perusahaan");
                System.out.println("3. hapus perusahaan");
                System.out.println("4. tambah lowongan");
                System.out.println("pilihan : ");int pilihan = input.nextInt();
                switch(pilihan){
                    case 1: 
                        System.out.println("nama pemilik : ");String nama = input2.readLine();
                        System.out.println("nama perusahaan : ");String namaP = input2.readLine();
                        addPerusahaan(nama, namaP);
                        break;
                    case 2:
                        displayPerusahaan();
                        break;
                    case 3:
                        System.out.println("index yg di hapus : ");int in = Integer.parseInt(input2.readLine());
                        hapusPerusahaan(in);
                        break;
                    case 4 : 
                        System.out.println("index : ");String namalowongan = input2.readLine();
                        for (int i = 0; i < listPerusahaan.size(); i++) {
                            for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                                if(listPerusahaan.get(i).getLowongan(j).getNamaLowongan().equalsIgnoreCase(namalowongan)){
                                    listPerusahaan.get(i).getLowongan(j).getNamaLowongan();
                                    
                                }
                            }
                        }
                        break;
                }
            }
        }catch(ArrayIndexOutOfBoundsException arr){
            System.out.println("kelebihan array");
        }
        
        catch (Throwable ex) {
            System.out.println("error : "+ex.getMessage());
        }

        
        
                
    }
    
    public static void main(String[] args) {
        Aplikasi ap = new Aplikasi();
        ap.menu();
    }
}
