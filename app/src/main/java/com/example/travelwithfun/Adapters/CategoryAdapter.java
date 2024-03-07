package com.example.travelwithfun.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.travelwithfun.Domains.CategoryDomain;
import com.example.travelwithfun.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    public CategoryAdapter(ArrayList<CategoryDomain> items) {
        this.items = items;
    }

    ArrayList<CategoryDomain> items;
    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
holder.titleTxt.setText(items.get(position).getTitle());
int drawableRecourseId=holder.itemView.getResources().getIdentifier(items.get(position).getPicPath(),"drawable",holder.itemView.getContext().getPackageName());
Glide.with(holder.itemView.getContext()).load(drawableRecourseId).into(holder.picImg);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleTxt;
        ImageView picImg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTxt=itemView.findViewById(R.id.titleTxt);
            picImg=itemView.findViewById(R.id.catImg);
        }
    }
}
