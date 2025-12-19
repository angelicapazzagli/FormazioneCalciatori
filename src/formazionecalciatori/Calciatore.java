/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formazionecalciatori;

import java.util.Random;

/**
 *
 * @author 39333
 */
public class Calciatore {
    private String nome;
    private int velocità, tiro, passaggio, dribbling, difesa, fisico;
    Random r = new Random();

    public Calciatore(String nome) {
        this.nome = nome;
        this.velocità = 0;
        this.tiro = 0;
        this.passaggio = 0;
        this.dribbling = 0;
        this.difesa = 0;
        this.fisico = 0;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int livellaValori(int valore) {
        if(valore > 99) {
            return 99;
        }
        else if(valore < 0) {
            return 0;
        }
        return valore;
    }
    
    public int getFisico() {
        return fisico;
    }
    
    public String getAbilità() {
        return "<html>PAC " + velocità + "    SHO " + tiro + "<br>"
                + "PAS " + passaggio + "    DRI " + dribbling + "<br>"
                + "DEF " + difesa + "    PHY " + fisico + "</html>";
    }
    
    public String getOverall() {
        return (velocità + tiro + passaggio + dribbling + difesa + fisico) / 6 + "";
    }
    
    public void eseguiAllenamento(Allenamento allenamentoScelto, Allenatore allenatoreScelto) {
        int miglioramento = allenamentoScelto.decidiBonus(allenatoreScelto);
        miglioramento += allenamentoScelto.condizioni();
        if(null != allenamentoScelto.getFocus()) switch (allenamentoScelto.getFocus()) {
            case PAC:
                velocità += miglioramento;
                velocità = livellaValori(velocità);
                break;
            case SHO:
                tiro += miglioramento;
                tiro = livellaValori(tiro);
                break;
            case PAS:
                passaggio += miglioramento;
                passaggio = livellaValori(passaggio);
                break;
            case DRI:
                dribbling += miglioramento;
                dribbling = livellaValori(dribbling);
                break;
            case DEF:
                difesa += miglioramento;
                difesa = livellaValori(difesa);
                break;
            case PHY:
                fisico += miglioramento;
                fisico = livellaValori(fisico);
                break;
            default:
                break;
        }
    }
    
    public void aiutoLeggenda() {
        int l = r.nextInt(2);
        if(l == 0) {
            velocità += 15;
            passaggio += 20;
            difesa += 10;
            velocità = livellaValori(velocità);
            passaggio = livellaValori(passaggio);
            difesa = livellaValori(difesa);
        }
        else {
            dribbling += 10;
            tiro += 20;
            fisico += 15;
            dribbling = livellaValori(dribbling);
            tiro = livellaValori(tiro);
            fisico = livellaValori(fisico);
        }
    }
    
    public void infortunio() {
        int diminuzioneFisico = r.nextInt(5, 21);
        fisico -= diminuzioneFisico;
        fisico = livellaValori(fisico);
        int abCasuale = r.nextInt(5);
        switch (abCasuale) {
            case 0:
                velocità -=  + r.nextInt(5, 11); 
                velocità = livellaValori(velocità);
                break;
            case 1:
                tiro -= + r.nextInt(5, 11);
                tiro = livellaValori(tiro);
                break;
            case 2:
                passaggio -= + r.nextInt(5, 11);
                passaggio = livellaValori(passaggio);
                break;
            case 3:
                dribbling -= + r.nextInt(5, 11);
                dribbling = livellaValori(dribbling);
                break;
            case 4:
                difesa -= + r.nextInt(5, 11);
                difesa = livellaValori(difesa);
                break;
        }
    }
    
    @Override
    public String toString() {
        return "Calciatore: " + nome + "Overall: " + getOverall() + getAbilità();
    }
}
