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
public class BiayaTransportPerKota {
    // construktor
    public BiayaTransportPerKota(int jumlah_pasokan, int jarak ){
        this.jumlah_pasokan = jumlah_pasokan;
        this.jarak_tempuh = jarak;
    }
    
    // atribute
    int jumlah_pasokan;
    int jarak_tempuh;
    
    // method
    double hitungBiayaTransportPerKota(){
        // memanggil class BiayaSatuKaliAntar 
        BiayaSatuKaliAntar b1k = new BiayaSatuKaliAntar(jarak_tempuh);
        long biaya_satu_kali_antar = b1k.hitungBiayaSatuKaliAntar();
        System.out.println("Biaya 1 kali Antar : Rp" + biaya_satu_kali_antar);
        
        // memanggil class JumlahAntar
        JumlahAntar ja = new JumlahAntar(jumlah_pasokan);
        double jumlah_antar = ja.hitungJumlahAntar();
        System.out.println("Jumlah Antar : " + jumlah_antar + " kali");
        
        double biaya_transport_per_kota = biaya_satu_kali_antar * jumlah_antar;
        System.out.println("Biaya Transport : Rp" + biaya_transport_per_kota);
        
        return biaya_transport_per_kota;
    }
    
}
