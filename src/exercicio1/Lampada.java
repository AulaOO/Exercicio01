package exercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Guilherme
 */
public class Lampada {
    private boolean ligada = false;

    public Lampada() {
    }
    
    
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }
    
    public String verificarEstado(){
        String srt;
        if(ligada == true){
            srt = "\"Ligada\"";
        }
        else{
            srt = "\"Desligada\"";
        }
        return srt;
    }
    
}
