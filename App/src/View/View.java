/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;
import Controller.*;
import java.util.*;
public class View {
    static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Model> models = new ArrayList<>();
        Search searchs = new Search();
        int index = 0;
        do{
        System.out.println("TOKO ITATS");
        System.out.println("1. Masukkan datang");
        System.out.println("2. Cari data anda");
        System.out.print("Pilih menu : ");
        int pilih = inp.nextInt();
        switch(pilih){
            case 1 :
                System.out.println("id : "+String.valueOf(models.size()+1));
                String id = String.valueOf(models.size()+1);
                System.out.print("Nama Produk : ");
                String namPro = inp.next();
                System.out.print("Nama Barang : ");
                String namBar = inp.next();
                System.out.print("Jumlah barang : ");
                int jmlh = inp.nextInt();
                models.add(new Model(id, namPro, namBar, jmlh));
                break;
            case 2 :
                System.out.println("Cari data dengan methode");
                System.out.println("1. Binary Search");
                System.out.println("2. Squensial Seacrh");
                System.out.print("Pilih menu : ");
                int pil = inp.nextInt();
                switch(pil){
                    case 1 :
                        System.out.println("Binary Search");
                        System.out.print("Masukkan id barang : ");
                        String idBin = inp.next();
                    //elektronik = sort.byNameElektronikAsc(elektronik);
                        break;
                    case 2 :
                        System.out.println("Sequensial Search");
                        System.out.print("Masukkan id barang : ");
                        String idSeq = inp.next();
                        searchs.squentialSearch(models, idSeq);
                        break;
                }
                break;
        }index = 0;
    }while(index == 0);    
    }
}
