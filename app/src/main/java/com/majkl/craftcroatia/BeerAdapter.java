package com.majkl.craftcroatia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BeerAdapter extends RecyclerView.Adapter<BeerAdapter.ViewHolder> {

    private ArrayList<BeerData> data;
    private IOnItemClicked listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_beer,parent,false);
       return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BeerAdapter.ViewHolder holder, int position, @NonNull List<Object> payloads) {
        holder.bindData(data.get(position));

    }



    @Override
    public int getItemCount() {
        return 0;
    }
}
