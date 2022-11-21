package org.pbo.p15.quiz;

public class quiz2data {
    String nama, nik, alamat, telp, pekerjaan, kantor, status, menikah, jumlah_anak;

    void data(String nama, String nik, String alamat, String telp) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.telp = telp;

    }

    void data(String pekerjaan, String kantor) {
        this.pekerjaan = pekerjaan;
        this.kantor = kantor;

    }

    void data(String status, String menikah, String jumlah_anak) {
        this.status = status;
        this.jumlah_anak = jumlah_anak;

    }

}

class iuran extends quiz2data {

    int sampah, keamanan, sumbangan;

    int data(int sampah, int keamanan, int sumbangan) {
        this.sampah = sampah;
        this.keamanan = keamanan;
        this.sumbangan = sumbangan;
        int total = sampah + keamanan + sumbangan;
        return total;

    } 
}

