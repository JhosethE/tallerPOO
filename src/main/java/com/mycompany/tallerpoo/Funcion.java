
package com.mycompany.tallerpoo;

public class Funcion {
  private String horaInicio;
    private String tituloPelicula;
    private Sala sala;
    private int asientosDisponibles;
    private double precioEntrada;
    
    // Constructor
    public Funcion(String horaInicio, String tituloPelicula, Sala sala, int asientosDisponibles, double precioEntrada) {
        this.horaInicio = horaInicio;
        this.tituloPelicula = tituloPelicula;
        this.sala = sala;
        this.asientosDisponibles = asientosDisponibles;
        this.precioEntrada = precioEntrada;
    }
    
    // Métodos getters y setters
    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
}
