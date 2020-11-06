package com.example.myapplication;

import android.nfc.Tag;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MiPrimerFragmento extends Fragment {

    public MiPrimerFragmento() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("PruebaFragmentos", "MiPrimerFragmento.onStart");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("PruebaFragmentos", "MiPrimerFragmento.onCreate");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("PruebaFragmentos", "MiPrimerFragmento.onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("PruebaFragmentos", "MiPrimerFragmento.onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("PruebaFragmentos", "MiPrimerFragmento.onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("PruebaFragmentos", "MiPrimerFragmento.onDestroy");
    }

    TextView tv;
    Button button;
    int i = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("PruebaFragmentos", "MiPrimerFragmento.onCreateView");
        // Inflate the layout for this fragment
        View vista =  inflater.inflate(R.layout.fragment_mi_primer_fragmento, container, false);
        tv = vista.findViewById(R.id.labelFragmento);
        button = vista.findViewById(R.id.boton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Pulsado: " + i++);
            }
        });

        return vista;
    }

    public void setMensaje(String mensaje) {
        tv.setText(mensaje);
    }
}