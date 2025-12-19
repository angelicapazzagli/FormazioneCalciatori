/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

/**
 *
 * @author 39333
 */
public class CalcioPiazzato extends Allenamento {
    private int distanza;
    private boolean piedeForte;
    
    public CalcioPiazzato(int distanza, boolean piedeForte) {
        super(Abilità.SHO, "CALCIO PIAZZATO");
        this.distanza = distanza;
    }
    
    public int probGoal() {
        int base = 50;
        if (distanza > 20) {
            base -= 20;
        }
        if (!piedeForte) {
            base -= 15;
        }
        else {
            base += 15;
        }
        return base;
    }
    
    @Override 
    public int condizioni() {
        int bonus;
        if (distanza > 11 && !piedeForte) {
            bonus = 7;
        } 
        else if (distanza > 11) {
            bonus = 5;
        } 
        else {
            bonus = 3;
        }
        int chance = probGoal();
        if (chance < 50) {
            bonus -= 2;
        }
        return bonus;
    }
}
