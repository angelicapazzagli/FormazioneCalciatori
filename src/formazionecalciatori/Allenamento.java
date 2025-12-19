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
    private String nome;
    private Abilità focus;

    public Allenamento(Abilità focus, String nome) {
        this.focus = focus;
        this.nome = nome;
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
    
    @Override
    public String toString() {
        return nome + " [" + focus + "]";
    }
}
