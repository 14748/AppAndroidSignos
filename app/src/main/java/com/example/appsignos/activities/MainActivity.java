package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.appsignos.R;
import com.example.appsignos.adapters.RecyclerCategoriasAdapter;
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
            realm.copyToRealm(result.getKey());
            realm.copyToRealm(result.getValue());
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

    }
}
