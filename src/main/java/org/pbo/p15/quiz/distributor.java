package org.pbo.p15.quiz;

/**
 *
 * @author 
 */
public class distributor {
    String namabarang, jenisbarang;
    Integer harga, qty;

    public distributor(String namabarang, Integer harga, Integer qty) {
        this.namabarang = namabarang;
        this.harga = harga;
        this.qty = qty;
    }

    public String getNama() {
        return namabarang;
    }

    public Integer getHarga() {
        return harga;
    }

    public Integer getQty() {
        return qty;
    }

    
}
