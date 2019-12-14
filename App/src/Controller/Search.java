/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.util.*;
/**
 *
 * @author ilham-07010
 */
public class Search {
    ArrayList<Model> model;
    int i,f,l,m;
    boolean find;
    public Search(){
        model = new ArrayList<>();
    }

    public ArrayList<Model> getModel() {
        return model;
    }
    
    public void binarySearch(ArrayList<Model> model,int id){
        f=0;
        l=model.size();
        m=(f+1)/2;
        
        while(f<=1){
            if (find = false) {
                f = m + 1;
            } else if (find = true) {
                System.out.println(id + "Data ketemu di  " + (m + 1) + ".");
                System.out.println("Nama : "+ model.get(id));
                break;
            } else {
                l = m - 1;
            }
            m = (f + l) / 2;
        }
        if (f > l) {
            System.out.println(model + " is not found.\n");
        }
    }
    
    public void squentialSearch(ArrayList<Model> model,String id){
        for(int a=1; a<model.size(); a++){
            if(id == null ? model.get(a).getId() == null : id.equals(model.get(a).getId())){
                System.out.println("id : "+model.get(a).getId());
                System.out.println("Nama : "+model.get(a).getNama());
            }else{
                System.out.println("DATA YANG DICARI TIDAK ADA");
            }
        }
    }
}
