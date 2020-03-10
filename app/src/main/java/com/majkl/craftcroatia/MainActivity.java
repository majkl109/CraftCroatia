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

        data.add(new BeerData("Neposlušna", "Zadar", R.drawable.neposlusna));
        data.add(new BeerData("BuraBrew", "Poreč", R.drawable.bura_brew));
        data.add(new BeerData("Lepi decki", "Zagreb", R.drawable.lepi_decki_waitapu));
        data.add(new BeerData("Nova runda", "Zagreb", R.drawable.nova_runda));
        data.add(new BeerData("Zmajska", "Zagreb", R.drawable.zmajsko));
        data.add(new BeerData("Barba", "Split", R.drawable.barba));
        data.add(new BeerData("Medvedgrad", "Zagreb", R.drawable.medvedgrad));
        data.add(new BeerData("Varionica", "Zagreb", R.drawable.varionica));
        data.add(new BeerData("Visibaba", "Zagreb", R.drawable.visibaba));
        data.add(new BeerData("Garden", "Zagreb", R.drawable.garden));
        data.add(new BeerData("Crafter's", "Leprovice", R.drawable.crafters));

        return  data;
    }


    @Override
    public void onItemClicked(BeerData item, int position) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

    }
}
