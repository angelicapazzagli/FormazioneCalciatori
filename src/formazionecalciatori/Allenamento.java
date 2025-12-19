/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

/**
 *
 * @author 39333
 */
public class Allenamento {
    private Abilità focus;

    public Allenamento(Abilità focus) {
        this.focus = focus;
    }
    
    public Abilità getFocus() {
        return focus;
    }
    
    public int decidiBonus(Allenatore allenatoreScelto) {
        int bonus = 2;
        if(allenatoreScelto.getSpecializzazione() == focus) {
            bonus += 10;
        }
        bonus += allenatoreScelto.getEsperienza();
        return bonus;
    }
    
    public int condizioni() {
        int differenza = 1;
        return differenza;
    }
}
