/*
 * Copyright (c) 2020
 * By Pablo Fernandez
 * ferning98@gmail.com
 */

package com.ferncuy.curso3semana4.pojo;


public class Mascota {

    private int foto;
    private String nombre;
    private int rate;

    public Mascota(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}