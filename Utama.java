/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Careen Emilza
 */
public class Utama {

    public static void main(String[] args) {
        //KONSTRUKTOR
        System.out.println("Konstruktor: ");
        Atlet belaDiri = new Atlet();
        System.out.println("Pencak silat menggunakan seragam: " + belaDiri.getseragam());
        System.out.println("");
  
        // Casting dari Seni ke PencakSilat
        PencakSilat pencakSilatKeAtlet = (PencakSilat) belaDiri;
        System.out.println("Casting: ");
        System.out.println("Alat yang digunakan: " + pencakSilatKeAtlet.getalat());
        System.out.println("");
        
        //super and this
        System.out.println("Super and this: ");
        belaDiri.cek();
        System.out.println("");

        //INTERFACE
        System.out.println("Interface: ");
        Atlet Olahraga = new Atlet();
        System.out.println("Interface: ");
        Olahraga.gaya();
        Olahraga.berlatih();
        Olahraga.tanding();
    }
}
