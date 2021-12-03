/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author hp
 */
public class Ubin {

    int lebar;
    int panjang;

    // menghitung luas sebuah ubin
    int hitungLuas(int panjang, int lebar){
       int luas = panjang * lebar;
        return luas;
    }

    double hitungLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
