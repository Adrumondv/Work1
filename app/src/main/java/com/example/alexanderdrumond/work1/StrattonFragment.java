package com.example.alexanderdrumond.work1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StrattonFragment extends Fragment {


    public StrattonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stratton, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button us = (Button) view.findViewById(R.id.usBtn);
        final ImageView stratton = (ImageView) view.findViewById(R.id.strattonImg);
        final TextView about = (TextView) view.findViewById(R.id.aboutTxt);

        us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                us.setVisibility(View.GONE);
                stratton.setVisibility(View.VISIBLE);
                about.setVisibility(View.VISIBLE);
            }
        });
    }
}
