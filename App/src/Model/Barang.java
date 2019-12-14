/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ilham-07010
 */
public abstract class Barang {
    String nama;
    int jumlah;
    
    abstract String getProduk();
    abstract void setProduk(String produk);
            
    public Barang(String nama,int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }
    
    
    
}
