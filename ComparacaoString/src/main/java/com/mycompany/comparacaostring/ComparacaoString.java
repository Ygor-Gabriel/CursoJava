/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author marques
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Marques";
        String nome2 = "Marques";
        String nome3 = new String("Marques");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        //para saber se o que esta dentro de um objeto é igual ao que está em outro usamos .iquals ao invés de ==
    }
}
