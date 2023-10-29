package com.example.appsignos.models;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int id;
    private String nombre;
    private int imagenResourceId; // Agregar un campo para la imagen

    public Categoria(int id, String nombre, int imagenResourceId) {
        this.id = id;
        this.nombre = nombre;
        this.imagenResourceId = imagenResourceId;
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

    public int getImagenResourceId() {
        return imagenResourceId;
    }

    public void setImagenResourceId(int imagenResourceId) {
        this.imagenResourceId = imagenResourceId;
    }
}
