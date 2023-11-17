

package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.appsignos.R;
import com.example.appsignos.adapters.RecyclerPalabrasAdapter;
import com.example.appsignos.models.Categoria;
import com.example.appsignos.models.Palabra;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class ActivitySearch extends AppCompatActivity {

    RecyclerView recyclerView;
    Realm realm;
    RealmResults<Palabra> resultsPalabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ArrayList<Palabra> pal = new ArrayList<Palabra>();
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();

        realm = Realm.getDefaultInstance();


        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


        Intent intent = getIntent();
        String data = intent.getStringExtra("NombreCategoria");

        if (data != null) {
            resultsPalabra = realm.where(Palabra.class).equalTo("categoria.nombre", data).findAll();
        }else{
            resultsPalabra = realm.where(Palabra.class).findAll();
        }


        recyclerView.setAdapter(new RecyclerPalabrasAdapter(resultsPalabra, new RecyclerPalabrasAdapter.onItemClickListener() {
            @Override
            public void onItemClickListener(Palabra palabra) {

            }
        }));



    }
}