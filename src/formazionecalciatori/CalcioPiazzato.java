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
        super(Abilità.SHO);
        this.distanza = distanza;
    }
    
    @Override 
    public int condizioni() {
        if(distanza > 11 && piedeForte == false) {
            return 7;
        }
        else if(distanza > 11 && piedeForte == true) {
            return 5;
        }
        return 3;
    }
}
