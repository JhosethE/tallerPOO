
package com.mycompany.tallerpoo;

public class Silla {
     private int numero;
    private char fila;
    private String tipoAsiento;
    private String estado;
    private String color;
    private boolean portaObjetos;
    
    // Constructor
    public Silla(int numero, char fila, String tipoAsiento, String estado, String color, boolean portaObjetos) {
        this.numero = numero;
        this.fila = fila;
        this.tipoAsiento = tipoAsiento;
        this.estado = estado;
        this.color = color;
        this.portaObjetos = portaObjetos;
    }
    
    // Métodos getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPortaObjetos() {
        return portaObjetos;
    }

    public void setPortaObjetos(boolean portaObjetos) {
        this.portaObjetos = portaObjetos;
    }
}
