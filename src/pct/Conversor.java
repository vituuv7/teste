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
        
        //Menu
        System.out.println("[1] ºC --> ºF");
        System.out.println("[2] ºF --> ºC");
        System.out.println("[3] Sair");

        System.out.print("Opção: ");
        int op = entrada.nextInt();
        
        switch(op){        
            case 1:
                System.out.println("\n\t\t\t -- Cel --> Fah -- \n");
                
                //Entrada        
                System.out.print("Informe a temperatura em ºC: ");
                cel = entrada.nextDouble();

                //Processamento
                fah = 9 * cel / 5 + 32;
        
                //Saída
                System.out.printf("\n\t%.2fºC = %.2fºF\n", cel, fah);
        
                break;
            case 2:
                System.out.println("\n\t\t\t -- Fah --> Cel -- \n");
                
                //Entrada        
                System.out.print("Informe a temperatura em ºF: ");
                fah = entrada.nextDouble();

                //Processamento
                cel = (fah - 32) * 5 / 9;
        
                //Saída
                System.out.printf("\n\t%.2fºF = %.2fºC\n", fah, cel);
        
                break;
            case 3:
                System.out.println("Forte abraço!");
                break;
            default:
                System.out.println("Opção incorreta!");
                
        }
                
    }
    
}
