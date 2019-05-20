package com.example.my_food;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.Inflater;




public class Foodadapter extends RecyclerView.Adapter<Foodadapter.ViewHolder>  {

    private Context mContext;
    private List<ModelFood> modelList;

    public Foodadapter(Context mContext, List<ModelFood> modelList) {
        this.mContext = mContext;
        this.modelList = modelList;
    }

    public Foodadapter() {
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = (View) LayoutInflater.from(mContext).inflate(R.layout.rv_food_item,parent,false);
        ViewHolder holder = new ViewHolder(itemView);
        return holder;



    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        ModelFood itemfood=modelList.get(i);


        ImageView image=viewHolder.item_image1;
        TextView item_name,item_place,item_price;
        TextView name = viewHolder.item_name;
        TextView place=viewHolder.item_place;
        TextView price=viewHolder.item_price;

        image.setImageResource(modelList.get(i).getImage());

        name.setText(itemfood.getName());
        place.setText(itemfood.getPlace());
        price.setText(itemfood.getPrice());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }




    public class ViewHolder extends  RecyclerView.ViewHolder{

        ImageView item_image1;
        TextView item_name,item_place,item_price;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            item_image1=(ImageView) itemView.findViewById(R.id.item_image1);
            item_name=(TextView)itemView.findViewById(R.id.item_name);
            item_place=(TextView)itemView.findViewById(R.id.item_place);
            item_price=(TextView)itemView.findViewById(R.id.item_price);
        }
    }
}




