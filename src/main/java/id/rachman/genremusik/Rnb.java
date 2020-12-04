/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.genremusik;

/**
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class Rnb yang merupakan sub-class dari
 *                     MusicGenre implementasi dari interface Blues, Jazz
 */

public class Rnb extends MusicGenre implements Blues, Jazz{
    
    @Override
    public void genreJazz(String artistName) {
        System.out.println("Jazz");
    }
    
    @Override
    public void genreBlues(String artistName) {
        System.out.println("Blues");
    }
}