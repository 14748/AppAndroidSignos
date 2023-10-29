package com.example.appsignos.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appsignos.models.Categoria;
import com.example.appsignos.R;

import java.util.List;

public class RecyclerCategoriasAdapter extends RecyclerView.Adapter<RecyclerCategoriasAdapter.ViewHolder> {

    private List<Categoria> categorias;
    private OnCategoriaClickListener listener;

    public RecyclerCategoriasAdapter(List<Categoria> categorias, OnCategoriaClickListener listener) {
        this.categorias = categorias;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoria_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Categoria categoria = categorias.get(position);
        holder.txtNombre.setText(categoria.getNombre());
        holder.imageView.setImageResource(categoria.getImagenResourceId());


        holder.itemView.setOnClickListener(view -> {
            if (listener != null) {
                listener.onCategoriaClick(categoria);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categorias.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNombre;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgCategoria);
            txtNombre = itemView.findViewById(R.id.txtCategoria);
        }
    }


    public interface OnCategoriaClickListener {
        void onCategoriaClick(Categoria categoria);
    }
}
