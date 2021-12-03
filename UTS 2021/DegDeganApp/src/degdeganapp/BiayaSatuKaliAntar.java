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
public class BiayaSatuKaliAntar {
    // construktor
    public BiayaSatuKaliAntar(int jarak_tempuh){
        this.jarak_tempuh = jarak_tempuh;
    }
    
    // atribute
    int jarak_tempuh;
    
    // method 
    long hitungBiayaSatuKaliAntar(){
        long biaya = (jarak_tempuh / 5 ) * 700000;
        return biaya;
    }
}
