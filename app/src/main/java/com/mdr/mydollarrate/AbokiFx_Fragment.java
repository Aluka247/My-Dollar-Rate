package com.mdr.mydollarrate;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class AbokiFx_Fragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aboki_fx_, container, false);

        CardView cardViewUsd = (CardView) view.findViewById(R.id.card_usd);

        cardViewUsd.setOnClickListener(view1 -> {

            Toast.makeText(getContext(),"United State Currency",Toast.LENGTH_LONG).show();

        });

        return view;
    }
}