/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author gilberto
 */
public class Conversor {
    public static void main(String[] args) {
        //Variáveis
        double cel, fah;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Conversor --\n");
        
        //Entrada        
        System.out.print("Informe a temperatura em ºC: ");
        cel = entrada.nextDouble();

        //Processamento
        fah = 9 * cel / 5 + 32;
        
        //Saída
        System.out.printf("\n\t%.2fºC = %.2fºF\n", cel, fah);
                
    }
    
}
