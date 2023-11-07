package com.example.staggeredgirdviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.staggeredgirdviewex.adapter.FruitsAdapter;
import com.example.staggeredgirdviewex.model.FruitsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    FruitsAdapter fruitsAdapter;
    List<FruitsModel> fruitsModelList;
    StaggeredGridLayoutManager staggeredGridLayoutManager;

    int[] fruitsImage = new  int[]{
            R.drawable.aa,
            R.drawable.bb,
            R.drawable.cc,
            R.drawable.dd,
            R.drawable.ee,
            R.drawable.ff,
            R.drawable.gg,
            R.drawable.hh,
            R.drawable.ii,
            R.drawable.jj,
            R.drawable.kk,
            R.drawable.aa,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        fruitsModelList = new ArrayList<>();

        fruitsAdapter = new FruitsAdapter(this,fruitsModelList);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(fruitsAdapter);
        IntializedataIntoRecyclerView();

    }
    private void IntializedataIntoRecyclerView(){

        FruitsModel fruitsModel = new FruitsModel("Banana", fruitsImage[0]);
        FruitsModel fruitsModel1 = new FruitsModel("Mango", fruitsImage[1]);
        FruitsModel fruitsModel2 = new FruitsModel("Apple", fruitsImage[2]);
        FruitsModel fruitsModel3 = new FruitsModel("Kiwi", fruitsImage[3]);
        FruitsModel fruitsModel4 = new FruitsModel("Banana", fruitsImage[4]);
        FruitsModel fruitsModel5 = new FruitsModel("Graphes", fruitsImage[5]);
        FruitsModel fruitsModel6 = new FruitsModel("WaterMelon", fruitsImage[6]);
        FruitsModel fruitsModel7 = new FruitsModel("Banana", fruitsImage[7]);
        FruitsModel fruitsModel8 = new FruitsModel("Banana", fruitsImage[8]);
        FruitsModel fruitsModel9 = new FruitsModel("Banana", fruitsImage[9]);
        FruitsModel fruitsModel10 = new FruitsModel("Banana", fruitsImage[10]);
        FruitsModel fruitsModel11 = new FruitsModel("Banana", fruitsImage[11]);

        fruitsModelList.add(fruitsModel);
        fruitsModelList.add(fruitsModel1);
        fruitsModelList.add(fruitsModel2);
        fruitsModelList.add(fruitsModel3);
        fruitsModelList.add(fruitsModel4);
        fruitsModelList.add(fruitsModel5);
        fruitsModelList.add(fruitsModel6);
        fruitsModelList.add(fruitsModel7);
        fruitsModelList.add(fruitsModel8);
        fruitsModelList.add(fruitsModel9);
        fruitsModelList.add(fruitsModel10);
        fruitsModelList.add(fruitsModel11);



        fruitsAdapter.notifyDataSetChanged();

    }
}