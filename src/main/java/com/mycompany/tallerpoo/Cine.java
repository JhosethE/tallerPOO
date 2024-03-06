
package com.mycompany.tallerpoo;

public class Cine {
   private String nombre;
    private String ubicacion;
    private int capacidadTotalSalas;
    private String[] listaSalas;
    private String[] listaPeliculas;
    private boolean tiene3DS;
    
    public Cine(String nombre, String direccion, int capacidadTotalSalas, String[] listaSalas, String[] listaPeliculas, boolean tiene3DS) {
        this.nombre = nombre;
        this.ubicacion = direccion;
        this.capacidadTotalSalas = capacidadTotalSalas;
        this.listaSalas = listaSalas;
        this.listaPeliculas = listaPeliculas;
        this.tiene3DS = tiene3DS;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidadTotalSalas() {
        return capacidadTotalSalas;
    }

    public void setCapacidadTotalSalas(int capacidadTotalSalas) {
        this.capacidadTotalSalas = capacidadTotalSalas;
    }

    public String[] getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(String[] listaSalas) {
        this.listaSalas = listaSalas;
    }
    
    public String[] getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(String[] listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public boolean isTiene3DS() {
        return tiene3DS;
    }

    public void setTiene3DS(boolean tiene3DS) {
        this.tiene3DS = tiene3DS;
    }
}
