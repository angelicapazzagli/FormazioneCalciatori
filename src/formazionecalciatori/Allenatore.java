/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author 39333
 */
public class Allenatore {
    private String nome;
    private Abilità specializzazione;
    private int esperienza;
    Random r = new Random();
    private ImageIcon icon;

    public Allenatore(Abilità specializzazione, String nome) {
        this.specializzazione = specializzazione;
        this.nome = nome;
        this.esperienza = r.nextInt(11);
    }
    
    public String getNome() {
        return nome;
    }
    
    public Abilità getSpecializzazione() {
        return specializzazione;
    }
    
    public int getEsperienza() {
        return esperienza;
    }
    
    public ImageIcon getIcon() {
        return icon;
    }
    
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "Specializzazione: " + specializzazione + " Esperienza: " + esperienza;
    }
}
