package com.majkl.craftcroatia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BeerAdapter.IOnItemClicked{

    private RecyclerView recyclerView;
    private BeerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        adapter = new BeerAdapter();
        adapter.setData(generateMockData());
        recyclerView.setAdapter(adapter);
        adapter.setListener(this);
    }

    private ArrayList<BeerData> generateMockData(){

        ArrayList<BeerData> data = new ArrayList<>();

        data.add(new BeerData("Neposlusna", "Zadar", R.drawable.neposlusna));
        data.add(new BeerData("BuraBrew", "Zadar", R.drawable.bura_brew));


        return  data;
    }


    @Override
    public void onItemClicked(BeerData item, int position) {
        Toast.makeText(this, "Beer clicked" + item.getTitle(), Toast.LENGTH_SHORT).show();

    }
}
