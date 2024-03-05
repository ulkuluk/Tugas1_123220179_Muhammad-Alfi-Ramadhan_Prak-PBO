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
public class skillmenyerang implements modebertarung{
    private int damage;
    private String namaskill;
    
    public skillmenyerang(String namaskill, int damage){
        this.damage = damage;
        this.namaskill = namaskill;
    }
    
    public void menyerang(){
        System.out.println("Menyerang dengan menggunakan skill " + this.namaskill + "dan memberikan damage " + this.damage);
    }
}
