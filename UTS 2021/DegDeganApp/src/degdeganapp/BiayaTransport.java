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
public class BiayaTransport {
    // costruktor 
    
   // a;tribute
    String nama_kota_a = "Boyolali";
    int jumlah_pasokan_kota_a = 5000;
    int jarak_tempuh_kota_a = 15;
    
    String nama_kota_b = "Salatiga";
    int jumlah_pasokan_kota_b = 7500;
    int jarak_tempuh_kota_b = 35;
    
    String nama_kota_c = "Klaten";
    int jumlah_pasokan_kota_c = 8300;
    int jarak_tempuh_kota_c = 30;
   
    String nama_kota_d = "Kudus";
    int jumlah_pasokan_kota_d = 9100;
    int jarak_tempuh_kota_d = 75;
   // method 
    double hitungTotalBiayaTransport(){
       // memanggil class biaya transport per kota untuk
       // menghitung biaya, transport per kota
       System.out.println("Nama Kota : " + nama_kota_a);
       BiayaTransportPerKota btka = new BiayaTransportPerKota(jumlah_pasokan_kota_a, jarak_tempuh_kota_a);
       double biaya_transport_kota_a = btka.hitungBiayaTransportPerKota();
       System.out.println("");
       
       System.out.println("Nama Kota : " + nama_kota_b);
       BiayaTransportPerKota btkb = new BiayaTransportPerKota(jumlah_pasokan_kota_b, jarak_tempuh_kota_b);
       double biaya_transport_kota_b = btkb.hitungBiayaTransportPerKota();
       System.out.println("");
       
       System.out.println("Nama Kota : " + nama_kota_c);
       BiayaTransportPerKota btkc = new BiayaTransportPerKota(jumlah_pasokan_kota_c, jarak_tempuh_kota_c);
       double biaya_transport_kota_c = btkc.hitungBiayaTransportPerKota();
       System.out.println("");
       
       System.out.println("Nama Kota : " + nama_kota_d);
       BiayaTransportPerKota btkd = new BiayaTransportPerKota(jumlah_pasokan_kota_d, jarak_tempuh_kota_d);
       double biaya_transport_kota_d = btka.hitungBiayaTransportPerKota();
       System.out.println("");
       
       double total_biaya_transport = biaya_transport_kota_a + biaya_transport_kota_b + biaya_transport_kota_c + biaya_transport_kota_d;
       return total_biaya_transport;
       
       
   }
}
