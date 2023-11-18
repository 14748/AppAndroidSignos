package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import com.example.appsignos.R;
import com.example.appsignos.adapters.RecyclerPalabrasAdapter;
import com.example.appsignos.models.Palabra;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class ActivityBuscarTodasPalabras extends AppCompatActivity {

    Realm realm;
    RealmResults<Palabra> todasLasPalabras;
    RecyclerView recyclerView;
    TextView busquedaPal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_todas_palabras);
        Realm.init(this);  // Inicializa Realm en tu aplicación
        realm = Realm.getDefaultInstance();

        recyclerView = findViewById(R.id.recyclerTodasPalabras);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        todasLasPalabras = realm.where(Palabra.class).findAll();

        recyclerView.setAdapter(new RecyclerPalabrasAdapter(todasLasPalabras, new RecyclerPalabrasAdapter.onItemClickListener() {
            @Override
            public void onItemClickListener(Palabra palabra) {
                Intent intent = new Intent(ActivityBuscarTodasPalabras.this, PalabraActivity.class);
                intent.putExtra("PalabraId", palabra.getId());
                startActivity(intent);
            }
        }));

        busquedaPal = findViewById(R.id.txtBuscadorTodasPalabras);
        busquedaPal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filtrar(editable.toString());
            }
        });
    }

    ArrayList<Palabra> filtrarLista = new ArrayList<>();

    public void filtrar(String texto) {
        filtrarLista.clear();
        String textoLowerCase = texto.toLowerCase();
        for (Palabra palabra : todasLasPalabras) {
            String definicion = palabra.getDefinicion().toLowerCase().trim();
            if (definicion.startsWith(textoLowerCase) || definicion.contains(textoLowerCase) || definicion.equals(textoLowerCase)) {
                filtrarLista.add(palabra);
            }
        }
        recyclerView.setAdapter(new RecyclerPalabrasAdapter(filtrarLista, new RecyclerPalabrasAdapter.onItemClickListener() {
            @Override
            public void onItemClickListener(Palabra palabra) {
                Intent intent = new Intent(ActivityBuscarTodasPalabras.this, PalabraActivity.class);
                intent.putExtra("PalabraId", palabra.getId());
                startActivity(intent);
            }
        }));
    }
}
