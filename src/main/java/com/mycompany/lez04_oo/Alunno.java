/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez04_oo;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tss
 */
public class Alunno {

    String cognome;
    String nome;
    int voto;
    private LocalDateTime datanascita;
    String segnoZodiacale;
    //costruttore metodo con stesso nome della classe

    public Alunno() {
        cognome = "";
        nome = "";
        voto = 10;
        datanascita = LocalDateTime.now();
        segnoZodiacale = "pesci";
        int anno = datanascita.getYear();
if (anno== 2019) segnoZodiacale = "Drago";
if (anno== 2019) segnoZodiacale = "Serpente";
if (anno== 2020) segnoZodiacale = "Topo";




    }

    public LocalDateTime getDatanascita() {

        return datanascita;
    }

    public String getPresentazione() {
        String frase;
        frase = "Mi chiamo " + cognome + " " + nome;
        //sistemo la data
        DateTimeFormatter myFormatIt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String dataOKIt = datanascita.format(myFormatIt);

        frase += " e sono nato il " + dataOKIt;

        return frase;
    }

}
