package com.example.didact.ejercicioserieslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class finalactivity extends AppCompatActivity {

    TextView tvfinalnombre,tvfinalgenero,tvfinalanio,tvfinalcapitulos,tvfinaltemporadas,tvfinalresumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalactivity);

        tvfinalnombre=(TextView)findViewById(R.id.tvfinalnombre);
        tvfinalgenero=(TextView)findViewById(R.id.tvfinalgenero);
        tvfinalanio=(TextView)findViewById(R.id.tvfinalanio);
        tvfinalcapitulos=(TextView)findViewById(R.id.tvfinalcapitulos);
        tvfinaltemporadas=(TextView)findViewById(R.id.tvfinaltemporadas);
        tvfinalresumen=(TextView)findViewById(R.id.tvfinalresumen);

        Bundle b = getIntent().getExtras();

        if(b!=null){

            Serie r = b.getParcelable(listaseriesactivity.EXTRA_SERIES);


            String nombre = r.getNombre();
            String temporadas = r.getTemporadas();
            String capitulos = r.getCapitulos();
            String año = r.getAño();
            String genero = r.getGenero();
            String resumen = r.getResumen();


            tvfinalnombre.setText(nombre);
            tvfinalgenero.setText(genero);
            tvfinalanio.setText(año);
            tvfinalcapitulos.setText(capitulos);
            tvfinaltemporadas.setText(temporadas);
            tvfinalresumen.setText(resumen);


        }






    }
}
