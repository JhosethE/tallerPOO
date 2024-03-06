
package com.mycompany.tallerpoo;

public class Sala {
   private int numero;
    private int capacidad;
    private String tipoSala;
    private String[] equipamiento;
    
    // Constructor
    public Sala(int numero, int capacidad, String tipoSala, String[] equipamiento) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
        this.equipamiento = equipamiento;
    }
    
    // Métodos getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String[] getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String[] equipamiento) {
        this.equipamiento = equipamiento;
    } 
}
