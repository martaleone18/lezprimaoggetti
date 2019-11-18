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
     *
     *
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Alunno a1 = new Alunno("rossi", "mario", 6); //attributi derivati dalla public class Alunno (nome, cognome,numeroEsami)
        Esame esammissione = new Esame("ammissione corso tss", 100);
        a1.setAmmissioneEsame(esammissione);

        Esame esameSTD = new Esame("tecniche programmazione", 85);
        //vecchio sistema aggiunta di esame std
        Esame el_esamialunno[];
        el_esamialunno = a1.getElencoEsami();
        el_esamialunno[0] = esameSTD;
        //preparo altro voto esame
        Esame newesame = new Esame ("Database" , 100);
        //nuovo sistema aggiunta esame
        a1.addEsame(newesame);
        //visualizzo libretto

        System.out.println(a1.getLibretto());

      

        int voto = a1.getAmmissioneEsame().getVotoEsame();
        String esame = a1.getAmmissioneEsame().getNomeEsame();
        System.out.println(esame + " voto " + voto + " alunno " + a1.getCognome()
                + " " + a1.getElencoEsami()[0].getVotoEsame()
                + " " + a1.getElencoEsami()[0].getNomeEsame());

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
        LocalDateTime ddd = a2.getDatanascita();

        //   System.out.println(a1.getPresentazione());
        //  System.out.println(a2.getPresentazione());
        //  if (a1.getVoto() > a2.getVoto()) {
        //    System.out.println("bravo " + a1.getCognome() + " " + a1.getNome());
        // } else {
        //  System.out.println("bravo " + a2.getCognome() + " " + a2.getNome());
    }

}
