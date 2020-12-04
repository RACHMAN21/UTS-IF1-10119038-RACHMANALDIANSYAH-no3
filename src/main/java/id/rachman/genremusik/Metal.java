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
 * Deskripsi Program : program ini berisi class Metal yang merupakan sub-class
 *                     dari MusicGenre implementasi dari Punk, HeavyMetal
 */

public class Metal extends MusicGenre implements Punk, HeavyMetal {
    public void genreMetal(String artistName) {
        System.out.println("Metal");
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println("Heavy Metal");
    }
    
    @Override
    public void genrePunk(String artistName) {
        System.out.println("Punk");
    }
    
    public void genreGrunge(String artistName) {
        System.out.println("Grunge");
    }
}