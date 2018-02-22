package com.example.didact.ejercicioserieslistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class listaseriesactivity extends AppCompatActivity {

    static final String EXTRA_SERIES = "Series";



    ListView Lvseries;
    ArrayList<Serie> Lista_serie = new ArrayList<Serie>();
    TextView tvnombre, tvtemporadas,tvresumen, tvaño, tvcapitulos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaseriesactivity);

        tvnombre=(TextView)findViewById(R.id.tvnombre);
        tvtemporadas=(TextView)findViewById(R.id.tvtemporadas);
        tvresumen=(TextView)findViewById(R.id.tvresumen);
        tvaño=(TextView)findViewById(R.id.tvaño);
        tvcapitulos=(TextView)findViewById(R.id.tvcapitulos);





        Bundle b = getIntent().getExtras();

        if(b!=null){

            Serie r = b.getParcelable(registroserieactivity.EXTRA_SERIES);

            String nombre = r.getNombre();
            String temporadas = r.getTemporadas();
            String capitulos = r.getCapitulos();
            String año = r.getAño();
            String resumen=r.getResumen();






            tvnombre.setText("Serie"+nombre);
            tvtemporadas.setText("Temporadas"+temporadas);
            tvaño.setText("Año"+año);
            tvcapitulos.setText("Capítulos"+capitulos);
            tvresumen.setText("Resumen"+resumen);


        }




        cargarDatos();
        Lvseries = (ListView)findViewById(R.id.Lvseries);
        Adaptadorseries adaptadorCoches=new Adaptadorseries(this,
                Lista_serie);
        Lvseries.setAdapter(adaptadorCoches);


        if(Lista_serie.get(position).getGenero().equals("Familiar")){
            ImageView imggenero = (ImageView)item.findViewById(R.id.imggenero);
            imggenero.setImageResource(R.drawable.familiar);
        }else if(Lista_serie.get(position).getGenero().equals("Acción")){
            ImageView imggenero = (ImageView)item.findViewById(R.id.imggenero);
            imggenero.setImageResource(R.id.accion);
        }





        Lvseries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Serie r =((Serie)parent.getItemAtPosition(position));
               Intent i=new Intent(getApplicationContext(),finalactivity.class);
               i.putExtra(EXTRA_SERIES, r);
               startActivity(i);
            }
        });


    }






    private void cargarDatos(){
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Simpsons","4","x10","2005","amor",""));
        Lista_serie.add(new Serie("Los Borgia","4","15","2005","familia",""));
        Lista_serie.add(new Serie("Sons of Anarchy","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("Vikings","4","x10","2005","terror",""));
        Lista_serie.add(new Serie("Shameless","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));

}

}
