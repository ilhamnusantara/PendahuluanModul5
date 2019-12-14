/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07010mainclass;
import Pengguna.*;
import Transaksi.Cucian;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ilham-07010
 */
public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pegawai> pegawaiArr = new ArrayList<>();
    static ArrayList<Pelanggan> pelangganArr = new ArrayList<>();
    static ArrayList<Cucian> cucianArr = new ArrayList<>();
    public static void main(String[] args) {
            int menu;
        do {            
            System.out.println("\n\nSistem Informasi Laundry RPL!!!");
            Main.tampilkanData();
            System.out.println("\n\nMenu : ");
            System.out.println("1. Tambah Kasir");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Transaksi Cucian");
            System.out.println("0. Selsai");
            System.out.print("Masukan nomor menu : ");
            menu = scan.nextInt();
            
            switch(menu){
                case 1:
                    Main.tambahKasir();
                    break;
                case 2:
                    Main.tambahPelanggan();
                    break;
                case 3:
                    Main.tambahCucian();
                    break;
                default:
                    menu = 0;
                    System.out.println("Terimah Kasih telah menggunakan sistem informasi laundry RPL!!!!");
            }
        } while (menu != 0);
    }
    
    static void tampilkanData(){
        System.out.println("\nData Pegawai : ");
        for (int i = 0; i < pegawaiArr.size(); i++) {
            pegawaiArr.get(i).print();
        }
        
        System.out.println("\nData Pelanggan : ");
        for (int i = 0; i < pelangganArr.size(); i++) {
            pelangganArr.get(i).print();
        }
        
        System.out.println("\nData Cucian : ");
        for (int i = 0; i < cucianArr.size(); i++) {
            cucianArr.get(i).print();
        }
    }
    
    static void tambahKasir(){
        System.out.println("Tambah Data Pegawai! ");
        Pegawai pegawai = new Pegawai();
        System.out.println("ID Pegawai : " + String.valueOf(pegawaiArr.size()+1));
        pegawai.setId(pegawaiArr.size()+1);
        System.out.print("Nama Pegawai : ");
        pegawai.setNama(scan.next());
        System.out.print("Kata Sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());        
        System.out.print("No Hp Pegawai : ");
        pegawai.setNoHp(scan.nextInt());    
        
        pegawaiArr.add(pegawai);
    }
    
    static void tambahPelanggan(){
        System.out.println("Tambah Data Pelanggan!");
        Pelanggan pelanggan = new Pelanggan();
        System.out.println("ID Pelanggan : " + String.valueOf(pelangganArr.size()+1));
        pelanggan.setId(pelangganArr.size()+1);
        System.out.print("Nama Pelanggan : ");
        pelanggan.setNama(scan.next()); 
        System.out.print("No HP Pelanggan : ");
        pelanggan.setNoHp(scan.nextInt());    
        
        pelangganArr.add(pelanggan);
    }
    
    static void tambahCucian(){
        System.out.println("Tambah Data Cucian!");
        Cucian cucian = new Cucian();
        if(pegawaiArr.isEmpty() && pelangganArr.isEmpty()){
            System.out.println("Data masih kosong!");
        }else{
        System.out.print("ID Pegawai : ");
        cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
        System.out.print("ID Pelanggan : ");
        cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
        System.out.print("Berat Cucian (KG) : ");
        cucian.getHargaTotal(scan.nextFloat());
        
        cucianArr.add(cucian);
        }
    }    
}
    

