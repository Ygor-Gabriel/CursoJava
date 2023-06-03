/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author marques
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        tipo = switch (perna) {
            case 1 -> "perna saci";
            case 2 -> "bípede";
            case 3 -> "tripé";
            case 4 -> "quadrípede";
            case 5 -> "aranha";
            default -> "ET";
        };
        System.out.println(tipo);
    }
    
}
