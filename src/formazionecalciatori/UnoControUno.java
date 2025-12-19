/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

/**
 *
 * @author 39333
 */
public class UnoControUno extends Allenamento {
    private int agilitàAvversario;
    
    public UnoControUno(int agilità) {
        super(Abilità.DEF, "UNO CONTRO UNO");
        this.agilitàAvversario = agilità;
    }
    
    @Override
    public int condizioni() {
        if(agilitàAvversario > 75) {
            return 7;
        }
        else if(agilitàAvversario > 50) {
            return 5;
        }
        else if(agilitàAvversario > 25) {
            return 3;
        }
        return 0;
    }
}
