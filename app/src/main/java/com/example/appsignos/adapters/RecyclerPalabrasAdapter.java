package com.example.appsignos.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerPalabrasAdapter extends RecyclerView.Adapter<RecyclerPalabrasAdapter.RecyclerDataHolder> {


    @NonNull
    @Override
    public RecyclerPalabrasAdapter.RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerPalabrasAdapter.RecyclerDataHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerDataHolder extends RecyclerView.ViewHolder {
        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
