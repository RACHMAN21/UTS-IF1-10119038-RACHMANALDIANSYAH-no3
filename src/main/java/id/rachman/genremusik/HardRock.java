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
 * Deskripsi Program : program ini berisi class HardRock yang merupakan sub-class
 *                     dari MusicGenre implementasi dari PopRock, ProgressiveRock
 *                     PsychedellicRock
 */

public class HardRock extends MusicGenre implements PopRock, ProgressiveRock, PsychedellicRock{
    public void genreHardRock(String artistName) {
        System.out.println("Hard Rock");
    }
    
    @Override
    public void genrePopRock(String artistName) {
        System.out.println("Pop Rock");
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println("Progressive Rock");
    }
    
    @Override
    public void genrePsychedellicRock(String artistName) {
        System.out.println("Psychedellic Rock");
    }
}