/*
 * Copyright (c) 2020
 * By Pablo Fernandez
 * ferning98@gmail.com
 */

package com.ferncuy.curso3semana4.layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ferncuy.curso3semana4.R;
import com.ferncuy.curso3semana4.adapter.MascotaAdaptador;
import com.ferncuy.curso3semana4.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotasFAV;
    private RecyclerView listaMascotasFAV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        Toolbar actionBar = findViewById(R.id.actionbar);
        setSupportActionBar(actionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotasFAV = findViewById(R.id.recyclerListaMascotasFAV);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasFAV.setLayoutManager(linearLayoutManager);
        inicializarListaMascotas();
        inicializarAdaptador();


    }

    public void inicializarAdaptador() {

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotasFAV, this);
        listaMascotasFAV.setAdapter(adaptador);

    }

    public void inicializarListaMascotas() {

        mascotasFAV = new ArrayList<Mascota>();

        mascotasFAV.add(new Mascota(R.drawable.dog1, "Rora"));
        mascotasFAV.add(new Mascota(R.drawable.dog2, "Roko"));
        mascotasFAV.add(new Mascota(R.drawable.dog3, "Ricardo"));
        mascotasFAV.add(new Mascota(R.drawable.dog4, "Lulu"));
        mascotasFAV.add(new Mascota(R.drawable.dog5, "Cali"));
    }


}