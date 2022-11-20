/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pbo.p15.quiz;

/**
 *
 * @author a
 */
public class quiz1distributor implements quiz1hitung {

    Integer harga, qty, jumlah;
    String jBarang, nBarang;

    @Override
    public void hitung(Integer harga, Integer qty) {
        this.harga = harga;
        this.qty = qty;
    }
    
    //jbarang jumlah barang
    //nbarang nama barang
    public void list(String jBarang, String nBarang, int jumlah, int harga) {
       this.jBarang = jBarang;
       this.nBarang = nBarang;
       this.jumlah = jumlah;
       this.harga = harga;     
    }
    
    
}
