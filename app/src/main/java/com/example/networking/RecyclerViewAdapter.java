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

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.PeakViewHolder> {
    private ArrayList<Mountain> mountains;

    public RecyclerViewAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.PeakViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mountain_list, parent, false);
        return new PeakViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.PeakViewHolder holder, int position) {
        String mountain = mountains.get(position).getMountain();
        String location = mountains.get(position).getLocation();
        Integer height = mountains.get(position).getHeight();
        Integer cost = mountains.get(position).getCost();

        holder.mountain.setText(mountain);
        holder.location.setText((location));
        holder.height.setText(height.toString());
        holder.cost.setText(cost);
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

    public class PeakViewHolder extends RecyclerView.ViewHolder{
        TextView mountain, location, height, cost;
        ImageView image_view;

        public PeakViewHolder(@NonNull View itemView) {
            super(itemView);

            mountain = itemView.findViewById(R.id.mountain);
            location = itemView.findViewById(R.id.location);
            height = itemView.findViewById(R.id.height);
            cost = itemView.findViewById(R.id.cost);
            image_view = itemView.findViewById(R.id.image_view);
        }
    }
}
