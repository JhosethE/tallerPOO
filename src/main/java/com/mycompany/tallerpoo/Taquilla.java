
package com.mycompany.tallerpoo;

public class Taquilla {
    private int numeroTaquilla;
    private String ubicacion;
    private String empleadoAsignado;
    private boolean disponible;
    private boolean pagoAceptado;
    
    // Constructor
    public Taquilla(int numeroTaquilla, String ubicacion, String empleadoAsignado, boolean disponible, boolean pagoAceptado) {
        this.numeroTaquilla = numeroTaquilla;
        this.ubicacion = ubicacion;
        this.empleadoAsignado = empleadoAsignado;
        this.disponible = disponible;
        this.pagoAceptado = pagoAceptado;
    }
    
    // Métodos getters y setters
    public int getNumeroTaquilla() {
        return numeroTaquilla;
    }

    public void setNumeroTaquilla(int numeroTaquilla) {
        this.numeroTaquilla = numeroTaquilla;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEmpleadoAsignado() {
        return empleadoAsignado;
    }

    public void setEmpleadoAsignado(String empleadoAsignado) {
        this.empleadoAsignado = empleadoAsignado;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isPagoAceptado() {
        return pagoAceptado;
    }

    public void setPagoAceptado(boolean pagoAceptado) {
        this.pagoAceptado = pagoAceptado;
    }
}
