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
public class JumlahTotalPasokan {
    // construktor 
    public JumlahTotalPasokan(int pasokan_a){
        this.pasokan_kota_a = pasokan_a;
    }
    public JumlahTotalPasokan(int pasokan_a, int pasokan_b){
        this.pasokan_kota_a = pasokan_a;
        this.pasokan_kota_b = pasokan_b;
    }
    public JumlahTotalPasokan(int pasokan_a, int pasokan_b, int pasokan_c){
        this.pasokan_kota_a = pasokan_a;
        this.pasokan_kota_b = pasokan_b;
        this.pasokan_kota_c = pasokan_c;
    }
    public JumlahTotalPasokan(int pasokan_a, int pasokan_b, int pasokan_c, int pasokan_d){
        this.pasokan_kota_a = pasokan_a;
        this.pasokan_kota_b = pasokan_b;
        this.pasokan_kota_c = pasokan_c;
        this.pasokan_kota_d = pasokan_d;
    }
   
    
    // atribute
    long pasokan_kota_a;
    long pasokan_kota_b;
    long pasokan_kota_c;
    long pasokan_kota_d;
    // method 
    // penerapan overloading untuk menyesuaikan jumlah input, maksimak jumlah input = 4
    long hitungJumlahPasokan(){
        long jumlah_pasokan = pasokan_kota_a + pasokan_kota_b + pasokan_kota_c + pasokan_kota_d; 
        System.out.println("Jumlah Total Pasokan : " + jumlah_pasokan + " buah");
        return jumlah_pasokan;
    }
    
    
    
    
//    int hitungJumlahPasokan(int pasokan_kota_a){
//        int jumlah_pasokan = pasokan_kota_a;
//        return jumlah_pasokan;
//    }
//    
//    int hitungJumlahPasokan(int pasokan_kota_a, int pasokan_kota_b){
//        int jumlah_pasokan = pasokan_kota_a + pasokan_kota_b;
//        return jumlah_pasokan;
//    }
//    
//    int hitungJumlahPasokan(int pasokan_kota_a, int pasokan_kota_b, int pasokan_kota_c){
//        int jumlah_pasokan = pasokan_kota_a + pasokan_kota_b + pasokan_kota_c;
//        return jumlah_pasokan;
//    }
//    
//    int hitungJumlahPasokan(int pasokan_kota_a, int pasokan_kota_b, int pasokan_kota_c, int pasokan_kota_d){
//        int jumlah_pasokan = pasokan_kota_a + pasokan_kota_b + pasokan_kota_c + pasokan_kota_d;
//        return jumlah_pasokan;
//    }
    
}
