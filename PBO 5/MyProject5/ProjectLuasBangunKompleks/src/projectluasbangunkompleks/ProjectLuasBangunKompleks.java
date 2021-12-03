/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author hp
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        
        Lingkaran l1 = new Lingkaran();
        
        SetLingkaran s1 = new SetLingkaran();
        
        int jumlah = (int) (p1.hitungLuas(42)+l1.hitungLuas(42));
        System.out.println("Luas Total Bangunan Project 1 : " + jumlah );
        
        //Luas Setengah Lingkaran Besar - Luas Lingkaran Kecil
        int hasil = (int) (s1.hitungLuas(28)- l1.hitungLuas(14));
        System.out.println("Luas Total Bangunan Project 2 : " + hasil );
        
    }
    
}
