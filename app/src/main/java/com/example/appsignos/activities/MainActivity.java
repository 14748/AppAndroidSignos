package com.example.appsignos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.appsignos.R;
import com.example.appsignos.adapters.RecyclerCategoriasAdapter;
import com.example.appsignos.models.Categoria;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();
        Categoria Adjetivos = new Categoria("Adjetivos", R.drawable.adjetivos);
        listaCategoria.add(Adjetivos);

        Categoria Adverbios = new Categoria("Adverbios", R.drawable.adjetivos);
        listaCategoria.add(Adjetivos);

        Categoria Verbos = new Categoria("Verbos", R.drawable.adjetivos);
        listaCategoria.add(Verbos);

        Categoria DiasSemana = new Categoria("Días de la semana", R.drawable.adjetivos);
        listaCategoria.add(DiasSemana);

        Categoria Estaciones = new Categoria("Estaciones", R.drawable.adjetivos);
        listaCategoria.add(Estaciones);

        Categoria Fiestas = new Categoria("Fiestas", R.drawable.adjetivos);
        listaCategoria.add(Fiestas);

        Categoria MesesDelAño = new Categoria("Meses del año", R.drawable.adjetivos);
        listaCategoria.add(MesesDelAño);

        Categoria Tiempo = new Categoria("Tiempo", R.drawable.adjetivos);
        listaCategoria.add(Tiempo);

        Categoria Casa = new Categoria("Casa", R.drawable.adjetivos);
        listaCategoria.add(Casa);

        Categoria ObjetosDeCocina = new Categoria("Objetos de cocina", R.drawable.adjetivos);
        listaCategoria.add(ObjetosDeCocina);

        Categoria ObjetosDelBaño = new Categoria("Objetos del baño", R.drawable.adjetivos);
        listaCategoria.add(ObjetosDelBaño);

        Categoria MediosDeTransporte = new Categoria("Medios de transporte", R.drawable.adjetivos);
        listaCategoria.add(MediosDeTransporte);

        Categoria Ciudad = new Categoria("Ciudad", R.drawable.adjetivos);
        listaCategoria.add(Ciudad);

        Categoria Profesiones = new Categoria("Profesiones", R.drawable.adjetivos);
        listaCategoria.add(Profesiones);

        Categoria Colegio = new Categoria("Colegio", R.drawable.adjetivos);
        listaCategoria.add(Colegio);

        Categoria Colores = new Categoria("Colores", R.drawable.adjetivos);
        listaCategoria.add(Colores);

        Categoria FormasYTamaños = new Categoria("Formas y tamaños", R.drawable.adjetivos);
        listaCategoria.add(FormasYTamaños);

        Categoria ComidasYBebidas = new Categoria("Comidas y bebidas", R.drawable.adjetivos);
        listaCategoria.add(ComidasYBebidas);

        Categoria Cuerpo = new Categoria("Cuerpo", R.drawable.adjetivos);
        listaCategoria.add(Cuerpo);

        Categoria Sentidos = new Categoria("Sentidos", R.drawable.adjetivos);
        listaCategoria.add(Sentidos);

        Categoria Familia = new Categoria("Familia", R.drawable.adjetivos);
        listaCategoria.add(Familia);

        Categoria Animales = new Categoria("Animales", R.drawable.adjetivos);
        listaCategoria.add(Animales);

        Categoria Naturaleza = new Categoria("Naturaleza", R.drawable.adjetivos);
        listaCategoria.add(Naturaleza);

        Categoria TiempoAtmosférico = new Categoria("Tiempo atmosférico", R.drawable.adjetivos);
        listaCategoria.add(TiempoAtmosférico);

        Categoria Ropa = new Categoria("Ropa", R.drawable.adjetivos);
        listaCategoria.add(Ropa);

        Categoria SaludosYPreguntas = new Categoria("Saludos y preguntas", R.drawable.adjetivos);
        listaCategoria.add(SaludosYPreguntas);

        Categoria Postres = new Categoria("Postres", R.drawable.adjetivos);
        listaCategoria.add(Postres);

        Categoria CosasDelColegio = new Categoria("Cosas del Colegio", R.drawable.adjetivos);
        listaCategoria.add(CosasDelColegio);

        recyclerView = findViewById(R.id.recyclerCategorias);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(new RecyclerCategoriasAdapter(listaCategoria, new RecyclerCategoriasAdapter.OnCategoriaClickListener() {
            @Override
            public void onCategoriaClick(Categoria categoria) {
                Intent intent = new Intent(MainActivity.this, ActivitySearch.class);
                intent.putExtra("NombreCategoria", categoria.getNombre());
                startActivity(intent);
            }
        }));

    }
}
