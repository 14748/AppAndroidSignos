package com.example.appsignos.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Palabra extends RealmObject {
    @PrimaryKey
    private int id;
    private String definicion; //es la palabra en sí, para no repetir clase y propiedad palabra
    private String descripcion;
    private int imagen;
    private Categoria categoria;

    public Palabra(){}
    public Palabra(int id, String definicion, String descripcion, int imagen, Categoria categoria) {
        this.id = id;
        this.definicion = definicion;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
