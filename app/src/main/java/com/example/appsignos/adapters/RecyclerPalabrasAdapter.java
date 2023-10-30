package com.example.appsignos.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appsignos.R;
import com.example.appsignos.models.Palabra;

import java.util.List;

public class RecyclerPalabrasAdapter extends RecyclerView.Adapter<RecyclerPalabrasAdapter.RecyclerDataHolder> {

    List<Palabra> listPalabras;
    onItemClickListener listener;

    public RecyclerPalabrasAdapter(List<Palabra> listPalabras, onItemClickListener listener){
        this.listPalabras = listPalabras;
        this.listener = listener;
    }


    @NonNull
    @Override
    public RecyclerPalabrasAdapter.RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.palabra_recycler_view, parent, false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerPalabrasAdapter.RecyclerDataHolder holder, int position) {
        holder.assignData(listPalabras.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return listPalabras.size();
    }









    public class RecyclerDataHolder extends RecyclerView.ViewHolder {

        TextView word;
        ImageView image;
        LinearLayout linearLayout_palabra;
        LinearLayout linearLayout_image;
        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
            word = itemView.findViewById(R.id.wordPalabra_textView);
            image = itemView.findViewById(R.id.imagenPalabra_imageView);
            linearLayout_palabra = itemView.findViewById(R.id.palabra_LinearLayout);
            linearLayout_image = itemView.findViewById(R.id.image_LinearLayout);
        }

        public void assignData(Palabra palabra, onItemClickListener onItemClickListener){
            word.setText(palabra.getDefinicion());
            image.setImageResource(palabra.getImagen());
            //TODO: falta ponerle colores y eso, hay que hablar de cómo darle estilo
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClickListener(palabra);
                }
            });
            }
        }
    public interface onItemClickListener{
            void onItemClickListener(Palabra palabra);
    }
    }

