package com.example.recyclerviewteste.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AliasActivity;
import android.os.Bundle;

import com.example.recyclerviewteste.R;
import com.example.recyclerviewteste.adapter.CarroListAdapter;
import com.example.recyclerviewteste.data.CarroMock;
import com.example.recyclerviewteste.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mViewHolder.rv_carros = findViewById(R.id.rv_carros);

        CarroMock carroMock = new CarroMock();
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.addAll(carroMock.getListaCarros());
        
        //adapter
        CarroListAdapter carroListAdapter = new CarroListAdapter(listaCarros);
        mViewHolder.rv_carros.setAdapter(carroListAdapter);
        
        //Layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mViewHolder.rv_carros.setLayoutManager(linearLayoutManager);
    }
    
    private static class ViewHolder{
        RecyclerView rv_carros;
    }
}