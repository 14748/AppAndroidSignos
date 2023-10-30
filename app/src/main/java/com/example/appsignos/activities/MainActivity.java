package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.appsignos.R;
import com.example.appsignos.models.Categoria;
import com.example.appsignos.models.Palabra;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Realm realm;
    RealmResults<Categoria> resultsCategoria;
    RealmResults<Palabra> resultsPalabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realm = Realm.getDefaultInstance();

        realm.beginTransaction();


        realm.commitTransaction();

        resultsCategoria = realm.where(Categoria.class).findAll();
        resultsPalabra = realm.where(Palabra.class).findAll();
    }
}