/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

/**
 *
 * @author 39333
 */
public class Triangolazione extends Allenamento {
    private int qualitàPassaggi;
    
    public Triangolazione(int qualitàPassaggi) {
        super(Abilità.PAS, "TRIANGOLAZIONE");
        this.qualitàPassaggi = qualitàPassaggi;
    }
    
    @Override
    public int condizioni() {
        return qualitàPassaggi;
    }
}
