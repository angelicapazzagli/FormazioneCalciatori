/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

/**
 *
 * @author 39333
 */
public class Sprint extends Allenamento{
    private int lunghezzaPercorso;
    public Sprint(int lunghezza) {
        super(Abilità.PAC, "SPRINT");
        this.lunghezzaPercorso = lunghezza;
    }
    
    @Override
    public int condizioni() {
        if(lunghezzaPercorso > 20) {
            return 3;
        }
        return 0;
    }
}
