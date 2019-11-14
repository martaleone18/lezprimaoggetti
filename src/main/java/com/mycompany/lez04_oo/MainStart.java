/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez04_oo;


import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class MainStart {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
    
   
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Alunno a1;
        a1 = new Alunno("rossi");
        //a1.cognome "rossi";
        a1.nome = "mario";
        a1.voto = 10;
        long milsec = 4000;
        Thread.sleep(milsec);

        Alunno a2 = new Alunno("leone");
        //a2.cognome = "leone";
        a2.nome = "marta";
        a2.voto = 9;
        LocalDateTime ddd= a2.getDatanascita();

        System.out.println(a1.getPresentazione());
        System.out.println(a2.getPresentazione());
        if (a1.voto > a2.voto) {
            System.out.println("bravo " + a1.cognome + " " + a1.nome);
        } else {
            System.out.println("bravo " + a2.cognome + " " + a2.nome);

        }

    }

}
