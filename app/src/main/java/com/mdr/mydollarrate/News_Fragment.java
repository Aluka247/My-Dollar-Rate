package com.mdr.mydollarrate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class News_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news_, container, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView cardViewNews1 = (CardView)  view.findViewById(R.id.card_news1);

        cardViewNews1.setOnClickListener(view1 -> {
            Intent i = new Intent(getActivity(), MainNews_Activity.class);
            startActivity(i);
        });

        return view;


    }
}