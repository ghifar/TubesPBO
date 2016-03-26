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

    private BerkasLamaran[] berkasMasuk = new BerkasLamaran[50];
    private BerkasLamaran[] berkasDiterima = new BerkasLamaran[50];
    private String idLowongan;
    private String deadline;
    private int nBerkas = 0;
    private int nBTerima = 0;
    private String nmLowongan;

    Lowongan(String idLowongan, String nm, String deadline) {
        this.idLowongan = idLowongan;
        this.deadline = deadline;
        this.nmLowongan = nm;
    }

    public String getNamaLowongan() {
        return this.nmLowongan;
    }

    public int getnBerkas() {
        return this.nBerkas;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public String getIdLowongan() {
        return this.idLowongan;
    }

    public void addBerkas(BerkasLamaran b) {
        this.berkasMasuk[nBerkas] = b;
        nBerkas++;
    }

    public BerkasLamaran getBerkasMasuk(int index) {
        return berkasMasuk[index];
    }

    public BerkasLamaran getBerkasMasuk(String id) {
        for (int i = 0; i < nBTerima; i++) {
            if (id.equals(this.berkasMasuk[i].getIdBerkas())) {
                return berkasMasuk[i];
            }

        }
        return null;
    }

    public void terimaBerkas(BerkasLamaran b) {
        if (nBerkas > nBTerima) {
            this.berkasDiterima[nBTerima] = b;
            nBTerima++;
            nBerkas--;
        }
    }

    public int getnBTerima() {
        return this.nBTerima;
    }

    public BerkasLamaran getBerkasDiterima(int index) {
        return berkasDiterima[index];
    }

    public void remBerkas(String index) {
        int getIndex = -2;
        for (int i = 0; i < nBerkas; i++) {
            if (index.equals(this.berkasMasuk[i].getIdBerkas())) {
                getIndex = i;
                break;
            }
        }
        for (int i = getIndex + 1; i < nBerkas; i++) {
            berkasMasuk[i - 1] = berkasMasuk[i];
        }
        nBerkas--;
    }

}
