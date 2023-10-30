package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appsignos.R;
import com.example.appsignos.models.Categoria;
import com.example.appsignos.models.Palabra;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Palabra> listaPalabras;
    List<Categoria> listaCategoria;
    Realm realm;
    RealmResults<Categoria> resultsCategoria;
    RealmResults<Palabra> resultsPalabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realm = Realm.getDefaultInstance();

        // CREACIÓN CATEGORÍAS
        //TODO HAY QUE CAMBIAR EL INT POR LA FOTO TODAVÍA
        listaCategoria.add(new Categoria("Adjetivos", 1));
        listaCategoria.add(new Categoria("Adverbios", 1));
        listaCategoria.add(new Categoria("Verbos", 1));
        listaCategoria.add(new Categoria("Días de la semana", 1));
        listaCategoria.add(new Categoria("Estaciones", 1));
        listaCategoria.add(new Categoria("Fiestas", 1));
        listaCategoria.add(new Categoria("Meses del año", 1));
        listaCategoria.add(new Categoria("Tiempo", 1));
        listaCategoria.add(new Categoria("Casa", 1));
        listaCategoria.add(new Categoria("Ciudad", 1));
        listaCategoria.add(new Categoria("Medios de transporte", 1));
        listaCategoria.add(new Categoria("Profesiones", 1));
        listaCategoria.add(new Categoria("Colegio", 1));
        listaCategoria.add(new Categoria("Colores", 1));
        listaCategoria.add(new Categoria("Formas y tamaños", 1));
        listaCategoria.add(new Categoria("Adjetivos", 1));
        listaCategoria.add(new Categoria("Comidas y bebidas", 1));
        listaCategoria.add(new Categoria("Cuerpo", 1));
        listaCategoria.add(new Categoria("Sentidos", 1));
        listaCategoria.add(new Categoria("Familia", 1));
        listaCategoria.add(new Categoria("Animales", 1));
        listaCategoria.add(new Categoria("Naturaleza", 1));
        listaCategoria.add(new Categoria("Tiempo atmosférico", 1));
        listaCategoria.add(new Categoria("Ropa", 1));
        listaCategoria.add(new Categoria("Saludos y preguntas", 1));
        //FIN CREACIÓN CATEGORÍAS

        // CREACIÓN DE OBJETOS DE LA BASE DE DATOS
        listaPalabras.add(new Palabra("x", "descripcion", )) //TODO COMPLETAR
        //FIN CREACIÓN OBJETOS DE LA BASE DE DATOS

        realm.beginTransaction();

        realm.commitTransaction();

        resultsCategoria = realm.where(Categoria.class).findAll();
        resultsPalabra = realm.where(Palabra.class).findAll();
    }
}