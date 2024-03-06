
package com.mycompany.tallerpoo;
import java.util.Date;

public class Pelicula {
    private String titulo;
    private int duracion; 
    private String genero;
    private String director;
    private String[] reparto;
    private Date fechaEstreno;
    
    // Constructor
    public Pelicula(String titulo, int duracion, String genero, String director, String[] reparto, Date fechaEstreno) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.director = director;
        this.reparto = reparto;
        this.fechaEstreno = fechaEstreno;
    }
    
    // Métodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getReparto() {
        return reparto;
    }

    public void setReparto(String[] reparto) {
        this.reparto = reparto;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
