/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author alfi
 */
public abstract class karakter {
    String nama;
    int kekuatan;
    int playercp = ((player) this).getcp();
    int darah;
    modebertarung skillmenyerang;
    
    karakter(String nama, int kekuatan, int darah){
        this.nama = nama;
        this.kekuatan = kekuatan;
        this.darah = darah;
    }
    
    public void setskillmenyerang (modebertarung skillmenyerang){
        this.skillmenyerang = skillmenyerang;
    }
    
    public void serang(){
        System.out.println(this.nama + " menyerang ");
        this.skillmenyerang.menyerang();
         
    }
    
    abstract void combatpower();
    
    public int getcp(){
        return this.playercp;
    }
    
    public void deskripsi(){
        System.out.println("Player bernama " + nama + " memiliki kekuatan " + kekuatan +" dan memiliki darah " + darah);
        
    }
}



