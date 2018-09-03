/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Luis Guilherme
 */
public class TesteLampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        lampada1.ligar();
        lampada2.desligar();
        System.out.println("A lâmpada 1 está " + lampada1.verificarEstado());
        System.out.println("\nA lâmpada 2 está " + lampada2.verificarEstado());
    }
}
