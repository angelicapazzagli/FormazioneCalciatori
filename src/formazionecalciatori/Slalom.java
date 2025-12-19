/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

/**
 *
 * @author 39333
 */
public class Slalom extends Allenamento {
    private int numeroOstacoli, velocità;
    
    public Slalom(int nOstacoli, int vel) {
        super(Abilità.DRI, "SLALOM");
        this.numeroOstacoli = nOstacoli;
        this.velocità = vel;
    }
    
    @Override
    public int condizioni() {
        if(numeroOstacoli > 7 && velocità > 7) {
            return 10;
        }
        else if(numeroOstacoli > 5 && velocità > 3) {
            return 5;
        }
        return 3;
    }
}
