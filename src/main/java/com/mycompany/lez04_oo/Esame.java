/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez04_oo;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Esame {

    private String nomeEsame;
    private int votoEsame;
    private LocalDate dataEsame;
    private String docenteEsame;

    public Esame(String nomeEsame, int votoEsame) {
        this.nomeEsame = nomeEsame;
        this.votoEsame = votoEsame;
        dataEsame = LocalDate.now();
       
    }

    public String getDocenteEsame() {
        return docenteEsame;
    }

    public void setDocenteEsame(String docenteEsame) {
        this.docenteEsame = docenteEsame;
    }

    public void setNomeEsame(String nomeEsame) {
        this.nomeEsame = nomeEsame;
    }

    public void setVotoEsame(int votoEsame) {
        this.votoEsame = votoEsame;
    }

    public String getNomeEsame() {
        return nomeEsame;
    }

    public int getVotoEsame() {
        return votoEsame;
    }

   

}
