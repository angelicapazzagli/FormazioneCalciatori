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
    
    public int livelloIntesa() {
        if (qualitàPassaggi >= 15) {
            return 5;
        } 
        else if (qualitàPassaggi >= 10) {
            return 3;
        } 
        else if (qualitàPassaggi >= 5) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public int condizioni() {
        return qualitàPassaggi + livelloIntesa();
    }
}
