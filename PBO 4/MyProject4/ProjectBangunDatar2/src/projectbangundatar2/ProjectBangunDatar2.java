/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author hp
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang ke 1 : " + pp1.luas(10,5));
        
        PersegiPanjang pp2 = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang ke 2 : " + pp2.luas(3.6,8));
        
        PersegiPanjang pp3 = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang ke 3 : " + pp3.luas(6,8.3));
        
        PersegiPanjang pp4 = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang ke 4 : " + pp4.luas(5.6, 8.8));
        
        PersegiPanjang pp5 = new PersegiPanjang();
        System.out.println("Keliling Persegi Panjang ke 1 : " + pp5.keliling(10,5));
        
        PersegiPanjang pp6 = new PersegiPanjang();
        System.out.println("Keliling Persegi Panjang ke 2 : " + pp6.keliling(3.6,8));
        
        PersegiPanjang pp7 = new PersegiPanjang();
        System.out.println("Keliling Persegi Panjang ke 3 : " + pp7.keliling(6,8.3));
        
        PersegiPanjang pp8 = new PersegiPanjang();
        System.out.println("Keliling Persegi Panjang ke 4 : " + pp8.keliling(5.6, 8.8));
        
        //Persegi
        
        Persegi p1 = new Persegi();
        System.out.println("Luas Persegi ke 1 : " + p1.luas(4.5));
        
        Persegi p2 = new Persegi();
        System.out.println("Luas Persegi ke 2 : " + p2.luas(7));
        
        Persegi p3 = new Persegi();
        System.out.println("Keliling Persegi ke 1 : " + p3.keliling(4.5));
        
        Persegi p4 = new Persegi();
        System.out.println("Keliling Persegi ke 2 : " + p4.keliling(7));
        
        // Lingkaran
        Lingkaran l1 = new Lingkaran();
        System.out.println("Luas Lingkaran ke 1 : " + l1.luas(5));
        
        Lingkaran l2 = new Lingkaran();
        System.out.println("Luas Lingkaran ke 2 : " + l2.luas(7.4));
        
        Lingkaran l3 = new Lingkaran();
        System.out.println("Keliling Lingkaran ke 1 : " + l3.keliling(5));
        
        Lingkaran l4 = new Lingkaran();
        System.out.println("Keliling Lingkaran ke 2 : " + l4.keliling(7.4));
        
        //Segitiga
        Segitiga s1 = new Segitiga();
        System.out.println("Luas Segitiga ke 1 : " + s1.luas(8,10));
        
        Segitiga s2 = new Segitiga();
        System.out.println("Luas Segitiga ke 2 : " + s2.luas(8, 11.5));
        
        Segitiga s3 = new Segitiga();
        System.out.println("Luas Segitiga ke 3 : " + s3.luas(12.2, 9));
        
        Segitiga s4 = new Segitiga();
        System.out.println("Luas Segitiga ke 4 : " + s4.luas(13.9, 20.7));
        
        Segitiga s5 = new Segitiga();
        System.out.println("Keliling Segitiga ke 1 : " + s5.keliling(8,10));
        
        Segitiga s6 = new Segitiga();
        System.out.println("Keliling Segitiga ke 2 : " + s6.keliling(8,11.5));
        
        Segitiga s7 = new Segitiga();
        System.out.println("Keliling Segitiga ke 3 : " + s7.keliling(12.2,9));
        
        Segitiga s8 = new Segitiga();
        System.out.println("Keliling Segitiga ke 4 : " + s8.keliling(13.9,20.7));
        
        
        
        
    }
    
    
}
