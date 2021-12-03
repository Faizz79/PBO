/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author hp
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Operasi A = new Operasi();
        System.out.println("a: " + A.jumlahkan(3,4));
        System.out.println("b: " + A.jumlahkan(4,7,-9));
        System.out.println("c: " + A.jumlahkan(3.4,-0.002,0.12313));
        
       Operasi B = new Operasi();
       System.out.println("a: " + B.perkalian(3,4));
       System.out.println("b: " + B.perkalian(8, 0.6));
       System.out.println("c: " + B.perkalian(9, 6, 8.7));
       
    }
    
}
