package com.example.networking;


import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MountainViewHolder>  {
    private ArrayList<Mountain> mountains;

    public RecyclerViewAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mountain_list, parent, false);
        return new MountainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.MountainViewHolder holder, int position) {
        String name = mountains.get(position).getName();
        String location = mountains.get(position).getLocation();
        Integer size = mountains.get(position).getSize();
        holder.name.setText(name);
        holder.location.setText((location));
        holder.size.setText(size.toString());
        holder.wiki.setText(mountains.get(position).getAuxdata().getWiki());

    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {

        private TextView name, location, size, wiki;

        public MountainViewHolder(final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Name);
            location = itemView.findViewById(R.id.location);
            size = itemView.findViewById(R.id.height);
            wiki = itemView.findViewById(R.id.wiki);
        }

    }
}
