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
public class Model extends Barang{
    String id;
    String produk;

    public Model(String id,String produk,String nama,int jumlah ) {
        super(nama, jumlah);
        this.id = id;
        this.produk = produk;
    }
    @Override
    public String getProduk() {
        return produk;
    }

    @Override
    void setProduk(String produk) {
        this.produk = produk;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    
    public String getId() {
        return id;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    
}
