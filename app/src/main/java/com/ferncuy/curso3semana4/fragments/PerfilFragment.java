/*
 * Copyright (c) 2020
 * By Pablo Fernandez
 * ferning98@gmail.com
 */

package com.ferncuy.curso3semana4.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ferncuy.curso3semana4.R;
import com.ferncuy.curso3semana4.adapter.MascotaAdaptador;
import com.ferncuy.curso3semana4.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascota> miMascota;
    private RecyclerView fotosMiMascota;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        fotosMiMascota = view.findViewById(R.id.recyclerFragmentMiMascota);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        fotosMiMascota.setLayoutManager(gridLayoutManager);

        inicializarListaMiMascota();
        inicializarAdaptador();

        // Inflate the layout for this fragment
        return view;
    }

    public void inicializarListaMiMascota() {

        miMascota = new ArrayList<Mascota>();

        miMascota.add(new Mascota(R.drawable.dog1, "Rora"));
        miMascota.add(new Mascota(R.drawable.dog1, "Rora"));
        miMascota.add(new Mascota(R.drawable.dog1, "Rora"));
        miMascota.add(new Mascota(R.drawable.dog1, "Rora"));
        miMascota.add(new Mascota(R.drawable.dog1, "Rora"));
    }


    public void inicializarAdaptador() {

        MascotaAdaptador adaptador = new MascotaAdaptador(miMascota, getActivity());
        fotosMiMascota.setAdapter(adaptador);

    }

}
