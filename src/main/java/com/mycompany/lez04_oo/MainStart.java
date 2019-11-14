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

        Alunno a1 = new Alunno ("rossi", "mario", 100);
        Esame es1 = new Esame ("database", 100);
      
        //a1 = new Alunno("rossi");
        //a1.cognome "rossi";
        //a1.nome = "mario";
        //a1.voto = 10;
        long milsec = 4000;
        Thread.sleep(milsec);

        Alunno a2 = new Alunno("leone", "marta", 100);
        //a2.cognome = "leone";
        //a2.nome = "marta";
        //a2.voto = 9;
        LocalDateTime ddd= a2.getDatanascita();

        System.out.println(a1.getPresentazione());
        System.out.println(a2.getPresentazione());
        if (a1.getVoto() > a2.getVoto()) {
            System.out.println("bravo " + a1.getCognome() + " " + a1.getNome());
        } else {
            System.out.println("bravo " + a2.getCognome() + " " + a2.getNome());

        }
       

    }

}
