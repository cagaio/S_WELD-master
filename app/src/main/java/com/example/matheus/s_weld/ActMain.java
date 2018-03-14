package com.example.matheus.s_weld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActMain extends AppCompatActivity implements View.OnClickListener{

    private CardView processos,consumiveis,metal,simbologia,resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        processos  = (CardView) findViewById(R.id.id_cardview_processos);
        consumiveis = (CardView) findViewById(R.id.id_cardview_consumiveis);
        metal = (CardView) findViewById(R.id.id_cardview_metal);
        simbologia = (CardView) findViewById(R.id.id_cardview_simbologia);
        resultado = (CardView) findViewById(R.id.id_cardview_resultado);

        processos.setOnClickListener(this);
        consumiveis.setOnClickListener(this);
        metal.setOnClickListener(this);
        simbologia.setOnClickListener(this);
        resultado.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.id_cardview_processos: i = new Intent(this, Processo.class);startActivity(i); break;
            case R.id.id_cardview_consumiveis: i = new Intent(this, Consumiveis.class);startActivity(i); break;
            case R.id.id_cardview_metal: i = new Intent(this, Metal.class);startActivity(i); break;
            case R.id.id_cardview_simbologia: i = new Intent(this, Simbologia.class);startActivity(i); break;
            case R.id.id_cardview_resultado: i = new Intent(this, ComputacaodeDados.class);startActivity(i); break;
        }
    }
}
