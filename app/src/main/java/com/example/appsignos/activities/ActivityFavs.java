package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.appsignos.R;
import com.example.appsignos.adapters.RecyclerPalabrasAdapter;
import com.example.appsignos.models.Palabra;

import io.realm.Realm;
import io.realm.RealmResults;

public class ActivityFavs extends AppCompatActivity {
    Realm realm;
    RealmResults<Palabra> resultsPalabra;

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favs);

        recyclerView = findViewById(R.id.recyclerFavs);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        realm = Realm.getDefaultInstance();

        resultsPalabra = realm.where(Palabra.class).equalTo("isFavorito", true).findAll();

        recyclerView.setAdapter(new RecyclerPalabrasAdapter(resultsPalabra,
                new RecyclerPalabrasAdapter.onItemClickListener() {
                    @Override
                    public void onItemClickListener(Palabra palabra) {
                        Intent intent = new Intent(ActivityFavs.this, PalabraActivity.class);
                        intent.putExtra("PalabraId", palabra.getId());
                        startActivity(intent);
                    }
                },
                new RecyclerPalabrasAdapter.onImageButtonClickListener() {
                    @Override
                    public void onImageButtonClickListener(Palabra palabra) {
                        realm.beginTransaction();
                        palabra.setFavorito(!palabra.getFavorito());
                        Toast.makeText(ActivityFavs.this, "Favorito clicked for " + palabra.getDefinicion(), Toast.LENGTH_SHORT).show();
                        realm.commitTransaction();
                    }
                }
        ));

        ImageButton btnBuscar = findViewById(R.id.btnBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFavs.this, ActivitySearch.class);
                intent.putExtra("NombreCategoria", "");
                startActivity(intent);
            }
        });

        ImageButton btnHome = findViewById(R.id.btnCasa);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFavs.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnFav = findViewById(R.id.btnFav);
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFavs.this, ActivityFavs.class);
                startActivity(intent);
            }
        });




    }
}