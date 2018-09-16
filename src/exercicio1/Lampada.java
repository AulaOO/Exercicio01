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
    
    /**
     * Este método irá ligar a lâmpada.
     */
    public void ligar(){
        ligada = true;
    }
    /**
     * Este método irá desligar a lâmpada.
     */
    public void desligar(){
        ligada = false;
    }
    /**
     * Este método irá verificar se a lâmpada está ligada ou desligada.
     * @return 
     */
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
