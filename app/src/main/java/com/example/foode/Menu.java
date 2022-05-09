package com.example.foode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.Recyclerview);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new ModelClass(R.drawable.burger,"Burger"));
        userList.add(new ModelClass(R.drawable.sandwich,"Sandwich"));
        userList.add(new ModelClass(R.drawable.shawarma,"Shawarma"));
        userList.add(new ModelClass(R.drawable.piza,"Pizza"));
        userList.add(new ModelClass(R.drawable.nuggets,"Nuggets"));
        userList.add(new ModelClass(R.drawable.fries,"Fries"));
        userList.add(new ModelClass(R.drawable.hotdrinks,"HotDrinks"));
        userList.add(new ModelClass(R.drawable.drinks,"Drinks"));
        userList.add(new ModelClass(R.drawable.icecream,"IceCream"));
        userList.add(new ModelClass(R.drawable.candiments,"Candiments"));



    }
}