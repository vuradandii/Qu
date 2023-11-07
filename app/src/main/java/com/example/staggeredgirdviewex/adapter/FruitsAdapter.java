package com.example.staggeredgirdviewex.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.staggeredgirdviewex.R;
import com.example.staggeredgirdviewex.model.FruitsModel;

import java.time.Instant;
import java.util.List;

public class FruitsAdapter extends RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder> {
    Context context;
    List<FruitsModel> fruitsModelList;

    public FruitsAdapter(Context context, List<FruitsModel> fruitsModelList) {
        this.context = context;
        this.fruitsModelList = fruitsModelList;
    }

    @NonNull
    @Override
    public FruitsAdapter.FruitsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_list,parent,false);
        return new  FruitsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitsAdapter.FruitsViewHolder holder, int position) {

        Glide.with(context).load(fruitsModelList.get(position).getFruitsImage()).centerInside().into(holder.fruitsImage);

        holder.fruitsName.setText(fruitsModelList.get(position).getFruitsName());

    }

    @Override
    public int getItemCount() {
        return fruitsModelList.size();
    }
    public class FruitsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView fruitsName;
        ImageView fruitsImage;

        public FruitsViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitsName = itemView.findViewById(R.id.fruitsName);
            fruitsImage = itemView.findViewById(R.id.fruitsImage);
        }

        @Override
        public void onClick(View v) {

            if (getLayoutPosition() == 0){
                Toast.makeText(context, "You Clicked First Item", Toast.LENGTH_SHORT).show();
            }
        }
    }
}