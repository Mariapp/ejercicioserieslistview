package com.example.didact.ejercicioserieslistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class registroserieactivity extends AppCompatActivity {

    static final String EXTRA_SERIES = "Series";




    EditText etnombre,ettemporada,etcapitulos,etanio,etresumen;
    RadioGroup radiogenero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroserieactivity);

        etnombre=(EditText)findViewById(R.id.etnombre);
        ettemporada=(EditText)findViewById(R.id.ettemporada);
        etcapitulos=(EditText)findViewById(R.id.etcapitulos);
        etanio=(EditText)findViewById(R.id.etanio);
        etresumen=(EditText)findViewById(R.id.etresumen);

        radiogenero=(RadioGroup) findViewById(R.id.radiogenero);



    }

    public void btnconfirmarreserva(View view) {

        String nombre = etnombre.getText().toString();
        String temporada = ettemporada.getText().toString();
        String año = etanio.getText().toString();
        String capitulos = etcapitulos.getText().toString();
        String resumen = etresumen.getText().toString();
        int id = radiogenero.getCheckedRadioButtonId();






        if (nombre.equals("") || temporada.equals("") || capitulos.equals("") || año.equals("")|| id==-1) {
            Toast.makeText(getApplicationContext(), "Rellena todos los campos", Toast.LENGTH_LONG).show();
        }else{


        }


            Serie r = new Serie(nombre,temporada,capitulos,año,id+"",resumen);



                    Intent i=new Intent(getApplicationContext(),listaseriesactivity.class);
                    i.putExtra(EXTRA_SERIES, r);
                    startActivity(i);
        }

}