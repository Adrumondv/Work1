package com.example.alexanderdrumond.work1;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class WriteFragment extends Fragment {


    public WriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_write, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final Button writeus = (Button) view.findViewById(R.id.writeusBtn);
        final EditText editText = (EditText) view.findViewById(R.id.editTxt);
        final Button send = (Button) view.findViewById(R.id.sendBtn);

        writeus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeus.setVisibility(View.GONE);
                editText.setVisibility(View.VISIBLE);
                send.setVisibility(View.VISIBLE);
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("*/*");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]
                        {"stratton.propiedades@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "App Stratton House");
                intent.putExtra(Intent.EXTRA_TEXT, editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
