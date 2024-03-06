
package com.mycompany.tallerpoo;
import java.util.Date;

public class Ticket {
     private int numeroTicket;
    private String pelicula;
    private int numSala;
    private Date horaInicio;
    private double precio;
    private Date fechaEmision;
    private int silla;

    // Constructor

    public Ticket(int numeroTicket, String pelicula, int numSala, Date horaInicio, double precio, Date fechaEmision, int silla) {
        this.numeroTicket = numeroTicket;
        this.pelicula = pelicula;
        this.numSala = numSala;
        this.horaInicio = horaInicio;
        this.precio = precio;
        this.fechaEmision = fechaEmision;
        this.silla = silla;
    }
    

    // Métodos getters y setters

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }
    
    }


