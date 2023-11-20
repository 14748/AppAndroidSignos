package com.example.appsignos.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appsignos.R;
import com.example.appsignos.models.Palabra;

import java.util.List;

public class RecyclerPalabrasAdapter extends RecyclerView.Adapter<RecyclerPalabrasAdapter.RecyclerDataHolder> {

    private List<Palabra> listPalabras;
    private onItemClickListener itemClickListener;
    private onImageButtonClickListener imageButtonClickListener;

    public RecyclerPalabrasAdapter(List<Palabra> listPalabras,
                                   onItemClickListener itemClickListener,
                                   onImageButtonClickListener imageButtonClickListener) {
        this.listPalabras = listPalabras;
        this.itemClickListener = itemClickListener;
        this.imageButtonClickListener = imageButtonClickListener;
    }

    @NonNull
    @Override
    public RecyclerPalabrasAdapter.RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.palabra_recycler_view, parent, false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerPalabrasAdapter.RecyclerDataHolder holder, int position) {
        holder.assignData(listPalabras.get(position), itemClickListener, imageButtonClickListener);
    }

    @Override
    public int getItemCount() {
        return listPalabras.size();
    }

    public class RecyclerDataHolder extends RecyclerView.ViewHolder {

        TextView word;
        ImageView image;
        ImageButton btnFavorito;
        LinearLayout linearLayout_palabra;
        LinearLayout linearLayout_image;

        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
            word = itemView.findViewById(R.id.wordPalabra_textView);
            image = itemView.findViewById(R.id.imagenPalabra_imageView);
            btnFavorito = itemView.findViewById(R.id.btnFavorito);
            linearLayout_palabra = itemView.findViewById(R.id.palabra_LinearLayout);
            linearLayout_image = itemView.findViewById(R.id.image_LinearLayout);
        }

        public void assignData(Palabra palabra,
                               onItemClickListener onItemClickListener,
                               onImageButtonClickListener onImageButtonClickListener) {
            word.setText(palabra.getDefinicion());
            image.setImageResource(palabra.getImagen());
            updateImageButtonState(btnFavorito, palabra.getFavorito());

            itemView.setOnClickListener(view -> onItemClickListener.onItemClickListener(palabra));
            btnFavorito.setOnClickListener(view -> {
                boolean newSelectedState = !palabra.getFavorito();
                updateImageButtonState(btnFavorito, newSelectedState);
                onImageButtonClickListener.onImageButtonClickListener(palabra);
            });
        }

        private void updateImageButtonState(ImageButton imageButton, boolean isSelected) {
            imageButton.setSelected(isSelected);
            if (isSelected) {
                imageButton.setImageResource(R.drawable.heart_red); // Replace with your red heart drawable
            } else {
                imageButton.setImageResource(R.drawable.heart); // Replace with your normal heart drawable
            }
        }
    }

    public interface onItemClickListener {
        void onItemClickListener(Palabra palabra);
    }

    public interface onImageButtonClickListener {
        void onImageButtonClickListener(Palabra palabra);
    }
}
