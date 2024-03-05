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
public class player extends karakter{
    int cp;
    
    void combatpower(){
        this.cp = kekuatan + darah;
    }
    
    public player(String nama, int kekuatan, int darah){
        super(nama, kekuatan, darah);
        combatpower();
    }
    
    public int getcp(){
        return cp;
    }

}
