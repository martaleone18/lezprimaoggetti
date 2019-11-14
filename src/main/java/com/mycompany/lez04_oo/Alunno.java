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

    private String cognome;
    private String nome;
    private int voto;
    private int ammisisoneEsame;

    public int getAmmisisoneEsame() {
        return ammisisoneEsame;
    }

    public void setAmmisisoneEsame(int ammisisoneEsame) {
        this.ammisisoneEsame = ammisisoneEsame;
    }
    private LocalDateTime datanascita;
    String segnoZodiacale;
    //costruttore metodo con stesso nome della classe
   

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public String getSegnoZodiacale() {
        return segnoZodiacale;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public Alunno(String cognome, String nome, int voto) {
        this.cognome = cognome;
        this.nome = nome;
        this.voto = voto;
    }

    public Alunno(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public Alunno(String newcognome) {
        String okcognome = "";
        if (newcognome.length() > 50) //tagliare
        {
            newcognome = newcognome.substring(0, 50);
        } else {
            okcognome = newcognome;
        }

        cognome = newcognome.toUpperCase();
        this.cognome = okcognome;

        nome = "";
        datanascita = LocalDateTime.now();
        //voto = 10;
        int anno = datanascita.getYear();
        if (anno == 2018) {
            segnoZodiacale = "Drago";
        }
        if (anno == 2019) {
            segnoZodiacale = "Serpente";
        }
        if (anno == 2020) {
            segnoZodiacale = "Topo";
        }

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
