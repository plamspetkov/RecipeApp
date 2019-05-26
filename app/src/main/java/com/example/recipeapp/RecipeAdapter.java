package com.example.recipeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {

    private Context mContext;
    private List<Upload> mUploads;

    public RecipeAdapter(Context context, List<Upload> uploads) {
        mContext = context;
        mUploads = uploads;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.card_view, parent, false);
        return new RecipeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Upload uploadCurrent = mUploads.get(position);
        holder.textViewName.setText(uploadCurrent.getName());
        holder.textViewIngredients.setText(uploadCurrent.getIngredients());
        holder.textViewDescription.setText(uploadCurrent.getDescription());
        Picasso.with(mContext)
                .load(uploadCurrent.getImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class RecipeViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName;
        public TextView textViewIngredients;
        public TextView textViewDescription;
        public ImageView imageView;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.text_view_name);
            textViewIngredients = itemView.findViewById(R.id.text_view_ingredients);
            textViewDescription = itemView.findViewById(R.id.text_view_description);
            imageView = itemView.findViewById(R.id.image_view_upload);
        }
    }



}
