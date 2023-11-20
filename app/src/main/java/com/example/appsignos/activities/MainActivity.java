package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.appsignos.R;
import com.example.appsignos.adapters.RecyclerCategoriasAdapter;
import com.example.appsignos.adapters.RecyclerPalabrasAdapter;
import com.example.appsignos.models.Categoria;
import com.example.appsignos.models.Palabra;
import com.example.appsignos.utils.Utils;

import java.util.AbstractMap;
import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    RealmResults<Palabra> resultsPalabra;
    RealmResults<Categoria> resultsCategoria;
    Realm realm;
    RecyclerView recyclerView;
    TextView busqueda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();

        realm = Realm.getDefaultInstance();

        resultsPalabra = realm.where(Palabra.class).findAll();
        if (resultsPalabra.size() == 0){
            realm.beginTransaction();
            AbstractMap.SimpleEntry<ArrayList<Palabra>, ArrayList<Categoria>> result = Utils.CargarPalabras();
            realm.copyToRealmOrUpdate(result.getKey());
            realm.copyToRealmOrUpdate(result.getValue());
            realm.commitTransaction();
        }

        recyclerView = findViewById(R.id.recyclerCategorias);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        resultsCategoria = realm.where(Categoria.class).findAll();

        recyclerView.setAdapter(new RecyclerCategoriasAdapter(resultsCategoria, new RecyclerCategoriasAdapter.OnCategoriaClickListener() {
            @Override
            public void onCategoriaClick(Categoria categoria) {
                Intent intent = new Intent(MainActivity.this, ActivitySearch.class);
                intent.putExtra("NombreCategoria", categoria.getNombre());
                startActivity(intent);
            }
        }));


        busqueda = findViewById(R.id.txtBuscadorCat);
        busqueda.addTextChangedListener(new TextWatcher() {
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

        ImageButton btnBuscar = findViewById(R.id.btnBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivitySearch.class);
                intent.putExtra("NombreCategoria", "");
                startActivity(intent);
            }
        });

        ImageButton btnHome = findViewById(R.id.btnCasa);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnFav = findViewById(R.id.btnFav);
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityFavs.class);
                startActivity(intent);
            }
        });

    }
    ArrayList<Categoria> filtrarLista = new ArrayList<>();
    public void filtrar(String texto) {
        filtrarLista.clear();
        String textoLowerCase = texto.toLowerCase();
        for (Categoria cat : resultsCategoria) {
            String definicion = cat.getNombre().toLowerCase().trim();
            if (definicion.startsWith(textoLowerCase) || definicion.contains(textoLowerCase) || definicion.equals(textoLowerCase)) {
                filtrarLista.add(cat);
            }
        }

        RecyclerCategoriasAdapter recyclerDataAdapter = new RecyclerCategoriasAdapter(filtrarLista, new RecyclerCategoriasAdapter.OnCategoriaClickListener() {
            @Override
            public void onCategoriaClick(Categoria categoria) {
                Intent intent = new Intent(MainActivity.this, ActivitySearch.class);
                intent.putExtra("NombreCategoria", categoria.getNombre());
                startActivity(intent);
            }
        });

        // Use the correct RecyclerView ID here
        RecyclerView recyclerView = findViewById(R.id.recyclerCategorias);
        recyclerView.setAdapter(recyclerDataAdapter);
    }

}
