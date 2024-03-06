
package com.mycompany.tallerpoo;
import java.util.Date;

public class Ticket {
     private int numeroTicket;
    private String descripcion;
    private double precio;
    private Date fechaEmision;

    // Constructor
    public Ticket(int numeroTicket, String descripcion, double precio, Date fechaEmision) {
        this.numeroTicket = numeroTicket;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaEmision = fechaEmision;
    }

    // Métodos getters y setters
    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
}
