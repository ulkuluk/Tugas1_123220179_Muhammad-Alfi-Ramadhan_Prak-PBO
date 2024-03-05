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
public class main {
    public static void main(String[] args){
        karakter player[] = new karakter[2];
        player[0] = new player("argus", 10, 1000);
        player[1] = new player("alucard", 15, 900);
                
        player[0].deskripsi();
        System.out.println("mempunyai total combat power: " + player[0].getcp());
        player[1].deskripsi();
        System.out.println("mempunyai total combat power: " + player[1].getcp());
        
        player[0].setskillmenyerang(new skillmenyerang("tinju maut", 200));
        player[0].setskillmenyerang(new skillmenyerang("real world manipulation", 500));
        
        player[0].serang();
        player[1].serang();
        
    }
}
