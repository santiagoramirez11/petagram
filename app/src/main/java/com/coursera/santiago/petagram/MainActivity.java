package com.coursera.santiago.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMascostas;
    ImageButton ibFavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = findViewById(R.id.miActionBar);
        ibFavoritos = miActionBar.findViewById(R.id.ibFavoritos);

        ibFavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
                startActivity(intent);
            }
        });

        setSupportActionBar(miActionBar);



        rvMascostas = findViewById(R.id.rvMascostas);

        LinearLayoutManager llmMascota = new LinearLayoutManager(this);
        llmMascota.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascostas.setLayoutManager(llmMascota);
        crearListadoMascota();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(ListadoMascotas.getMascotas());
        rvMascostas.setAdapter(adaptador);
    }


    public void crearListadoMascota(){
        if(ListadoMascotas.getMascotas().isEmpty()){
            ArrayList<Mascota> alMascotas = new ArrayList<Mascota>();
            alMascotas.add(new Mascota("Bobby",R.drawable.cachorro1,0));
            alMascotas.add(new Mascota("Catty",R.drawable.cachorro2,0));
            alMascotas.add(new Mascota("Tommy",R.drawable.cachorro3,0));
            alMascotas.add(new Mascota("Tom",R.drawable.cachorro4,0));
            alMascotas.add(new Mascota("Lazy",R.drawable.cachorro5,0));
            alMascotas.add(new Mascota("Doki",R.drawable.cachorro6,0));
            alMascotas.add(new Mascota("Samy",R.drawable.cachorro7,0));
            ListadoMascotas.setMascotas(alMascotas);
        }
    }
}
