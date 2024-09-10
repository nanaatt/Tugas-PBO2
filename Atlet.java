/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Careen Emilza
 */
public class Atlet extends PencakSilat implements AtletOlahraga, Latihan, Pertandingan {

    public Atlet() {
        System.out.println("Halo dari konstruktor Atlet");
    }

    @Override
    public void gaya() {
        System.out.println("Atlet melakukan beragam gaya");
    }

    @Override
    public void berlatih() {
        System.out.println("Atlet selalu berlatih");
    }

    @Override
    public void tanding() {
        System.out.println("Atlet melakukan tanding");
    }
    
    public void seragam(){
        System.out.println("Seragam yang dipakai terdapat lambang");
    }
    
    public void alat(){
        System.out.println("Samsak adalah salah satu alat yang digunakan");
    }
    
    public void cek(){
        super.seragam();
        this.seragam();
        super.alat();
        this.alat();
    }
}
