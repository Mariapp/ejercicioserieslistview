package com.example.didact.ejercicioserieslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class listaseriesactivity extends AppCompatActivity {
    ListView Lvseries;
    ArrayList<Serie> Lista_serie = new ArrayList<Serie>();
    TextView tvnombre, tvtemporadas,resumen, tvaño, tvcapitulos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaseriesactivity);

        tvnombre=(TextView)findViewById(R.id.tvnombre);
        tvtemporadas=(TextView)findViewById(R.id.tvtemporadas);
        resumen=(TextView)findViewById(R.id.resumen);
        tvaño=(TextView)findViewById(R.id.tvaño);
        tvcapitulos=(TextView)findViewById(R.id.tvcapitulos);



        Bundle b = getIntent().getExtras();

        if(b!=null){

            Serie r = b.getParcelable(registroserieactivity.EXTRA_SERIES);

            String nombre = r.getNombre();
            String temporadas = r.getTemporadas();
            String capitulos = r.getCapitulos();
            String año = r.getAño();




            tvnombre.setText(nombre);
            tvtemporadas.setText(temporadas);
            tvaño.setText(año);
            tvcapitulos.setText(capitulos);

        }




        cargarDatos();
        Lvseries = (ListView)findViewById(R.id.Lvseries);
        Adaptadorseries adaptadorCoches=new Adaptadorseries(this,
                Lista_serie);
        Lvseries.setAdapter(adaptadorCoches);
    }






    private void cargarDatos(){
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","amor",""));
        Lista_serie.add(new Serie("lkasdñalksd","4","15","2005","familia",""));
        Lista_serie.add(new Serie("The zxczxczxc","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","terror",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));
        Lista_serie.add(new Serie("The Tudors","4","x10","2005","accion",""));

}

}
