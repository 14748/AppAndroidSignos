

package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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

    ArrayList<Palabra> pal;

    TextView busquedaPal;

    ArrayList<Palabra> arrayListPalabra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        pal = new ArrayList<Palabra>();
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();

        realm = Realm.getDefaultInstance();




        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));


        Intent intent = getIntent();
        String data = intent.getStringExtra("NombreCategoria");

        if (!TextUtils.isEmpty(data)){
            resultsPalabra = realm.where(Palabra.class).equalTo("categoria.nombre", data).findAll();
        }else {
            resultsPalabra = realm.where(Palabra.class).findAll();
        }

        arrayListPalabra = new ArrayList<>();
        for (Palabra palabra : resultsPalabra) {
            arrayListPalabra.add(realm.copyFromRealm(palabra));
        }

        recyclerView.setAdapter(new RecyclerPalabrasAdapter(resultsPalabra,
                new RecyclerPalabrasAdapter.onItemClickListener() {
                    @Override
                    public void onItemClickListener(Palabra palabra) {
                        Intent intent = new Intent(ActivitySearch.this, PalabraActivity.class);
                        intent.putExtra("PalabraId", palabra.getId());
                        startActivity(intent);
                    }
                },
                new RecyclerPalabrasAdapter.onImageButtonClickListener() {
                    @Override
                    public void onImageButtonClickListener(Palabra palabra) {
                        realm.beginTransaction();
                        palabra.setFavorito(!palabra.getFavorito());
                        Toast.makeText(ActivitySearch.this, "Palabra anadida a favoritos " + palabra.getDefinicion(), Toast.LENGTH_SHORT).show();
                        realm.commitTransaction();
                    }
                }
        ));


        busquedaPal = findViewById(R.id.txtBuscador);
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

        ImageButton btnBuscar = findViewById(R.id.btnBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySearch.this, ActivitySearch.class);
                intent.putExtra("NombreCategoria", "");
                startActivity(intent);
            }
        });

        ImageButton btnHome = findViewById(R.id.btnCasa);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySearch.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnFav = findViewById(R.id.btnFav);
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySearch.this, ActivityFavs.class);
                startActivity(intent);
            }
        });
    }
    public void filtrar(String texto) {
        RealmResults<Palabra> filtrarLista = realm.where(Palabra.class)
                .contains("definicion", texto.toLowerCase())
                .findAll();
        recyclerView.setAdapter(new RecyclerPalabrasAdapter(filtrarLista, new RecyclerPalabrasAdapter.onItemClickListener() {
            @Override
            public void onItemClickListener(Palabra palabra) {
                Intent intent = new Intent(ActivitySearch.this, PalabraActivity.class);
                intent.putExtra("PalabraId", palabra.getId());
                startActivity(intent);
            }
        }, new RecyclerPalabrasAdapter.onImageButtonClickListener() {
            @Override
            public void onImageButtonClickListener(Palabra palabra) {
                realm.beginTransaction();
                palabra.setFavorito(!palabra.getFavorito());
                Toast.makeText(ActivitySearch.this, "Palabra anadida a favoritos " + palabra.getDefinicion(), Toast.LENGTH_SHORT).show();
                realm.commitTransaction();
            }
        }));
    }


}