package com.example.appsignos.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerPalabrasAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.RecyclerDataHolder> {

    List<Item> listItems;
    onItemClickListener listener;

    public RecyclerDataAdapter(List<Item> listItems, onItemClickListener listener){
        this.listItems = listItems;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataHolder holder, int position) {
        holder.assignData(listItems.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }







    public class RecyclerDataHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;
        LinearLayout linear_text;
        LinearLayout linear_image;
        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.idItemTitle);
            image = itemView.findViewById(R.id.idItemImage);
            linear_image = itemView.findViewById(R.id.layout_image);
            linear_text = itemView.findViewById(R.id.layout_text);
        }

        public void assignData(Item item, onItemClickListener onItemClickListener) {
            title.setText(item.getTitle());
            image.setImageResource(item.getImage());
            linear_text.setOrientation(LinearLayout.HORIZONTAL);
            linear_image.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), item.getPrimaryColor()));
            linear_text.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), item.getSecondaryColor()));
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClickListener(item);
                }
            });
        }
    }
    public interface onItemClickListener{
        void onItemClickListener(Item item);
    }
}
