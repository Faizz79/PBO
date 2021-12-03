/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdeganapp;

/**
 *
 * @author acer
 */
public class JumlahAntar {
    // construktor 
    public JumlahAntar(int jumlah_pasokan){
        this.jumlah_pasokan = jumlah_pasokan;
    }
    
    // atribute 
    int jumlah_pasokan;
    int batas_kapasitas_berat = 3000;
    
    // method
    double hitungJumlahAntar(){
        double berat_pasokan = jumlah_pasokan * 1.2;
        double jumlah_antar = Math.ceil(berat_pasokan / batas_kapasitas_berat);
        return jumlah_antar;
    }
    
    
}
