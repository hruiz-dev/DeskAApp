package com.hruiz.deskaapp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "series")
public class Serie {

    @DatabaseField(generatedId = true)
    private int id;

    private String nombre;
    private int capitulo;
    private String Url;
    private String estado;
    private String imagen;

    public Serie(int id, String nombre, int capitulo, String url, String estado, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.capitulo = capitulo;
        Url = url;
        this.estado = estado;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
