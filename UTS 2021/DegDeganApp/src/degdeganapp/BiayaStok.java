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
public class BiayaStok {
    // construktor
    BiayaStok(int harga_satuan){
        this.harga_satuan = harga_satuan;
    }
    // atribute
    int harga_satuan;
    int jumlah_pasokan_kota_a = 5000;
    int jumlah_pasokan_kota_b = 7500;
    int jumlah_pasokan_kota_c = 8300;
    int jumlah_pasokan_kota_d = 9100;
    
    // method
    long hitungBiayaStok(){
        // memangggil class JumlahTotalPasokan untuk menghitung jumlah Stok
        JumlahTotalPasokan pasokan = new JumlahTotalPasokan(jumlah_pasokan_kota_a, jumlah_pasokan_kota_b, jumlah_pasokan_kota_c, jumlah_pasokan_kota_d);
        long total_stok = pasokan.hitungJumlahPasokan();
        
        long biaya_stok = total_stok * harga_satuan;
        System.out.println("Biaya Total untuk Stok : Rp" + biaya_stok);
        return biaya_stok;
    }
}
