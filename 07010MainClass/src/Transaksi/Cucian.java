/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;
import Pengguna.*;
/**
 *
 * @author ilham-07010
 */
public class Cucian {
    private Pegawai pegawai;
    private Pelanggan pelanggan;
    private float berat,hargaTotal,perKilo = 5000;
    
    public void setPegawai(Pegawai pegawai){
        this.pegawai = pegawai;
    }
    
    private Pegawai getPegawai(){
        return pegawai;
    }
    
    public void setPelanggan (Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    
    private Pelanggan getPelanggan(){
        return pelanggan;
    }
    
    private float getBerat(){
        return berat;
    }

    private float getPerKilo() {
        return perKilo;
    }
           
    public float getHargaTotal(float berat){
        this.berat = berat;
        return berat;
    }
    
    private float getHargaTotal(float berat,float perKilo){
        return this.hargaTotal = berat*perKilo;
    }
    
    public void print(){
        System.out.println("\tNama Pegawai : "+this.getPegawai().getNama());
        System.out.println("\tNama Pelanggan : "+this.getPelanggan().getNama());
        System.out.println("\tBerat Cucian : "+this.getBerat()+" KG.");
        System.out.println("\tHarga Total Cucian : Rp."+this.getHargaTotal(this.getHargaTotal(berat),getPerKilo()));
    }
    
}
