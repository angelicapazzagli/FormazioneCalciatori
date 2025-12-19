/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

import java.util.ArrayList;

/**
 *
 * @author 39333
 */
public class Squadra {
    private Calciatore calciatore;
    private ArrayList<Allenamento> allenamenti;
    private ArrayList<Allenatore> allenatori;
    
    public Squadra(Calciatore c) {
        this.calciatore = c;
        allenamenti = new ArrayList<>();
        allenatori = new ArrayList<>();
    }
    
    public void aggiungiAllenamento(Allenamento a) {
        if(!allenamenti.contains(a) && a != null) {
            allenamenti.add(a);
        }
    }
    
    public void rimuoviAllenamento(Allenamento a) {
        if(allenamenti.contains(a) && a != null) {
            allenamenti.remove(a);
        }
    }
    
    public void aggiungiAllenatore(Allenatore a) {
        if(!allenatori.contains(a) && a != null) {
            allenatori.add(a);
        }
    }
    
    public void rimuoviAllenatore(Allenatore a) {
        if(allenatori.contains(a) && a != null) {
            allenatori.remove(a);
        }
    }
    
    public boolean addAllenatore(Allenatore a) {
        if (allenatori.size() < 2) {
            allenatori.add(a);
            return true;
        }
        return false;
    }

    public boolean addAllenamento(Allenamento a) {
        if (allenamenti.size() < 2) {
            allenamenti.add(a);
            return true;
        }
        return false;
    }

    public ArrayList<Allenatore> getAllenatori() {
        return allenatori;
    }

    public ArrayList<Allenamento> getAllenamenti() {
        return allenamenti;
    }
    
    public void eseguiAllenamento(Allenamento allenamentoScelto, Allenatore allenatoreScelto) {
        calciatore.eseguiAllenamento(allenamentoScelto, allenatoreScelto);
    }
    
    public void aiutoLeggenda() {
        calciatore.aiutoLeggenda();
    }
    
    public void infortunio() {
        calciatore.infortunio();
    }
}
