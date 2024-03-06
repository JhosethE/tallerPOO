
package com.mycompany.tallerpoo;

public class Empleado {
    private String nombre;
    private int id;
    private String cargo;
    private int horario;
    private double salario;
    
    // Constructor
    public Empleado(String nombre, int id, String cargo, int horasLaborales, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.horario = horasLaborales;
        this.salario = salario;
    }
    
    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
