package com.majkl.craftcroatia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class BeerAdapter extends RecyclerView.Adapter<BeerAdapter.ViewHolder> {

    private ArrayList<BeerData> data;
    private IOnItemClicked listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_beer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(ArrayList<BeerData> data) {
        this.data = new ArrayList<>();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private TextView address;
        private ImageView drawable;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.title);
            address = itemView.findViewById(R.id.address);
            drawable = itemView.findViewById(R.id.image);
        }

        public void bindData(BeerData beerData) {
            title.setText(beerData.getTitle());
            address.setText(beerData.getAddress());
            drawable.setImageResource(beerData.getDrawable());
        }

        @Override
        public void onClick(View view) {
            listener.onItemClicked(data.get(getAdapterPosition()), getAdapterPosition());

        }
    }

    public interface IOnItemClicked {
        void onItemClicked(BeerData item, int position);
    }

    public void setListener(IOnItemClicked listener) {
        this.listener = listener;
    }
}
