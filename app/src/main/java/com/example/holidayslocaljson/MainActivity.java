package com.example.holidayslocaljson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Object> viewItems = new ArrayList<>();

    private RecyclerView.Adapter recycleAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recycleAdapter = new RecycleAdapter(this, viewItems);
        recyclerView.setAdapter(recycleAdapter);

        addItemsFromJSON();
    }

    private void addItemsFromJSON() {
    }

    private String readJSONDataFromFile() throws IOException {
        InputStream inputStream = null;
        StringBuilder stringBuilder = new StringBuilder();


    }
}