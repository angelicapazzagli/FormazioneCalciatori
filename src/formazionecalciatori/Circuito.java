/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

/**
 *
 * @author 39333
 */
public class Circuito extends Allenamento {
    private int pesi, nRipetizioni;
    
    public Circuito(int pesi, int ripetizioni) {
        super(Abilità.PHY, "CIRCUITO");
        this.pesi = pesi;
        this.nRipetizioni = ripetizioni;
    }
    
    @Override
    public int condizioni() {
        if(pesi > 50 && nRipetizioni > 3) {
            return 7;
        }
        else if(pesi > 30 && nRipetizioni > 2) {
            return 3;
        }
        return 1;
    }
}
