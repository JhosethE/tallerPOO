
package com.mycompany.tallerpoo;

public class Cafeteria {
    private String nombre;
    private String[] menu;
    private String[] personal;
    private String[] inventario;
    private double ventas;
    
    // Constructor
    public Cafeteria(String nombre, String[] menu, String[] personal, String[] inventario) {
        this.nombre = nombre;
        this.menu = menu;
        this.personal = personal;
        this.inventario = inventario;
        this.ventas = 0.0;
    }
    
    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }

    public String[] getPersonal() {
        return personal;
    }

    public void setPersonal(String[] personal) {
        this.personal = personal;
    }

    public String[] getInventario() {
        return inventario;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
}
