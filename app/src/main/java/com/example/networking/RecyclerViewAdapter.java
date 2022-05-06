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

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Mountain> mountains;

    public RecyclerViewAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mountain_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        String mountain = mountains.get(position).getMountain();
        String location = mountains.get(position).getLocation();
        Integer height = mountains.get(position).getHeight();
        Integer cost = mountains.get(position).getCost();
        String wiki = mountains.get(position).getAuxdata().getWiki();

        holder.mountain.setText(mountain);
        holder.location.setText((location));
        holder.height.setText(height.toString());
        holder.cost.setText(cost);
        holder.wiki.setText(wiki);
        Picasso.get()
                .load(mountains.get(position).getAuxdata().getImg())
                .into(holder.image_view, new Callback() {
                    @Override
                    public void onSuccess() {}

                    @Override
                    public void onError(Exception e) {
                        Picasso.get().load("https://i.ibb.co/wC7Q8zm/Untitled.png").into(holder.image_view);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }


    public ArrayList<Mountain> getMountains() {
        return mountains;
    }

    public void getMountains(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView mountain, location, height, cost, wiki;
        ImageView image_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mountain = itemView.findViewById(R.id.mountain);
            location = itemView.findViewById(R.id.location);
            height = itemView.findViewById(R.id.height);
            cost = itemView.findViewById(R.id.cost);
            image_view = itemView.findViewById(R.id.image_view);
        }
    }
}
