package com.example.my_food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ModelFood> foodList = new ArrayList<>();
    RecyclerView recyclerView;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init recycler
        recyclerView=(RecyclerView)findViewById(R.id.rv);

        //layout manager
        RecyclerView.LayoutManager rvLayoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rvLayoutManager);

        generateFoodData();
        //adapter
        Foodadapter adapter=new Foodadapter(this,foodList);
        recyclerView.setAdapter(adapter);





    }

    public void generateFoodData(){


        ModelFood foodList1 = new ModelFood(R.drawable.new51,"Hello","kasdl","dasdas","gfgfgfgf");
        foodList.add(foodList1);

       foodList.add(new ModelFood(R.drawable.lallipop , "name1" , "gtg" , " 1", "asdjkasj"));
       foodList.add(new ModelFood(R.drawable.lallipop , "name2" , "hgggg" , " 2","jjashjas"));
       foodList.add(new ModelFood(R.drawable.picfour1 , "name3" , "hbvcg" , " 3","jadjkajd"));
       foodList.add(new ModelFood(R.drawable.seven1 , "name4" , "hffg" , "4","jhashdjad"));
       foodList.add(new ModelFood(R.drawable.new4 , "name5" , "hfffg" , " 5","jhjsakhdhjsa"));
       foodList.add(new ModelFood(R.drawable.new11 , "name5" , "hfffg" , " 6","jasdkjkad"));
       foodList.add(new ModelFood(R.drawable.new21 , "name5" , "hfffg" , " 7","jhadsa"));
       foodList.add(new ModelFood(R.drawable.new31 , "name5" , "hfffg" , " 8","jaskljdakls"));
       foodList.add(new ModelFood(R.drawable.new51 , "name5" , "hfffg" , " 9","klaksjdkalsjd"));
    }
}
