package com.example.recyclerviewteste.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewteste.model.Carro;
import com.example.recyclerviewteste.viewHolder.CarroViewHolder;
import com.example.recyclerviewteste.R;

import java.util.List;

public class CarroListAdapter extends RecyclerView.Adapter<CarroViewHolder> {

    private List<Carro> listaCarros;

    public CarroListAdapter(List<Carro> lista) {
        listaCarros = lista;
    }

    public CarroListAdapter() {

    }

    @NonNull
    @Override
    public CarroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carroView = inflater.inflate(R.layout.row_carro_list, parent, false);
        return new CarroViewHolder(carroView);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroViewHolder holder, int position) {
        Carro carro = listaCarros.get(position);
        holder.bindData(carro);

    }

    @Override
    public int getItemCount() {
        return listaCarros.size();
    }
}
