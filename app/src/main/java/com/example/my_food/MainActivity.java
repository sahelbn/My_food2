package com.example.my_food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ModelFood> FoodList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=(RecyclerView)findViewById(R.id.rv);
        FoodList=new ArrayList<>();

        FoodList.add(new ModelFood(R.drawable.cityy , "name1" , "gtg" , " 4"));
        FoodList.add(new ModelFood(R.drawable.lallipop , "name2" , "hgggg" , " 5"));
        FoodList.add(new ModelFood(R.drawable.picfour1 , "name3" , "hbvcg" , " 6"));
        FoodList.add(new ModelFood(R.drawable.seven1 , "name4" , "hffg" , " 7"));
        FoodList.add(new ModelFood(R.drawable.six1 , "name5" , "hfffg" , " 8"));


        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager= layoutManager;

       recyclerView.setLayoutManager(rvLayoutManager);
        Foodadapter adapter=new Foodadapter(this,FoodList);
        recyclerView.setAdapter(adapter);
    }
}
