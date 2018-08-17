package com.coursera.santiago.petagram;

import android.support.annotation.NonNull;

public class Mascota implements Comparable<Mascota>{
    private String nombre;
    private int foto;
    private int cantidadLike;

    public Mascota(){

    }

    public Mascota(String nombre, int foto, int cantidadLike) {
        this.nombre = nombre;
        this.foto = foto;
        this.cantidadLike = cantidadLike;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getCantidadLike() {
        return cantidadLike;
    }

    public void setCantidadLike(int cantidadLike) {
        this.cantidadLike = cantidadLike;
    }

    @Override
    public int compareTo(@NonNull Mascota comparado) {

        return comparado.getCantidadLike()-this.getCantidadLike();
    }
}
