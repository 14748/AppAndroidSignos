package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appsignos.R;
import com.example.appsignos.models.Palabra;

import io.realm.Realm;
import io.realm.RealmResults;

public class PalabraActivity extends AppCompatActivity {
    Realm realm;
    ImageView imageViewPalabra;
    TextView textViewPalabra, textViewSignificado, textViewCategoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palabra_view);

        realm = Realm.getDefaultInstance();

        imageViewPalabra = findViewById(R.id.imageView);
        textViewPalabra = findViewById(R.id.nameTextView);
        textViewSignificado = findViewById(R.id.descriptionTextView);
        textViewCategoria = findViewById(R.id.categoryTextView);


        Intent intent = getIntent();
        Integer data = intent.getIntExtra("PalabraId", 0);

        if (data != null) {
            Palabra palabra = realm.where(Palabra.class).equalTo("id", data).findFirst();
            imageViewPalabra.setBackgroundResource(palabra.getImagen());
            textViewPalabra.setText(palabra.getDefinicion());
            textViewSignificado.setText(palabra.getDescripcion());
            textViewCategoria.setText(palabra.getCategoria().getNombre());
        }else{

        }
    }
}