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
public class DegDeganApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hasil Analisa\n");

//        Hitung Total Biaya Transport 
        BiayaTransport bt = new BiayaTransport();
        double total_biaya_transport = bt.hitungTotalBiayaTransport();
        System.out.println("Total Biaya Transport : Rp" + total_biaya_transport);
        
        // Hitung Total Biaya Stok 
        BiayaStok bs = new BiayaStok(8000);
        long total_biaya_stok = bs.hitungBiayaStok();
        System.out.println("Total Biaya Stok : Rp" + total_biaya_stok);
        
        double modal = total_biaya_transport + total_biaya_stok;
        System.out.println("Modal : Rp" + modal);
        
        // Mendefinisikan Nominal Keuntungan 
        double keuntungan = 15000000.0;
        
        double hasil = modal + keuntungan;
        System.out.println("Nominal Hasil Penjualan : Rp" + hasil);
        
        // hitung jumlah total pasokan 
        JumlahTotalPasokan jtp = new JumlahTotalPasokan(5000, 7500, 8300, 9100);
        long jumlah_total_pasokan = jtp.hitungJumlahPasokan();
        
        System.out.println("");
        // Menghitung Harga Jual Minimal Agar Keuntunganya Rp15.000.000,-
        double harga_jual = Math.ceil(hasil / jumlah_total_pasokan);
        System.out.println("Harga Jual Minimum agar tercapai target keuntungan Rp15.000.000 adalah : Rp" + harga_jual);
        
        
                
        // Menghitung Jumlah Total Pasokan
//        JumlahTotalPasokan pasokan = new JumlahTotalPasokan(10, 20, 60, 50);
//        int jumlah_pasokan = pasokan.hitungJumlahPasokan();
//        System.out.println(jumlah_pasokan);
        
        // Menghitung Biaya Stok 
//        BiayaStok stok = new BiayaStok(8000);
//        int result = stok.hitungBiayaStok();
//        System.out.println(result);
        
//        // Menghitung Jumlah Antar 
//        JumlahAntar pengantaran = new JumlahAntar(9000);
//        double result = pengantaran.hitungJumlahAntar();
//        System.out.println(result);
        
        // Menghitung Biaya Satu Kali Antar
//        BiayaSatuKaliAntar biaya1kali = new BiayaSatuKaliAntar(75);
//        int result = biaya1kali.hitungBiayaSatuKaliAntar();
//        System.out.println(result);
        
//        BiayaTransportPerKota bpk = new BiayaTransportPerKota(5500, 5);
//        double result = bpk.hitungBiayaTransportPerKota();
//        System.out.println(result);

        
    }
    
}
