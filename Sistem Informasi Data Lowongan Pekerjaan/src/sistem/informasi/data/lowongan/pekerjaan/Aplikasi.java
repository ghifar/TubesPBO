/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.data.lowongan.pekerjaan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Givanni
 */
public class Aplikasi {

    ArrayList<Perusahaan> listPerusahaan = new ArrayList<>();
    ArrayList<Pelamar> listPelamar = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void data1() {
        addPerusahaan("Abu Dzar Al Ghiffari", "NIKE");
        addPerusahaan("Eka Nugraha S", "ADIDAS");
        addPerusahaan("Givanni T", "ROXY");
        getPerusahaan(0).createLowongan("L001", "kasir", "20 Maret 2018");
        getPerusahaan(0).createLowongan("L002", "officeboy", "20 Maret 2018");
        getPerusahaan(1).createLowongan("L001", "sales", "20 Agustus 2019");
        getPerusahaan(2).createLowongan("L001", "manager", "21 juni 2019");

        addPelamar("uba", "P001");
        addPelamar("ake", "P002");
        addPelamar("innavig", "P003");
        getPelamar(0).createBerkas("B001", "Doc", "20 maret 2099");
        getPelamar(1).createBerkas("B002", "Docs", "23 maret 2099");
        getPelamar(2).createBerkas("B003", "Docu", "21 maret 2099");
    }

    public void addPerusahaan(String nama, String namaPerusahaan) {
        Perusahaan p = new Perusahaan(nama, namaPerusahaan);

        listPerusahaan.add(p);
    }

    public void addPelamar(String nmPelamar, String idPelamar) {
        Pelamar pe = new Pelamar(nmPelamar, idPelamar);
        listPelamar.add(pe);
    }

    public Pelamar getPelamar(int index) {
        return listPelamar.get(index);
    }

    public Perusahaan getPerusahaan(int index) {

        return listPerusahaan.get(index);
    }

    public void hapusPelamar(int index) {
        this.listPelamar.remove(index);
    }

    public void hapusPerusahaan(int index) {
        this.listPerusahaan.remove(index);
    }

    public void updatePerusahan(int indexYgMauDiupdate, Perusahaan dataYgBaru) {
        listPerusahaan.set(indexYgMauDiupdate, dataYgBaru);
    }

    public void searchPerusahaan(String namaPerusahaan) {
        for (int i = 0; i < listPerusahaan.size(); i++) {
            if (listPerusahaan.get(i).getNamaPerusahaan().equalsIgnoreCase(namaPerusahaan)) {
                System.out.println("===============" + listPerusahaan.get(i).getNamaPerusahaan() + "===============");
                System.out.println("pemilik perusahaan : " + listPerusahaan.get(i).getNamaOrang());
                System.out.println("Lowongan yang tersedia : ");
                if (listPerusahaan.get(i).getnLowongan() != 0) {
                    for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                        System.out.println((j + 1) + ". " + listPerusahaan.get(i).getLowongan(j).getNamaLowongan());
                    }
                } else {
                    System.out.println("Tidak ada");
                }
                System.out.println("==================================");
            }

        }
    }

    public void searchPelamar(String namaPelamar) {
        for (int i = 0; i < listPelamar.size(); i++) {
            if (getPelamar(i).getNamaOrang().equalsIgnoreCase(namaPelamar)) {
                System.out.println("=============================================");
                System.out.println("ID                      : " + listPelamar.get(i).getIdPelamar());
                System.out.println("Nama                    : " + listPelamar.get(i).getNamaOrang());

                System.out.println("Berkas : ");
                if (listPelamar.get(i).getnBerkas() != 0) {
                    for (int j = 0; j < listPelamar.get(i).getnBerkas(); j++) {
                        System.out.println("Id berkas           : " + listPelamar.get(i).getBerkas(j).getIdBerkas());
                        System.out.println("Jenis Berkas        : " + listPelamar.get(i).getBerkas(j).getJenisBerkas());
                        System.out.println("Tgl Masuk Berkas    : " + listPelamar.get(i).getBerkas(j).getTglMasukBerkas());
                    }
                } else {
                    System.out.println("Berkas belum diisi");
                }
                System.out.println("===============================================");

            }
        }
    }

    public void searchLowongan(String namaLowongan) {
        for (int i = 0; i < listPerusahaan.size(); i++) {
            for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                if (listPerusahaan.get(i).getLowongan(j).getNamaLowongan().equalsIgnoreCase(namaLowongan)) {
                    System.out.println("lowongan tersebut tersedia pada perusahaan " + listPerusahaan.get(i).getNamaPerusahaan());

                }
            }
        }
    }

    public void displayPelamar() {
        for (int i = 0; i < listPelamar.size(); i++) {
            System.out.println("=============================================");
            System.out.println("ID                      : " + listPelamar.get(i).getIdPelamar());
            System.out.println("Nama                    : " + listPelamar.get(i).getNamaOrang());

            System.out.println("Berkas : ");
            if (listPelamar.get(i).getnBerkas() != 0) {
                for (int j = 0; j < listPelamar.get(i).getnBerkas(); j++) {
                    System.out.println("Id berkas           : " + listPelamar.get(i).getBerkas(j).getIdBerkas());
                    System.out.println("Jenis Berkas        : " + listPelamar.get(i).getBerkas(j).getJenisBerkas());
                    System.out.println("Tgl Masuk Berkas    : " + listPelamar.get(i).getBerkas(j).getTglMasukBerkas());

                }

            } else {
                System.out.println("Berkas belum diisi");
            }
            System.out.println("===============================================");

        }

    }

    public void displayPerusahaan() {
//        for(Perusahaan p: listPerusahaan){
//            System.out.println(p.getAlamat());
//            System.out.println(p.getName());
//        }

        for (int i = 0; i < listPerusahaan.size(); i++) {
            System.out.println("===============" + listPerusahaan.get(i).getNamaPerusahaan() + "===============");
            System.out.println("pemilik perusahaan : " + listPerusahaan.get(i).getNamaOrang());
            System.out.println("Lowongan yang tersedia : ");
            if (listPerusahaan.get(i).getnLowongan() != 0) {
                for (int j = 0; j < listPerusahaan.get(i).getnLowongan(); j++) {
                    System.out.println((j + 1) + ". " + listPerusahaan.get(i).getLowongan(j).getNamaLowongan());
                }
            } else {
                System.out.println("Tidak ada");
            }
            System.out.println("==================================");

        }
    }
    
    public void displayBerkasDiTerima(int indeksPerusahaan, int indeksLowongan){
         for (int i = 0; i < getPerusahaan(indeksPerusahaan).getLowongan(indeksLowongan).getnBTerima(); i++) {
                                    System.out.println("\t Diterima Sebagai " + getPerusahaan(indeksPerusahaan).getLowongan(indeksLowongan).getNamaLowongan());
                                    System.out.println("id Berkas    : " + getPerusahaan(indeksPerusahaan).getLowongan(indeksLowongan).getBerkasDiterima(i).getIdBerkas());
                                    System.out.println("jenis bekas  : " + getPerusahaan(indeksPerusahaan).getLowongan(indeksLowongan).getBerkasDiterima(i).getJenisBerkas());
                                    System.out.println("tgl Masuk Berkas : " + getPerusahaan(indeksPerusahaan).getLowongan(indeksLowongan).getBerkasDiterima(i).getTglMasukBerkas());
                                    System.out.println("=====================================================================");
                                }
    }
    public void menu() {
        try {
            while (true) {
                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("        MENU    ");
                System.out.println("1. Menu Perusahaan");
                System.out.println("2. Menu Pelamar   ");
                System.out.println("Pilihan = ");
                int pilihanMenu = input.nextInt();

                switch (pilihanMenu) {

                    case 1:
                        System.out.println("1. Add       perusahaan");
                        System.out.println("2. Display   perusahaan");
                        System.out.println("3. Delete    perusahaan");
                        System.out.println("4. Search    lowongan");
                        System.out.println("5. Add       lowongan");
                        System.out.println("6. Delete    lowongan");
                        System.out.println("7. saerch    Perusahaan");
                        System.out.println("8. liat Pelamar Lowongan");
                        System.out.println("9. liat berkas yang diterima");

                        System.out.println("Pilihan = ");
                        int pilihanSubMenu = input.nextInt();

                        switch (pilihanSubMenu) {
                            case 1:
                                System.out.print("nama pemilik : ");
                                String nama = input2.readLine();
                                System.out.print("nama perusahaan : ");
                                String namaP = input2.readLine();
                                addPerusahaan(nama, namaP);
                                break;
                            case 2:
                                displayPerusahaan();
                                break;
                            case 3:
                                System.out.println("index yg di hapus : ");
                                int in = Integer.parseInt(input2.readLine());
                                hapusPerusahaan(in);
                                break;
                            case 4:
                                System.out.println("cari nama lowongan : ");
                                String namaLowongan = input2.readLine();
                                searchLowongan(namaLowongan);
                                break;
                            case 5:
                                System.out.println("Index perusahaan : ");
                                int index = Integer.parseInt(input2.readLine());
                                System.out.println("id Lowongan : ");
                                String id = input2.readLine();
                                System.out.println("Nama Lowongan : ");
                                String nmLowongan = input2.readLine();
                                System.out.println("Deadline : ");
                                String deadline = input2.readLine();
                                getPerusahaan(index).createLowongan(id, nmLowongan, deadline);
                                break;
                            case 6:
                                System.out.println("index perusahaan yang ingin dihapus : ");
                                int indexPer = Integer.parseInt(input2.readLine());

                                System.out.println("id lowongan yang akan dihapus : ");
                                String namaL = input2.readLine();
                                getPerusahaan(indexPer).remLowongan(namaL);
                                break;

                            case 7:
                                System.out.println("cari nama perusahaan : ");
                                String namaPerusahaan = input2.readLine();
                                searchPerusahaan(namaPerusahaan);

                                break;
                            case 8:
                                System.out.println("pilih index perusahaan : ");
                                int indexPerusahaan = Integer.parseInt(input2.readLine());

                                System.out.println("pilih index lowongan : ");
                                int indexlow = Integer.parseInt(input2.readLine());
                                for (int i =0 ; i< listPerusahaan.size();i++){
                                    for(int j=0;j< listPerusahaan.get(i).getnLowongan();j++){
                                        System.out.println("ID berkas Pelamar : "+getPerusahaan(indexPerusahaan).getLowongan(indexlow).getBerkasMasuk(j).getIdBerkas());
                                    }
                                    break;
                                }
                                
                                
                                System.out.println("1. terima berkas ?");
                                System.out.println("2. kembali ke Menu awal");
                                int opsi = Integer.parseInt(input2.readLine());
                                if (opsi == 1) {
                                    System.out.println("pilih indeks berkas yang ingin diterima ");
                                    int indeksB = Integer.parseInt(input2.readLine());
                                    System.out.println("Pilih indeks pelamar yang ingin diterima ");
                                    int indeksP = Integer.parseInt(input2.readLine());
                                    getPerusahaan(indexPerusahaan).getLowongan(indexlow).terimaBerkas(getPelamar(indeksP).getBerkas(indeksB));
                                }
//                                else if(opsi ==2 ){
//                                    System.out.println("pilih id yang akan dihapus : ");
//                                   String ido = input2.readLine();
//                                    getPerusahaan(indexPerusahaan).getLowongan(indexlow).remBerkas(ido);
//                                }

                                break;
                            case 9:
                                System.out.println("masukkan indeks perusahaan : ");
                                int iindexper = Integer.parseInt(input2.readLine());
                                System.out.println("masukkan indeks lowongan yang ingin diliat ");
                                int iindexlow = Integer.parseInt(input2.readLine());
                                //System.out.println(getPerusahaan(iindexper).getLowongan(iindexlow).getnBTerima());
                                displayBerkasDiTerima(iindexper, iindexlow);
                                break;
                               
                        }
                        break;

                    case 2:
                        System.out.println("1. add      pelamar ");
                        System.out.println("2. display  pelamar ");
                        System.out.println("3. delete   pelamar ");
                        System.out.println("4. search   pelamar ");
                        System.out.println("5. create   berkas ");
                        System.out.println("6. masukkan minat lowongan kerja");

                        int subPilihan = input.nextInt();
                        switch (subPilihan) {
                            case 1:
                                System.out.print("Nama      : ");
                                String nama = input2.readLine();
                                System.out.print("Id pelamar : ");
                                String id = input2.readLine();
                                addPelamar(nama, id);
                                break;

                            case 2:
                                displayPelamar();
                                break;
                            case 3:
                                System.out.println("hapus index pelamar : ");
                                int namaPel = Integer.parseInt(input2.readLine());
                                hapusPelamar(namaPel);
                                break;
                            case 4:
                                System.out.println("cari nama pelamar : ");
                                String nmPel = input2.readLine();
                                searchPelamar(nmPel);
                                break;
                            case 5:
                                System.out.println("Index Pelamar : ");
                                int indexPelamar = Integer.parseInt(input2.readLine());
                                System.out.println("Id berkas : ");
                                String idBerkas = input2.readLine();
                                System.out.println("Jenis Berkas : ");
                                String jenisBerkas = input2.readLine();
                                System.out.println("Tanggal Masuk Berkas : ");
                                String tglMasuk = input2.readLine();
                                getPelamar(indexPelamar).createBerkas(idBerkas, jenisBerkas, tglMasuk);
                                break;
                            case 6:
                                System.out.println("pilih index perusahaan ");
                                int pilihindexper = Integer.parseInt(input2.readLine());
                                System.out.println(getPerusahaan(pilihindexper).getNamaPerusahaan());
                                System.out.println("pilih index pelamar : ");
                                int pilihindex = Integer.parseInt(input2.readLine());
                                System.out.println(getPelamar(pilihindex).getNamaOrang());
                                System.out.println("index berkas : ");
                                int indeksBerkas = Integer.parseInt(input2.readLine());
                                System.out.println(getPelamar(pilihindex).getBerkas(indeksBerkas).getIdBerkas());
                                System.out.println("index lowongan : ");
                                int indexLowongan = Integer.parseInt(input2.readLine());
                                System.out.println(getPerusahaan(pilihindexper).getLowongan(indexLowongan).getNamaLowongan());

                                getPerusahaan(pilihindexper).getLowongan(indexLowongan).addBerkas(getPelamar(pilihindex).getBerkas(indeksBerkas));

                        }
                }
            }
        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("kelebihan array");
        } catch (Throwable ex) {
            System.out.println("error : " + ex.getMessage());
        }

    }

    public static void main(String[] args) {
        Aplikasi ap = new Aplikasi();
        ap.data1();
        ap.menu();
    }
}
