/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankedua;

/**
 *
 * @author Careen Emilza
 */
public class PencakSilat {
    private String seragam;
    private String alat;
    
    public PencakSilat(){ 
        System.out.println("Halo dari konstruktor Pencak Silat");
        this.setseragam("Baju");
        this.setalat("Samsak");
        
    }

    /**
     * @return the seragam
     */
    public String getseragam() {
        return seragam;
    }

    /**
     * @param seragam the seragam to set
     */
    public void setseragam(String Seragam) {
        this.seragam = seragam;
    }

    /**
     * @return the alat
     */
    public String getalat() {
        return alat;
    }

    /**
     * @param alat the alat to set
     */
    public void setalat(String Alat) {
        this.alat = alat;
    }
    
    public void seragam(){
        System.out.println("Seragam yang dipakai terdapat baju dan celana");
    }
    
    public void alat(){
        System.out.println("Samsak adalah alat yang digunakan");
    }
}


   